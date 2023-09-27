//> using scala 2.13
//> using dep net.sourceforge.owlapi:owlapi-distribution:4.5.26
//> using dep org.obolibrary.robot:robot-core:1.9.4
//> using dep com.outr::scribe-slf4j:3.12.2

import org.semanticweb.owlapi.model.parameters.Imports
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat
import org.semanticweb.owlapi.model.OWLAnnotationProperty
import org.semanticweb.owlapi.model.AxiomType
import org.semanticweb.owlapi.search.EntitySearcher
import org.semanticweb.owlapi.model.OWLAxiom
import org.geneontology.whelk.owlapi.WhelkOWLReasonerFactory
import org.semanticweb.owlapi.model.OWLObjectProperty
import org.semanticweb.owlapi.reasoner.OWLReasoner
import org.semanticweb.owlapi.model.OWLClass
import org.semanticweb.owlapi.reasoner.InferenceType
import org.semanticweb.elk.owlapi.ElkReasonerFactory

import java.io.File
import org.semanticweb.owlapi.model.IRI
import org.obolibrary.robot.CatalogXmlIRIMapper
import org.semanticweb.owlapi.apibinding.OWLManager
import scala.jdk.CollectionConverters._
import scala.collection.mutable

// This script precomputes the most specific taxon constraints applicable for each
// GO term. 'Never in taxon' results are only output if the taxon is a subclass 
// of the effective 'only in taxon' for the given GO term. The bulk of this script
// inserts extra axioms to facilitate materializing these inferences using an OWL EL
// reasoner which doesn't support negation.
val catalogLoc = new File(args(0))
val goLoc = new File(args(1))
val outputLoc = new File(args(2))
val factory = OWLManager.getOWLDataFactory()
val InTaxon: OWLObjectProperty = factory.getOWLObjectProperty(
  IRI.create("http://purl.obolibrary.org/obo/RO_0002162")
)
val NeverInTaxon: OWLAnnotationProperty = factory.getOWLAnnotationProperty(
  IRI.create("http://purl.obolibrary.org/obo/RO_0002161")
)
val Source: OWLAnnotationProperty = factory.getOWLAnnotationProperty(
  IRI.create("http://www.geneontology.org/formats/oboInOwl#source")
)
val MF =
  factory.getOWLClass(IRI.create("http://purl.obolibrary.org/obo/GO_0003674"))
val BP =
  factory.getOWLClass(IRI.create("http://purl.obolibrary.org/obo/GO_0008150"))
val CC =
  factory.getOWLClass(IRI.create("http://purl.obolibrary.org/obo/GO_0005575"))
val TEST =
  factory.getOWLClass(IRI.create("http://purl.obolibrary.org/obo/GO_0048668"))
val ROOT =
  factory.getOWLClass(
    IRI.create("http://purl.obolibrary.org/obo/NCBITaxon_1")
  )
val NeverSuffix = "%%%NEVER%%%"
val AlwaysSuffix = "%%%ALWAYS%%%"
val manager = OWLManager.createOWLOntologyManager()
manager.addIRIMapper(new CatalogXmlIRIMapper(catalogLoc))
val go = manager.loadOntology(IRI.create(goLoc))
val reasoner = new WhelkOWLReasonerFactory().createReasoner(go)
reasoner.precomputeInferences(InferenceType.CLASS_HIERARCHY)
val bps = reasoner.getSubClasses(BP, false).getFlattened().asScala.to(Set)
val mfs = reasoner.getSubClasses(MF, false).getFlattened().asScala.to(Set)
val ccs = reasoner.getSubClasses(CC, false).getFlattened().asScala.to(Set)
val goTerms = bps ++ mfs ++ ccs
val allTaxa = reasoner
  .getSubClasses(ROOT, false)
  .getFlattened()
  .asScala
  .toSet
  .filterNot(_.isOWLNothing()) + ROOT
val taxonLeaves = reasoner
  .getSuperClasses(factory.getOWLNothing(), true)
  .getFlattened()
  .asScala
  .to(Set)
  .intersect(allTaxa)
val goTermAlwaysInTaxonAxioms = for {
  taxon <- allTaxa
  goTerm <- reasoner
    .getSubClasses(factory.getOWLObjectSomeValuesFrom(InTaxon, taxon), false)
    .getFlattened()
    .asScala
    .to(Set)
    .intersect(goTerms)
    .filterNot(_.isOWLNothing())
} yield factory.getOWLSubClassOfAxiom(
  goTerm,
  factory.getOWLClass(IRI.create(s"${taxon.getIRI()}$AlwaysSuffix"))
)
val supplementalHierarchy = (for {
  taxon <- allTaxa
  subtaxon <- reasoner
    .getSubClasses(taxon, true)
    .getFlattened()
    .asScala
    .to(Set)
} yield Set(
  factory.getOWLSubClassOfAxiom(
    factory.getOWLClass(IRI.create(s"${subtaxon.getIRI()}$AlwaysSuffix")),
    factory.getOWLClass(IRI.create(s"${taxon.getIRI()}$AlwaysSuffix"))
  ),
  factory.getOWLSubClassOfAxiom(
    factory.getOWLClass(IRI.create(s"${taxon.getIRI()}$NeverSuffix")),
    factory.getOWLClass(IRI.create(s"${subtaxon.getIRI()}$NeverSuffix"))
  ),
  factory.getOWLSubClassOfAxiom(
    factory.getOWLObjectSomeValuesFrom(
      InTaxon,
      factory.getOWLObjectComplementOf(taxon)
    ),
    factory.getOWLObjectSomeValuesFrom(
      InTaxon,
      factory.getOWLObjectComplementOf(subtaxon)
    )
  ),
  factory.getOWLSubClassOfAxiom(
    factory.getOWLObjectComplementOf(
      factory.getOWLObjectSomeValuesFrom(InTaxon, taxon)
    ),
    factory.getOWLObjectComplementOf(
      factory.getOWLObjectSomeValuesFrom(InTaxon, subtaxon)
    )
  )
)).flatten

