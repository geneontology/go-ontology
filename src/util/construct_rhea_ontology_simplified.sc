// scala 2.13.9
// ammonite 2.5.5

import $ivy.`net.sourceforge.owlapi:owlapi-distribution:4.5.17`
import $ivy.`org.phenoscape::scowl:1.3.4`
import $ivy.`org.apache.jena:apache-jena-libs:3.15.0`
import $ivy.`com.outr::scribe-slf4j:2.7.12`

import java.io.FileInputStream
import org.phenoscape.scowl._
import org.semanticweb.owlapi.apibinding.OWLManager
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat
import org.semanticweb.owlapi.model._
import org.apache.jena.rdf.model.Model
import org.apache.jena.rdf.model.ModelFactory
import org.apache.jena.rdf.model.RDFNode
import org.apache.jena.rdf.model.ResourceFactory
import org.apache.jena.rdf.model.Resource
import org.apache.jena.vocabulary.RDFS
import scala.jdk.CollectionConverters._

val CatalyticActivity = Class("http://purl.obolibrary.org/obo/GO_0003824")
val HasParticipant = ObjectProperty("http://purl.obolibrary.org/obo/RO_0000057")
val PartOf = ObjectProperty("http://purl.obolibrary.org/obo/BFO_0000050")
val HasStoichiometry = DataProperty("http://rdf.rhea-db.org/coefficient")
val HasDbXref = AnnotationProperty("http://www.geneontology.org/formats/oboInOwl#hasDbXref")
val Reaction = ResourceFactory.createResource("http://rdf.rhea-db.org/Reaction")
val HasSide = ResourceFactory.createProperty("http://rdf.rhea-db.org/side")
val CuratedOrder = ResourceFactory.createProperty("http://rdf.rhea-db.org/curatedOrder")
val Contains = ResourceFactory.createProperty("http://rdf.rhea-db.org/contains")
val Chebi = ResourceFactory.createProperty("http://rdf.rhea-db.org/chebi")
val SmallMolecule = ResourceFactory.createResource("http://rdf.rhea-db.org/SmallMolecule")
val Compound = ResourceFactory.createProperty("http://rdf.rhea-db.org/compound")
val CompoundLabel = ResourceFactory.createProperty("http://purl.obolibrary.org/obo/go/rhea/compound_label")
val Coefficient = ResourceFactory.createProperty("http://rdf.rhea-db.org/coefficient")
val HasEC = ResourceFactory.createProperty("http://rdf.rhea-db.org/ec")

/**
  * Process an export from the Rhea triplestore into an ontology of undirected Rhea reactions.
  *
  * @param rheaTTL RDF data exported from Rhea triplestore
  * @param outfile location to save ontology in OWL functional syntax
  */
@main
def main(rheaRDF: os.Path, outfile: os.Path) = {
  val rhea = ModelFactory.createDefaultModel()
  rhea.read(new FileInputStream(rheaRDF.toIO), "", "TURTLE")
  val axioms = rhea.listResourcesWithProperty(RDFS.subClassOf, Reaction).asScala.flatMap(makeReaction(_, rhea)).toSet
  val compoundLabelAxioms = rhea
    .listStatements(null, CompoundLabel, null)
    .asScala
    .map(stmt => Class(stmt.getSubject.getURI) Annotation (RDFSLabel, stmt.getString))
    .toSet
  val allAxioms = axioms ++ compoundLabelAxioms
  val manager = OWLManager.createOWLOntologyManager()
  val ontology =
    manager.createOntology(allAxioms.asJava, IRI.create("http://purl.obolibrary.org/obo/go/extensions/rhea-simple.ofn"))
  manager.saveOntology(ontology, new FunctionalSyntaxDocumentFormat(), IRI.create(outfile.toIO))
}

def makeReaction(reactionNode: Resource, rhea: Model) = {
  val reaction = Class(reactionNode.getURI)
  val label = rhea.getProperty(reactionNode, RDFS.label).getString
  val ecXrefs = for {
    obj <- rhea.listObjectsOfProperty(reactionNode, HasEC).asScala
    ecURI = obj.asResource.getURI
    ec = ecURI.replaceAllLiterally("http://purl.uniprot.org/enzyme/", "EC:")
  } yield reaction Annotation (HasDbXref, ec)
  val sides = sidesForReaction(reactionNode, rhea)
  val leftSide = sides(1)
  val rightSide = sides(2)
  val participants = leftSide ++ rightSide
  val relations = participants.map(HasParticipant some _)
  val superClassAxioms = relations.map(reaction SubClassOf _)
  superClassAxioms ++ ecXrefs + (reaction Annotation (RDFSLabel, label))
}

def sidesForReaction(reactionNode: Resource, rhea: Model): Map[Long, Set[OWLClassExpression]] =
  (for {
    sideNode <- rhea.listObjectsOfProperty(reactionNode, HasSide).asScala
    sideOrder = rhea.getProperty(sideNode.asResource, CuratedOrder).getLong
    participants = participantsForSide(sideNode.asResource, rhea)
  } yield sideOrder -> participants).toMap

def participantsForSide(sideNode: Resource, rhea: Model): Set[OWLClassExpression] =
  for {
    participantNode <- rhea.listObjectsOfProperty(sideNode, Contains).asScala.toSet[RDFNode]
    chebiResource = rhea.getProperty(participantNode.asResource, Chebi)
  } yield Class(chebiResource.getResource.getURI)
