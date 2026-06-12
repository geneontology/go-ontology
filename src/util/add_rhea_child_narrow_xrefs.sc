//> using scala "2.13.16"
//> using dep "net.sourceforge.owlapi:owlapi-distribution:4.5.29"
//> using dep "org.phenoscape::scowl:1.3.4"
//> using dep "com.outr::scribe-slf4j:2.7.12"
//> using dep "com.lihaoyi::os-lib:0.11.5"
//> using dep "org.obolibrary.robot:robot-core:1.9.7"

import org.phenoscape.scowl._
import org.obolibrary.robot.CatalogXmlIRIMapper
import org.semanticweb.owlapi.apibinding.OWLManager
import org.semanticweb.owlapi.model.IRI
import org.semanticweb.owlapi.model.OWLAxiom
import org.semanticweb.owlapi.model.OWLOntology
import org.semanticweb.owlapi.model.MissingImportHandlingStrategy
import org.semanticweb.owlapi.model.parameters.Imports
import scala.jdk.CollectionConverters._
import scribe.Logger

Logger("org.obolibrary.oboformat.parser.OBOFormatParser")
  .clearHandlers()
  .clearModifiers()
  .orphan()
  .replace()
Logger("org.obolibrary.obo2owl.OWLAPIOwl2Obo")
  .clearHandlers()
  .clearModifiers()
  .orphan()
  .replace()

val HasDbXref = AnnotationProperty(
  "http://www.geneontology.org/formats/oboInOwl#hasDbXref"
)
val Source = AnnotationProperty(
  "http://www.geneontology.org/formats/oboInOwl#source"
)
val RHEAPattern = raw"RHEA:(\d+)".r

/** Add child RHEA narrow xrefs to GO terms when the term already has the parent
  * RHEA xref as skos:exactMatch or skos:narrowMatch, and the child RHEA xref
  * does not already occur anywhere in the ontology.
  *
  * Examples:
  *   - Dry-run: cd src/ontology && scala-cli
  *     ../util/add_rhea_child_narrow_xrefs.sc
  *   - In-place update: cd src/ontology && scala-cli
  *     ../util/add_rhea_child_narrow_xrefs.sc -- --inPlace true
  */
final case class Config(
    goFile: os.Path = os.pwd / "go-edit.obo",
    catalogFile: os.Path = os.pwd / "catalog-v001.xml",
    relationshipsFile: os.Path =
      os.pwd / ".." / "resources" / "rhea-relationships.tsv",
    inPlace: Boolean = false,
    outFile: String = ""
)

def run(config: Config): Unit = {
  val goFile = config.goFile
  val catalogFile = config.catalogFile
  val relationshipsFile = config.relationshipsFile
  val inPlace = config.inPlace
  val outFile = config.outFile

  val manager = OWLManager.createOWLOntologyManager()
  manager.addIRIMapper(new CatalogXmlIRIMapper(catalogFile.toIO))
  val ontology = manager.loadOntology(IRI.create(goFile.toIO))
  val relationships = loadRelationships(relationshipsFile)

  val (existingRhea, parentByTerm) = collectRheaState(ontology)

  var seenRhea = existingRhea
  var candidatePairs = 0
  val additionsByTerm = scala.collection.mutable.Map
    .empty[IRI, scala.collection.mutable.Set[String]]

  for {
    (termIri, parentIds) <- parentByTerm
    parentId <- parentIds
    childId <- relationships.getOrElse(parentId, Set.empty)
    if !seenRhea(childId)
  } {
    candidatePairs += 1
    additionsByTerm.getOrElseUpdate(
      termIri,
      scala.collection.mutable.Set.empty
    ) += childId
    // Keep each child globally unique, matching prior workflow behavior.
    seenRhea += childId
  }

  val dataFactory = OWLManager.getOWLDataFactory()

  val newAxioms: Set[OWLAxiom] = additionsByTerm.iterator.flatMap {
    case (termIri, childIds) =>
      childIds.iterator.map { childId =>
        val sourceAnnotation = dataFactory.getOWLAnnotation(
          Source,
          dataFactory.getOWLLiteral("skos:narrowMatch")
        )
        dataFactory.getOWLAnnotationAssertionAxiom(
          HasDbXref,
          termIri,
          dataFactory.getOWLLiteral(s"RHEA:$childId"),
          Set(sourceAnnotation).asJava
        )
      }
  }.toSet

  println(s"Loaded ${countTermStanzas(ontology)} term stanzas.")
  println(
    s"Loaded ${countRelationships(relationships)} child-parent RHEA relationships."
  )
  println(s"Candidate child additions: $candidatePairs")
  println(
    s"Unique xrefs to add: ${newAxioms.size} across ${additionsByTerm.size} terms"
  )

  if (newAxioms.isEmpty) {
    println("No changes needed.")
  } else if (inPlace) {
    manager.addAxioms(ontology, newAxioms.asJava)
    val format = manager.getOntologyFormat(ontology)
    manager.saveOntology(ontology, format, IRI.create(goFile.toIO))
    println(s"Updated $goFile")
  } else if (outFile.nonEmpty) {
    manager.addAxioms(ontology, newAxioms.asJava)
    val format = manager.getOntologyFormat(ontology)
    val outPath = os.Path(outFile, os.pwd)
    manager.saveOntology(ontology, format, IRI.create(outPath.toIO))
    println(s"Wrote updated ontology to $outPath (original file unchanged)")
  } else {
    println(
      "Dry-run only. Re-run with --inPlace true to update go-edit.obo or --outFile <path>."
    )
  }
}

