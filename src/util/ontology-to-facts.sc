//> using scala "2.13.16"
//> using dep "net.sourceforge.owlapi:owlapi-distribution:4.5.29"

import java.io.BufferedOutputStream
import java.io.OutputStream
import java.nio.charset.StandardCharsets
import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.nio.file.attribute.PosixFilePermissions
import org.semanticweb.owlapi.apibinding.OWLManager
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat
import org.semanticweb.owlapi.formats.NTriplesDocumentFormat
import org.semanticweb.owlapi.formats.OBODocumentFormat
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat
import org.semanticweb.owlapi.formats.TurtleDocumentFormat
import org.semanticweb.owlapi.io.FileDocumentSource
import org.semanticweb.owlapi.model.IRI
import org.semanticweb.owlapi.model.MissingImportHandlingStrategy
import org.semanticweb.owlapi.model.OWLDocumentFormat
import org.semanticweb.owlapi.model.OWLOntologyIRIMapper
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration

/** Convert OWLAPI's N-Triples stream to Souffle's three-column fact format.
  *
  * This operates on bytes and reuses a single line buffer: only the two field
  * separators and the final ` .` differ between N-Triples and the fact file.
  */
final class FactsOutputStream(underlying: OutputStream)
    extends OutputStream {
  private var buffer = new Array[Byte](8192)
  private var length = 0
  private var finished = false
  private var count = 0L

  def factCount: Long = count

  override def write(value: Int): Unit = {
    if (value == '\n') emitLine()
    else append(value.toByte)
  }

  override def write(bytes: Array[Byte], offset: Int, byteCount: Int): Unit = {
    if (bytes == null) throw new NullPointerException("bytes")
    if (offset < 0 || byteCount < 0 || byteCount > bytes.length - offset)
      throw new IndexOutOfBoundsException()

    val limit = offset + byteCount
    var chunkStart = offset
    var index = offset
    while (index < limit) {
      if (bytes(index) == '\n') {
        append(bytes, chunkStart, index - chunkStart)
        emitLine()
        chunkStart = index + 1
      }
      index += 1
    }
    append(bytes, chunkStart, limit - chunkStart)
  }

  def finish(): Unit = {
    if (!finished) {
      if (length > 0) emitLine()
      underlying.flush()
      finished = true
    }
  }

  override def flush(): Unit = underlying.flush()

  override def close(): Unit = {
    finish()
    underlying.close()
  }

  private def append(value: Byte): Unit = {
    ensureCapacity(length + 1)
    buffer(length) = value
    length += 1
  }

  private def append(bytes: Array[Byte], offset: Int, byteCount: Int): Unit = {
    if (byteCount > 0) {
      ensureCapacity(length + byteCount)
      System.arraycopy(bytes, offset, buffer, length, byteCount)
      length += byteCount
    }
  }

  private def ensureCapacity(required: Int): Unit = {
    if (required > buffer.length) {
      var nextLength = buffer.length * 2
      while (nextLength < required) nextLength *= 2
      buffer = java.util.Arrays.copyOf(buffer, nextLength)
    }
  }

  private def emitLine(): Unit = {
    var end = length
    if (end > 0 && buffer(end - 1) == '\r') end -= 1

    // OWLAPI's N-Triples renderer writes a short comment banner; comments are
    // not RDF statements and therefore are not Souffle facts.
    if (end > 0 && buffer(0) != '#') {
      val subjectEnd = indexOfSpace(0, end)
      val predicateEnd = indexOfSpace(subjectEnd + 1, end)
      val hasTerminator =
        end >= 2 && buffer(end - 2) == ' ' && buffer(end - 1) == '.'

      if (subjectEnd < 1 || predicateEnd <= subjectEnd + 1 || !hasTerminator)
        throw new IllegalArgumentException(
          "OWLAPI emitted an invalid N-Triples line: " +
            new String(buffer, 0, end, StandardCharsets.UTF_8)
        )

      buffer(subjectEnd) = '\t'.toByte
      buffer(predicateEnd) = '\t'.toByte
      buffer(end - 2) = '\n'.toByte
      underlying.write(buffer, 0, end - 1)
      count += 1
    }
    length = 0
  }

  private def indexOfSpace(from: Int, until: Int): Int = {
    var index = from
    while (index < until && buffer(index) != ' ') index += 1
    if (index < until) index else -1
  }
}

