//> using scala "2.13"
//> using dep "net.sourceforge.owlapi:owlapi-distribution:4.5.29"
//> using dep "org.phenoscape::scowl:1.4.1"
//> using dep "org.obolibrary.robot:robot-core:1.9.8"
//> using dep "com.outr::scribe-slf4j2:3.16.1"
//> using dep "com.lihaoyi::os-lib:0.9.3"

import org.obolibrary.robot.CatalogXmlIRIMapper
import org.phenoscape.scowl._
import org.semanticweb.owlapi.apibinding.OWLManager
import org.semanticweb.owlapi.model.IRI
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat
import org.semanticweb.owlapi.model._
import org.semanticweb.owlapi.model.parameters.Imports
import scala.jdk.CollectionConverters._
import org.semanticweb.owlapi.search.EntitySearcher

val HasDbXref = AnnotationProperty("http://www.geneontology.org/formats/oboInOwl#hasDbXref")
val Source = AnnotationProperty("http://www.geneontology.org/formats/oboInOwl#source")
val RheaPrefix = "http://rdf.rhea-db.org/"

/**
  * Transfer existential relations from Rhea reactions to GO terms
  * which have Rhea xrefs. Also transfer EC xrefs from the Rhea
  * source to the GO term. (Note—EC xrefs are disabled until interaction with asserted xrefs is reviewed)
  *
  * @param rheaFile
  * @param goFile
  * @param catalog
  */
val rheaFile = os.Path(args(0), os.pwd)
val goFile = os.Path(args(1), os.pwd)
val catalog = os.Path(args(2), os.pwd)
val outfile = os.Path(args(3), os.pwd)

val manager = OWLManager.createOWLOntologyManager()
  manager.addIRIMapper(new CatalogXmlIRIMapper(catalog.toIO))
  val rhea = manager.loadOntology(IRI.create(rheaFile.toIO))
  val go = manager.loadOntology(IRI.create(goFile.toIO))
  val goAxioms = go.getAxioms(Imports.EXCLUDED).asScala.to(Set)
  val rheaAxioms = rhea.getAxioms(Imports.EXCLUDED).asScala.to(Set)
  val RHEAPattern = raw"RHEA:(.+)".r
  val axioms = (for {
    AnnotationAssertion(anns, HasDbXref, goTermIRI: IRI, RHEAPattern(id) ^^ _) <- goAxioms
    if !isDeprecated(goTermIRI, go)
    if !anns.exists {
      case Annotation(_, Source, ("skos:narrowMatch" ^^ _) | ("skos:relatedMatch" ^^ _) | ("skos:broadMatch" ^^ _)) => true
      case _ => false
    }
    goTerm = Class(goTermIRI)
    rheaTerm = Class(s"$RheaPrefix$id")
    //ecs = ecXrefs(rheaTerm, rhea)
    //xrefs: Set[OWLAxiom] = ecs.map(ec => goTerm Annotation (HasDbXref, s"EC:$ec"))
    xrefs = Set.empty[OWLAxiom]
    supers = EntitySearcher.getSuperClasses(rheaTerm, rhea).asScala
    superClassAxioms =  supers.map(goTerm SubClassOf _)
  } yield superClassAxioms ++ xrefs).flatten
  val ontology = OWLManager.createOWLOntologyManager().createOntology(axioms.asJava, IRI.create("http://purl.obolibrary.org/obo/go/imports/go-catalytic-activities-participants.owl"))
  manager.saveOntology(ontology, new RDFXMLDocumentFormat(), IRI.create(outfile.toIO))

def isDeprecated(term: IRI, ontology: OWLOntology) =
  EntitySearcher.getAnnotationObjects(term, ontology, OWLManager.getOWLDataFactory().getOWLDeprecated()).asScala
  .flatMap(_.getValue().asLiteral().asSet().asScala).exists {
    case "true" ^^ _ => true
    case _ => false
  }

def ecXrefs(term: OWLClass, rhea: OWLOntology): Set[String] = {
  val ECPattern = raw"EC:(.+)".r
  for {
    AnnotationAssertion(_, HasDbXref, _, ECPattern(id) ^^ _) <-
      rhea.getAnnotationAssertionAxioms(term.getIRI).asScala.toSet
  } yield id
}