def parseArgs(args: Seq[String]): Config = {
  @annotation.tailrec
  def loop(rest: List[String], config: Config): Config = rest match {
    case Nil                         => config
    case "--goFile" :: value :: tail =>
      loop(tail, config.copy(goFile = os.Path(value, os.pwd)))
    case "--catalogFile" :: value :: tail =>
      loop(tail, config.copy(catalogFile = os.Path(value, os.pwd)))
    case "--relationshipsFile" :: value :: tail =>
      loop(tail, config.copy(relationshipsFile = os.Path(value, os.pwd)))
    case "--inPlace" :: value :: tail =>
      loop(tail, config.copy(inPlace = value.toBoolean))
    case "--outFile" :: value :: tail =>
      loop(tail, config.copy(outFile = value))
    case "--help" :: tail =>
      printHelp()
      loop(tail, config)
    case unknown :: _ =>
      throw new IllegalArgumentException(
        s"Unknown or incomplete argument: $unknown"
      )
  }

  loop(args.toList, Config())
}

def printHelp(): Unit = {
  println(
    "Usage (from src/ontology): scala-cli ../util/add_rhea_child_narrow_xrefs.sc -- [options]"
  )
  println(
    "  --goFile <path>               Input GO ontology file (default: go-edit.obo)"
  )
  println(
    "  --catalogFile <path>          OWLAPI catalog file (default: catalog-v001.xml)"
  )
  println(
    "  --relationshipsFile <path>    Parent-child RHEA TSV (default: ../resources/rhea-relationships.tsv)"
  )
  println(
    "  --inPlace <true|false>        Write to goFile in place (default: false)"
  )
  println(
    "  --outFile <path>              Optional output path when not in-place"
  )
}

def collectRheaState(
    ontology: OWLOntology
): (Set[String], Map[IRI, Set[String]]) = {
  val axioms = ontology.getAxioms(Imports.EXCLUDED).asScala.toSet

  var allRheaIds = Set.empty[String]
  val parentByTerm = scala.collection.mutable.Map
    .empty[IRI, scala.collection.mutable.Set[String]]

  axioms.foreach {
    case AnnotationAssertion(
          anns,
          HasDbXref,
          termIri: IRI,
          RHEAPattern(id) ^^ _
        ) =>
      allRheaIds += id
      if (isExactOrNarrow(anns)) {
        parentByTerm.getOrElseUpdate(
          termIri,
          scala.collection.mutable.Set.empty
        ) += id
      }
    case _ =>
  }

  (allRheaIds, parentByTerm.view.mapValues(_.toSet).toMap)
}

def isExactOrNarrow(
    annotations: Set[org.semanticweb.owlapi.model.OWLAnnotation]
): Boolean =
  annotations.exists {
    case Annotation(_, Source, ("skos:exactMatch" ^^ _))  => true
    case Annotation(_, Source, ("skos:narrowMatch" ^^ _)) => true
    case _                                                => false
  }

def loadRelationships(path: os.Path): Map[String, Set[String]] = {
  val pairs = os.read.lines(path).flatMap { line =>
    val cols = line.split("\\t", -1)
    if (cols.length < 3) None
    else {
      val child = cols(0).trim
      val parent = cols(cols.length - 1).trim
      if (child.forall(_.isDigit) && parent.forall(_.isDigit))
        Some((parent, child))
      else None
    }
  }

  pairs.groupMap(_._1)(_._2).view.mapValues(_.toSet).toMap
}

def countRelationships(byParent: Map[String, Set[String]]): Int =
  byParent.values.map(_.size).sum

def countTermStanzas(ontology: OWLOntology): Int =
  ontology.getClassesInSignature(Imports.EXCLUDED).size()

run(parseArgs(args.toSeq))