def moveIntoPlace(temp: Path, output: Path): Unit = {
  try
    Files.move(
      temp,
      output,
      StandardCopyOption.ATOMIC_MOVE,
      StandardCopyOption.REPLACE_EXISTING
    )
  catch {
    case _: AtomicMoveNotSupportedException =>
      Files.move(temp, output, StandardCopyOption.REPLACE_EXISTING)
  }
}

def documentFormat(input: Path): OWLDocumentFormat = {
  val fileName = input.getFileName.toString.toLowerCase(java.util.Locale.ROOT)
  if (fileName.endsWith(".obo")) new OBODocumentFormat()
  else if (fileName.endsWith(".ofn")) new FunctionalSyntaxDocumentFormat()
  else if (fileName.endsWith(".owl")) new RDFXMLDocumentFormat()
  else if (fileName.endsWith(".ttl")) new TurtleDocumentFormat()
  else
    throw new IllegalArgumentException(
      s"Unsupported ontology filename extension: ${input.getFileName}"
    )
}

if (args.length != 2) {
  System.err.println(
    "Usage: ontology-to-facts.sc INPUT.{obo,ofn,owl,ttl} OUTPUT.facts"
  )
  sys.exit(2)
}

val input = Paths.get(args(0)).toAbsolutePath.normalize()
val output = Paths.get(args(1)).toAbsolutePath.normalize()
if (!Files.isRegularFile(input)) {
  System.err.println(s"Input is not a regular file: $input")
  sys.exit(2)
}
if (input == output || (Files.exists(output) && Files.isSameFile(input, output))) {
  System.err.println("Input and output must be different files.")
  sys.exit(2)
}

val loaderConfig = new OWLOntologyLoaderConfiguration()
  .setMissingImportHandlingStrategy(MissingImportHandlingStrategy.SILENT)

val manager = OWLManager.createOWLOntologyManager()
// OWLAPI 4's OBO converter uses the manager default for import requests rather
// than the configuration passed to loadOntologyFromOntologyDocument.
manager.setOntologyLoaderConfiguration(loaderConfig)
// A null result would make OWLAPI fall back to loading each import IRI. Map
// every import to the local empty device instead, so SILENT handles the parse
// failure immediately without network access. The root ontology is loaded
// from FileDocumentSource and therefore bypasses this mapper.
val ignoredImportDocument = IRI.create(Paths.get("/dev/null").toUri)
manager.getIRIMappers.add(new OWLOntologyIRIMapper {
  override def getDocumentIRI(ontologyIRI: IRI): IRI =
    ignoredImportDocument
})
val ontology = manager.loadOntologyFromOntologyDocument(
  new FileDocumentSource(input.toFile, documentFormat(input)),
  loaderConfig
)

val outputParent =
  Option(output.getParent).getOrElse(Paths.get(".").toAbsolutePath)
val temp = Files.createTempFile(outputParent, s".${output.getFileName}.", ".tmp")
try {
  Files.setPosixFilePermissions(temp, PosixFilePermissions.fromString("rw-r--r--"))
} catch {
  case _: UnsupportedOperationException => ()
}
var moved = false
var factCount = 0L
try {
  val fileStream = new BufferedOutputStream(Files.newOutputStream(temp), 1024 * 1024)
  val factsStream = new FactsOutputStream(fileStream)
  try {
    val factsFormat = new NTriplesDocumentFormat()
    // The OBO header's subset and synonym typedefs rely on OWLAPI adding
    // missing annotation-property type declarations during RDF rendering.
    factsFormat.setAddMissingTypes(true)
    manager.saveOntology(ontology, factsFormat, factsStream)
    factsStream.finish()
    factCount = factsStream.factCount
  } finally factsStream.close()

  moveIntoPlace(temp, output)
  moved = true
} finally {
  if (!moved) Files.deleteIfExists(temp)
}

System.err.println(
  f"Wrote $factCount%,d RDF facts from ${ontology.getAxiomCount}%,d axioms " +
    s"(skipped ${ontology.getImportsDeclarations.size} imports)."
)