val disjointHierarchy = (for {
  disjoint <- go
    .getAxioms(AxiomType.DISJOINT_CLASSES, Imports.INCLUDED)
    .asScala
  pairwiseAxiom <- disjoint.asPairwiseAxioms().asScala
  classes = pairwiseAxiom.getClassExpressionsAsList().asScala
  left = classes(0)
  if left.isNamed()
  if allTaxa(left.asOWLClass())
  right = classes(1)
  if right.isNamed()
  if allTaxa(right.asOWLClass())
} yield Set(
  factory.getOWLSubClassOfAxiom(
    factory.getOWLObjectSomeValuesFrom(
      InTaxon,
      left
    ),
    factory.getOWLObjectSomeValuesFrom(
      InTaxon,
      factory.getOWLObjectComplementOf(right)
    )
  ),
  factory.getOWLSubClassOfAxiom(
    factory.getOWLObjectSomeValuesFrom(
      InTaxon,
      right
    ),
    factory.getOWLObjectSomeValuesFrom(
      InTaxon,
      factory.getOWLObjectComplementOf(left)
    )
  ),
  factory.getOWLSubClassOfAxiom(
    factory.getOWLClass(
      IRI.create(s"${left.asOWLClass().getIRI()}$AlwaysSuffix")
    ),
    factory.getOWLClass(
      IRI.create(s"${right.asOWLClass().getIRI()}$NeverSuffix")
    )
  ),
  factory.getOWLSubClassOfAxiom(
    factory.getOWLClass(
      IRI.create(s"${right.asOWLClass().getIRI()}$AlwaysSuffix")
    ),
    factory.getOWLClass(
      IRI.create(s"${left.asOWLClass().getIRI()}$NeverSuffix")
    )
  )
)).flatten.to(Set)
manager.addAxioms(go, supplementalHierarchy.asJava)
manager.addAxioms(go, disjointHierarchy.asJava)
reasoner.flush()
val goTermNeverInTaxonAxioms = for {
  taxon <- allTaxa
  goTerm <- reasoner
    .getSubClasses(
      factory.getOWLObjectSomeValuesFrom(
        InTaxon,
        factory.getOWLObjectComplementOf(taxon)
      ),
      false
    )
    .getFlattened()
    .asScala
    .to(Set)
    .intersect(goTerms)
    .filterNot(_.isOWLNothing())
} yield factory.getOWLSubClassOfAxiom(
  goTerm,
  factory.getOWLClass(IRI.create(s"${taxon.getIRI()}$NeverSuffix"))
)
manager.addAxioms(go, goTermAlwaysInTaxonAxioms.asJava)
manager.addAxioms(go, goTermNeverInTaxonAxioms.asJava)
reasoner.flush()

val outAxioms = for {
  goTerm <- goTerms
  directSuperClass <- reasoner
    .getSuperClasses(goTerm, true)
    .getFlattened()
    .asScala
    .to(Set)
  iri = directSuperClass.getIRI().toString()
} yield {
  if (iri.endsWith(AlwaysSuffix)) {
    Set(
      factory.getOWLSubClassOfAxiom(
        goTerm,
        factory.getOWLObjectSomeValuesFrom(
          InTaxon,
          factory.getOWLClass(IRI.create(iri.replace(AlwaysSuffix, "")))
        ),
        Set(
          factory.getOWLAnnotation(Source, factory.getOWLLiteral("computed"))
        ).asJava
      )
    )
  } else if (iri.endsWith(NeverSuffix)) {
    val taxonIRI = IRI.create(iri.replace(NeverSuffix, ""))
    Set(
      factory.getOWLAnnotationAssertionAxiom(
        NeverInTaxon,
        goTerm.getIRI(),
        taxonIRI,
        Set(
          factory.getOWLAnnotation(
            Source,
            factory.getOWLLiteral("computed")
          )
        ).asJava
      ),
      factory.getOWLSubClassOfAxiom(
        goTerm,
        factory.getOWLObjectComplementOf(
          factory.getOWLObjectSomeValuesFrom(
            InTaxon,
            factory.getOWLClass(taxonIRI)
          )
        ),
        Set(
          factory.getOWLAnnotation(
            Source,
            factory.getOWLLiteral("computed")
          )
        ).asJava
      )
    )
    // else Set.empty
  } else Set.empty
}

val outOnt = manager.createOntology(
  outAxioms.flatten.asJava,
  IRI.create(
    "http://purl.obolibrary.org/obo/go/imports/go-computed-taxon-constraints.owl"
  )
)
manager.saveOntology(
  outOnt,
  new FunctionalSyntaxDocumentFormat(),
  IRI.create(outputLoc)
)
