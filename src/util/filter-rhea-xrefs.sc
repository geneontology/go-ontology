// scala 2.13.3
// ammonite 2.3.8

import $ivy.`net.sourceforge.owlapi:owlapi-distribution:4.5.6`
import $ivy.`org.phenoscape::scowl:1.3.4`
import $ivy.`com.outr::scribe-slf4j:2.7.12`
import $ivy.`org.obolibrary.robot:robot-core:1.8.1`
import $ivy.`org.apache.jena:jena-core:3.17.0`

import java.io.FileInputStream
import scala.io.Source
import scala.util.Using
import scala.jdk.CollectionConverters._
import org.obolibrary.robot.CatalogXmlIRIMapper
import org.phenoscape.scowl._
import org.semanticweb.owlapi.apibinding.OWLManager
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat
import org.semanticweb.owlapi.model._
import org.apache.jena.rdf.model.Model
import org.apache.jena.rdf.model.ModelFactory
import org.apache.jena.rdf.model.ResourceFactory
import org.apache.jena.vocabulary.RDFS
import org.apache.jena.sys.JenaSystem
import scribe.Logger

JenaSystem.init()
Logger("org.obolibrary.oboformat.parser.OBOFormatParser").clearHandlers().clearModifiers().orphan().replace()
Logger("org.obolibrary.obo2owl.OWLAPIOwl2Obo").clearHandlers().clearModifiers().orphan().replace()

val RheaNS = "http://rdf.rhea-db.org/"
val DbXref = AnnotationProperty("http://www.geneontology.org/formats/oboInOwl#hasDbXref")
val Definition = AnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000115")
val Reaction = ResourceFactory.createResource(s"${RheaNS}Reaction")
val DirectionalReaction = ResourceFactory.createResource(s"${RheaNS}DirectionalReaction")
val BidirectionalReaction = ResourceFactory.createResource(s"${RheaNS}BidirectionalReaction")
val Status = ResourceFactory.createProperty(s"${RheaNS}status")
val Obsolete = ResourceFactory.createResource(s"${RheaNS}Obsolete")

/**
  * Find any xrefs or definition xrefs in the ontology referencing an unknown Rhea term,
  * remove these axioms, and save.
  */
@main
def main(ontologyFile: os.Path, catalogFile: os.Path, rheaFile: os.Path, outFile: os.Path) = {
  val model = ModelFactory.createDefaultModel()
  Using.resource(new FileInputStream(rheaFile.toIO))(model.read(_, ""))
  val undirectedReactions = model.listResourcesWithProperty(RDFS.subClassOf, Reaction).asScala.to(Set)
  val directionalReactions = model.listResourcesWithProperty(RDFS.subClassOf, DirectionalReaction).asScala.to(Set)
  val bidirectionalReactions = model.listResourcesWithProperty(RDFS.subClassOf, BidirectionalReaction).asScala.to(Set)
  val allReactions = (undirectedReactions ++ directionalReactions ++ bidirectionalReactions)
    .flatMap(n => Option(n.getURI()))
    .map(_.replace(RheaNS, ""))
  val obsoleteReactions = model
    .listResourcesWithProperty(Status, Obsolete)
    .asScala
    .to(Set)
    .flatMap(n => Option(n.getURI()))
    .map(_.replace(RheaNS, ""))
  val manager = OWLManager.createOWLOntologyManager()
  manager.getIRIMappers.add(new CatalogXmlIRIMapper(catalogFile.toIO))
  val ontology = manager.loadOntology(IRI.create(ontologyFile.toIO))
  val axioms = ontology.getAxioms().asScala.to(Set)
  var obsoleteUsages = Set.empty[String]
  val xrefsToRemove = for {
    ann @ AnnotationAssertion(_, DbXref, _, s"RHEA:${rhea}" ^^ _) <- axioms
    _ = if (obsoleteReactions(rhea)) obsoleteUsages += rhea
    if !allReactions(rhea)
  } yield {
    scribe.warn(s"No such Rhea identifier, filtering xref: RHEA:$rhea")
    new RemoveAxiom(ontology, ann)
  }
  val defXrefsChanges = for {
    ann @ AnnotationAssertion(subAnnotations, Definition, _, _) <- axioms
    _ = obsoleteUsages ++= subAnnotations
        .collect { case subAnn @ Annotation(_, DbXref, s"RHEA:${rhea}" ^^ _) => rhea }
        .filter(obsoleteReactions)
    allDefXrefs = subAnnotations.collect {
      case subAnn @ Annotation(_, DbXref, _) => subAnn
      }
    subAnnotationsToRemove = subAnnotations.collect {
      case subAnn @ Annotation(_, DbXref, s"RHEA:${rhea}" ^^ _) if !allReactions(rhea) => {
        scribe.warn(s"No such Rhea identifier, filtering definition xref: RHEA:$rhea")
        subAnn
      }
    }
    if subAnnotationsToRemove.nonEmpty
  } yield {
    if (allDefXrefs.size == subAnnotationsToRemove.size) {
      scribe.error(s"Filtering unknown Rhea ID from definition xref for annotation would remove all definition xrefs:\n$ann")
      System.exit(1)
    }
    val newAxiom = ann.getAxiomWithoutAnnotations.getAnnotatedAxiom((subAnnotations -- subAnnotationsToRemove).asJava)
    (new RemoveAxiom(ontology, ann), new AddAxiom(ontology, newAxiom))
  }
  val (defXrefsToRemove, defXrefsToAdd) = defXrefsChanges.unzip
  // Consider exiting to fail the build when obsoletes are present
  obsoleteUsages.foreach(rhea => scribe.error(s"Obsolete Rhea ID used in xref: RHEA:$rhea"))
  //if (obsoleteUsages.nonEmpty) {
    //System.exit(1)
    //}
  manager.applyChanges(xrefsToRemove.to(List).asJava)
  manager.applyChanges(defXrefsToRemove.to(List).asJava)
  manager.applyChanges(defXrefsToAdd.to(List).asJava)
  manager.saveOntology(ontology, new FunctionalSyntaxDocumentFormat(), IRI.create(outFile.toIO))
}
