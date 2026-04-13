//> using scala "2.13"
//> using dep "net.sourceforge.owlapi:owlapi-distribution:4.5.29"
//> using dep "org.phenoscape::scowl:1.4.1"
//> using dep "org.obolibrary.robot:robot-core:1.9.8"
//> using dep "com.outr::scribe-slf4j2:3.16.1"

import java.io.File
import scala.jdk.CollectionConverters._
import scala.io.Source
import org.obolibrary.robot.CatalogXmlIRIMapper
import org.phenoscape.scowl._
import org.semanticweb.owlapi.apibinding.OWLManager
import org.semanticweb.owlapi.model.OWLAnnotationValue
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom
import org.semanticweb.owlapi.model.AxiomType
import org.semanticweb.owlapi.model.IRI
import org.semanticweb.owlapi.model.OWLClass
import org.semanticweb.owlapi.model.OWLLiteral
import org.semanticweb.owlapi.search.EntitySearcher

// Example run within the ontology directory:
// scala-cli run ../util/bulk_obsolete_terms.sc -- catalog-v001.xml go-edit.obo bulk-obsolete-28848.txt 'https://github.com/geneontology/go-ontology/issues/28848' "This term was obsoleted because it is not known to be catalyzed by any gene product."
// For the input txt file, put one GO term on each line, e.g. GO:1234567
// Optionally add tab-separated replaced_by and consider values (multiple consider can be pipe-separated):
// GO:1234567<tab>GO:56789<tab>GO:4321|GO:4322
// If providing consider but not replaced_by, there must be two tabs

val catalogFile = args(0)
val ontologyFile = args(1)
val termsFile = args(2)
val trackerItem = args(3)
val obsoletionReason = args(4)
val manager = OWLManager.createOWLOntologyManager()
val factory = manager.getOWLDataFactory()
val Deprecated = factory.getOWLDeprecated()
val HasDbXref = factory.getOWLAnnotationProperty(
  IRI.create("http://www.geneontology.org/formats/oboInOwl#hasDbXref")
)
val ReplacedBy = factory.getOWLAnnotationProperty(
  IRI.create("http://purl.obolibrary.org/obo/IAO_0100001")
)
val Consider = factory.getOWLAnnotationProperty(
  IRI.create("http://www.geneontology.org/formats/oboInOwl#consider")
)
val Definition = factory.getOWLAnnotationProperty(
  IRI.create("http://purl.obolibrary.org/obo/IAO_0000115")
)
val TermTrackerItem = factory.getOWLAnnotationProperty(
  IRI.create("http://purl.obolibrary.org/obo/IAO_0000233")
)
val InSubset = factory.getOWLAnnotationProperty(
  IRI.create("http://www.geneontology.org/formats/oboInOwl#inSubset")
)
manager.addIRIMapper(new CatalogXmlIRIMapper(catalogFile))
val ontology = manager.loadOntology(IRI.create(new File(ontologyFile)))
val trackerItemValue = factory.getOWLLiteral(
  trackerItem,
  factory.getOWLDatatype(
    IRI.create("http://www.w3.org/2001/XMLSchema#anyURI")
  )
)
def expandOBO(curieOrIRI: String): OWLClass = {
  val iri =
    if (curieOrIRI.startsWith("http")) curieOrIRI
    else {
      val pieces = curieOrIRI.split(":", 2)
      if (pieces.size == 2) {
        val prefix = pieces(0)
        val rest = pieces(1)
        s"http://purl.obolibrary.org/obo/${prefix}_${rest}"
      } else curieOrIRI
    }
    Class(iri)
}
val terms = Source
  .fromFile(termsFile, "utf-8")
  .getLines()
  .map(_.split("\t", -1))
  .map { ids =>
    if (ids.size > 3) throw new Exception(s"Too many terms on line: $ids")
    val goTerm = expandOBO(ids(0).trim())
    val maybeReplacedBy = if (ids.size > 1) {
      val replacedByText = ids(1).trim()
      if (replacedByText.nonEmpty) Some(expandOBO(replacedByText)) else None
    } else None
    val considers = if (ids.size > 2) {
      ids(2).split("\\|", -1).map(_.trim()).map(expandOBO).toList
    } else Nil
    (goTerm, maybeReplacedBy, considers)
  }
val allAnnotationAssertions =
  ontology.getAxioms(AxiomType.ANNOTATION_ASSERTION).asScala.toSet
def mapToIRI(value: OWLAnnotationValue): IRI = value match {
  case iri: IRI => iri
  case literal: OWLLiteral =>
    IRI.create(
      literal.getLiteral
        .replaceFirst("GO:", "http://purl.obolibrary.org/obo/GO_")
    )
}
val replacedByValues =
  allAnnotationAssertions
    .filter(_.getProperty() == ReplacedBy)
    .map(ann => mapToIRI(ann.getValue()) -> ann.getSubject().asInstanceOf[IRI])
    .groupMap(_._1)(_._2)
val considerValues =
  allAnnotationAssertions
    .filter(_.getProperty() == Consider)
    .map(ann => mapToIRI(ann.getValue()) -> ann.getSubject().asInstanceOf[IRI])
    .groupMap(_._1)(_._2)
terms.foreach { case (term, replacedBy, considers) =>
  manager.addAxiom(
    ontology,
    AnnotationAssertion(factory.getOWLDeprecated(), term, true)
  )
  manager.addAxiom(
    ontology,
    factory.getOWLAnnotationAssertionAxiom(
      TermTrackerItem,
      term.getIRI(),
      trackerItemValue
    )
  )
  val allComments = ontology
    .getAnnotationAssertionAxioms(term.getIRI())
    .asScala
    .filter(_.getProperty().isComment())
  manager.removeAxioms(ontology, allComments.asJava);
  manager.addAxiom(
    ontology,
    AnnotationAssertion(factory.getRDFSComment(), term, obsoletionReason)
  )
  replacedBy.foreach { replacement =>
    manager.addAxiom(
      ontology,
      AnnotationAssertion(ReplacedBy, term, replacement)
    )
  }
  considers.foreach { considerTerm =>
    manager.addAxiom(
      ontology,
      AnnotationAssertion(Consider, term, considerTerm)
    )
  }
  ontology.getAnnotationAssertionAxioms(term.getIRI()).asScala.foreach { ann =>
    if (ann.getProperty() == factory.getRDFSLabel()) {
      manager.removeAxiom(ontology, ann)
      val label = ann.getValue().asLiteral().get().getLiteral()
      manager.addAxiom(
        ontology,
        AnnotationAssertion(
          factory.getRDFSLabel(),
          term.getIRI(),
          s"obsolete $label"
        )
      )
    } else if (ann.getProperty == HasDbXref) {
      val xref = ann.getValue().asLiteral().get().getLiteral()
      manager.removeAxiom(ontology, ann)
    } else if (ann.getProperty == InSubset) {
      manager.removeAxiom(ontology, ann)
    } else if (ann.getProperty == Definition) {
      val definition = ann.getValue().asLiteral().get().getLiteral()
      val removeDefAnns =
        ann.getAnnotations(HasDbXref).asScala.filter { defAnn =>
          val defXref = defAnn.getValue().asLiteral().get().getLiteral()
          (defXref.startsWith("EC:")
          || defXref.startsWith("RHEA:")
          || defXref.startsWith("MetaCyc:")
          || defXref.startsWith("KEGG:")
          || defXref.startsWith("UM-BBD_enzymeID:")
          || defXref.startsWith("UM-BBD_reactionID:"))
        }
      val allAxiomAnnotations = ann.getAnnotations().asScala.toSet
      val remaining = allAxiomAnnotations -- removeDefAnns
      val newAnnotations =
        if (remaining.isEmpty) Set(Annotation(HasDbXref, "GOC:curators"))
        else remaining
      manager.removeAxiom(ontology, ann)
      manager.addAxiom(
        ontology,
        AnnotationAssertion(
          newAnnotations,
          Definition,
          term.getIRI(),
          s"OBSOLETE. $definition"
        )
      )
    }
  }
  val referencingAxioms =
    EntitySearcher.getReferencingAxioms(term, ontology).asScala
  referencingAxioms.foreach { axiom =>
    if (axiom.isLogicalAxiom()) manager.removeAxiom(ontology, axiom)
  }
  replacedByValues
    .getOrElse(term.getIRI, Set.empty)
    .foreach(t => scribe.warn(s"$term is used as replaced_by for $t"))
  considerValues
    .getOrElse(term.getIRI, Set.empty)
    .foreach(t => scribe.warn(s"$term is used as consider for $t"))
}
manager.saveOntology(ontology)
