all: stage_release

SHELL=./stamp.sh

# ----------------------------------------
# CORE VARIABLES
# ----------------------------------------

# base URI for all OBO library ontologies
OBO=http://purl.obolibrary.org/obo

# OBO name of this ontology (always lowercase)
ONT=go

# Base URL for ontology
BASE=$(OBO)/$(ONT)

# Source file edited by editors
SRC=$(ONT)-edit.obo

# Staging release directory
RELEASEDIR=../../target
RELEASEDIR_IMPORTS=$(RELEASEDIR)/imports

# ROBOT is the main release release tool
ROBOT_ENV = ROBOT_JAVA_ARGS=-Xmx6G
ROBOT = $(ROBOT_ENV) robot --catalog catalog-v001.xml

# OWLTools is a swiss-army knife;
# It does some things robot can't do, but eventually functionality should
# move to robot
OWLTOOLS_ENV = OWLTOOLS_MEMORY=6G
OWLTOOLS = $(OWLTOOLS_ENV) owltools

#DOSDP is used for turning tsv files into pieces of ontologies for imports
DOSDP_ENV = JAVA_OPTS=-Xmx6G
DOSDP_TOOLS = $(DOSDP_ENV) ./dosdp-tools-0.19.3/bin/dosdp-tools

AMM_ENV = JAVA_OPTS=-Xmx6G
AMM = $(AMM_ENV) amm --silent

# Oort build dir;
# This also should be replaced by robot
BUILD_DIR=build

# OWL catalogs map ontology IRIs to local paths
USECAT= --use-catalog

# obo-centric checks and and filters
PERLCHECK= ../util/check-obo-for-standard-release.pl
PERLFILTER= ../util/filter-obo-for-standard-release.pl

# Release IRIs are of the form
#  obo/go/releases/YYYY-MM-DD/$FILE
#
# To make snapshot releases:
#
#   $ RELEASE_SUFFIX=SNAPSHOT make prepare_release
#
RELEASEDATE ?= `date +%Y-%m-%d`
RELEASE_SUFFIX=
RELEASE_URIBASE = $(BASE)/releases/$(RELEASEDATE)$(RELEASE_SUFFIX)

# basic relations are part_of & 3 regulations relations
GO_BASIC_RELATIONS = BFO:0000050 RO:0002211 RO:0002212 RO:0002213

# extend with has_part, occurs_in and during relations
# - this is the set used in the main go file
GO_MAIN_RELATIONS = $(GO_BASIC_RELATIONS) BFO:0000051 BFO:0000066 RO:0002091 RO:0002092 RO:0002093

GO_PLUS = extensions/go-plus
GO_GAF = extensions/go-gaf
GO_AMIGO = extensions/go-amigo
GO_LEGO = extensions/go-lego
GO_LEGO_REACTO = extensions/go-lego-reacto

SPARQLDIR = ../sparql
REPORTDIR = $(RELEASEDIR)/reports

# ----------------------------------------
# TOP LEVEL TARGETS
# ----------------------------------------

stage_release: imports/reactome_xrefs_import.owl test $(ONT).owl $(ONT).obo $(ONT).json.gz $(GO_PLUS).owl $(GO_PLUS).json.gz go-base.owl $(GO_GAF).owl $(GO_AMIGO).owl $(GO_LEGO).owl $(GO_LEGO_REACTO).owl go-basic.obo go-basic.json.gz extensions/rhea-reactions.ttl imports/go-computed-taxon-constraints.obo subset-owls subset-reports generate-mappings

test: $(SRC)-check sparql_test change-report.txt reasoned.owl unsatisfiable present_in_taxon_check.ofn chebi_pH_7_3_check

travis_test: travis_build $(SRC)-check change-report.txt chebi_pH_7_3_check

# This target combines features from reasoned.owl, enhanced.owl, sparql_test into a faster mode for Travis.
# These must be kept in sync.
travis_build: go-edit-filtered-xrefs.ofn
	$(ROBOT) merge --collapse-import-closure false -i go-edit-filtered-xrefs.ofn -i imports/go_taxon_constraints.owl -i imports/reactome_xrefs_import.owl -i ../taxon_constraints/present_in_taxon.ofn -i imports/go-catalytic-activities-participants.owl remove --term 'IAO:0000116' --axioms annotation --signature true repair --annotation-property oboInOwl:hasDbXref reason -r ELK -e asserted-only --exclude-duplicate-axioms true --exclude-tautologies structural relax reduce annotate -V $(RELEASE_URIBASE)/$(ONT).owl --annotation owl:versionInfo $(RELEASEDATE) verify --queries $(VARGS) $(SPARQLDIR)/multiple-class-links-violation.sparql $(SPARQLDIR)/obsolete-reference-violation.sparql $(SPARQLDIR)/missing_superclass-violation.sparql -O reports/

unsatisfiable: $(GO_GAF).owl
	$(ROBOT) reason --reasoner ELK --input extensions/go-gaf.owl -D $(RELEASEDIR)/core_dump.owl || true

full_test: test $(ONT).obo

# note that most derived files are kept separate from source files, in $(RELEASEDIR)
clean: clean_target clean_imports
clean_target:
	rm -rf $(RELEASEDIR)/*

# copies from staged area to target
prepare_release: build
	echo "Base Version IRI: $(RELEASE_URIBASE)"
	mkdir -p $(RELEASEDIR)/extensions &&\
	mkdir -p $(RELEASEDIR)/subsets &&\
	mkdir -p $(RELEASEDIR)/reports &&\
	mkdir -p $(RELEASEDIR)/external2go &&\
	mkdir -p $(RELEASEDIR_IMPORTS) &&\
	cp $(ONT).owl $(ONT).obo $(ONT).json $(RELEASEDIR) &&\
	cp imports/*.owl $(RELEASEDIR_IMPORTS) &&\
	cp imports/*.obo $(RELEASEDIR_IMPORTS) &&\
	cp extensions/* $(RELEASEDIR)/extensions &&\
	cp external2go/* $(RELEASEDIR)/external2go &&\
	cp go-basic.* $(RELEASEDIR) &&\
	cp go-base.owl $(RELEASEDIR) &&\
	cp subsets/* $(RELEASEDIR)/subsets &&\
	cp reports/* $(RELEASEDIR)/reports &&\
	echo "Release files are now in $(RELEASEDIR)"

# deploy to S3
# URLs will be of the form https://s3.amazonaws.com/go-data-product-current/ontology/subsets/go-basic.json.gz
S3CFG = ~/.s3cfg.go-pipeline-push-agent
# https://build.berkeleybop.org/job/release-go-ontology-daily-snapshot/
deploy-snapshot:
	cd $(RELEASEDIR) &&\
	s3cmd -c $(S3CFG) --acl-public --mime-type=application/rdf+xml sync ./  s3://go-data-product-snapshot/ontology/

deploy-release:
	cd $(RELEASEDIR) &&\
	s3cmd -c $(S3CFG) --acl-public --mime-type=application/rdf+xml sync ./  s3://go-data-product-current/ontology/
	s3cmd -c $(S3CFG) --acl-public --mime-type=application/rdf+xml sync ./  s3://go-data-product-release/$(RELEASEDATE)/ontology/


# ----------------------------------------
# GENERIC TRANSFORMS
# ----------------------------------------

%.gz: %
	gzip -c $< > $@.tmp && mv $@.tmp $@

%.json: %.owl
	$(OWLTOOLS) $(USECAT) $< -o -f json $@
.PRECIOUS: %.json

# ----------------------------------------
# CHECKS AND BALANCES
# ----------------------------------------

# TODO: use json form of this file
# See also: https://github.com/geneontology/go-ontology/issues/13837
# See also: https://github.com/geneontology/go-ontology/issues/18870
GO.xrf_abbs: $(SRC)
	wget http://snapshot.geneontology.org/metadata/db-xrefs.legacy -O $@.tmp && mv $@.tmp $@ && touch $@

$(SRC)-check: $(SRC) GO.xrf_abbs
	$(PERLCHECK) --disable-isa-incomplete --xref-abbs GO.xrf_abbs $< > $@.tmp && mv $@.tmp $@

# consider using snapshot release
PREVIOUS=go-lastrelease.owl
$(PREVIOUS): $(SRC)
	wget $(OBO)/go.obo -O $@ && touch $@

# ensure no IDs are lost
change-report.txt: $(SRC) $(PREVIOUS)
	$(OWLTOOLS) $(USECAT) $< --verify-changes -p $(PREVIOUS) -o $@ --id-prefix-filter GO: --check-missing-labels && touch $@

# ----------------------------------------
# OWL
# ----------------------------------------

#Uses file provided by Reactome to generate xrefs for import
#add_xrefs:
imports/reactome_xrefs_import.owl: dosdp-tools-0.19.3 $(SRC)
	mkdir -p reactome-tmp
	wget -O reactome-tmp/Reactions2GoTerms_human.txt --no-check-certificate https://reactome.org/download/current/Reactions2GoTerms_human.txt
	sed -i '1s/.*/Identifier\tName\tdefined_class/' reactome-tmp/Reactions2GoTerms_human.txt
	perl -i.bak -pe 's/[^[:ascii:]]//g' reactome-tmp/Reactions2GoTerms_human.txt
	rm reactome-tmp/Reactions2GoTerms_human.txt.bak
	$(DOSDP_TOOLS) generate --template=xref_dosdp_yaml/reactome_xref.yaml --infile=reactome-tmp/Reactions2GoTerms_human.txt --outfile=reactome-tmp/reactome_xrefs.ofn --obo-prefixes=true
	$(ROBOT) convert --input reactome-tmp/reactome_xrefs.ofn --output imports/reactome_xrefs_import.owl annotate --ontology-iri $(BASE)/imports/reactome_xrefs_import.owl -V $(RELEASE_URIBASE)/$@ -o $@

# Remove reactome_xrefs_import.owl and go_taxon_constraints.owl from imports. These are merged in directly in enhanced.owl
go-edit-trimmed-imports.obo: $(SRC)
	grep -v '^import: http://purl.obolibrary.org/obo/go/imports/reactome_xrefs_import.owl' $< |\
	grep -v '^import: http://purl.obolibrary.org/obo/go/imports/go_taxon_constraints.owl' >$@

go-edit-filtered-xrefs.ofn: go-edit-trimmed-imports.obo ../util/filter-rhea-xrefs.sc mirror/rhea.rdf
	$(AMM) ../util/filter-rhea-xrefs.sc $< catalog-v001.xml mirror/rhea.rdf $@

# merge in some imported GO modules
# remove editor-only annotations
enhanced.owl: go-edit-filtered-xrefs.ofn
	$(ROBOT) merge --collapse-import-closure false -i go-edit-filtered-xrefs.ofn -i imports/go_taxon_constraints.owl -i imports/reactome_xrefs_import.owl -i imports/go-catalytic-activities-participants.owl remove --term 'IAO:0000116' --axioms annotation --signature true repair --annotation-property oboInOwl:hasDbXref annotate --annotation owl:versionInfo $(RELEASEDATE) -o $@

# reasoned.owl is equivalent to editors source, after materialize-reason-relax-reduce pipeline
# note: we keep this as a distinct intermediate target as the ontology IRI needs to be 'go' for Oort to work...
reasoned.owl: enhanced.owl $(SRC)-check
	$(ROBOT) materialize -i $< -r ELK --term BFO:0000050 reason -r ELK -e asserted-only --exclude-duplicate-axioms true --exclude-tautologies structural relax reduce annotate -V $(RELEASE_URIBASE)/$(ONT).owl -o $@

present_in_taxon_check.ofn: enhanced.owl ../taxon_constraints/present_in_taxon.ofn
	$(ROBOT) merge --collapse-import-closure false -i $< -i ../taxon_constraints/present_in_taxon.ofn reason -r ELK -e asserted-only --exclude-duplicate-axioms true --exclude-tautologies structural -o $@

# equivalent to reasoned, but we rename
# TODO cleanup redundancies with merge here and with go-base
# note: do not run 'reason' after go-computed-taxon-constraints.owl is merged; some desired logical redundancy may be lost
$(GO_PLUS).owl: reasoned.owl imports/go-computed-taxon-constraints.owl
	$(ROBOT) merge -i $< --collapse-import-closure true --include-annotations false merge -i imports/go-computed-taxon-constraints.owl annotate -O $(BASE)/$@ -V $(RELEASE_URIBASE)/$@ -o $@
.PRECIOUS: $(GO_PLUS).owl

# Create release file containing GO-asserted axioms, no external axioms, and no inferences.
# GO artifacts to merge are hardcoded here. Would make sense to eventually consolidate go-plus
# as just the merge of go-base.
go-base.owl: enhanced.owl
	$(OWLTOOLS) $(USECAT) $< --remove-imports-declarations -o -f ofn $@.tmp &&\
	$(ROBOT) merge -i $@.tmp -i extensions/go-gci.owl -i extensions/go-bridge.owl -i extensions/ro_pending.owl -i imports/x-disjoint.ofn annotate -O $(BASE)/$@ -V $(RELEASE_URIBASE)/$@ -o $@ && rm $@.tmp

$(GO_GAF).owl: extensions/go-gaf-edit.ofn $(GO_PLUS).owl extensions/gorel.owl mirror/cl.owl mirror/taxslim.owl mirror/taxslim-disjoint-over-in-taxon.owl
	$(ROBOT) merge -i $< --collapse-import-closure true --include-annotations false reason -r ELK --exclude-duplicate-axioms true --remove-redundant-subclass-axioms true --exclude-tautologies structural annotate -O $(BASE)/$@ -V $(RELEASE_URIBASE)/$@ -o $@

$(GO_AMIGO).owl: extensions/go-amigo-edit.ofn $(GO_GAF).owl extensions/go-modules-annotations.owl extensions/go-taxon-subsets.owl mirror/eco.owl mirror/pato.owl mirror/po.owl mirror/chebi.owl mirror/uberon.owl mirror/wbbt.owl
	$(ROBOT) merge -i $< --collapse-import-closure true --include-annotations false reason -r ELK --exclude-duplicate-axioms true --remove-redundant-subclass-axioms true --exclude-tautologies structural annotate -O $(BASE)/$@ -V $(RELEASE_URIBASE)/$@ -o $@

# Not all imports are being pre-mirrored; the ones that are should be dependencies
$(GO_LEGO).owl: extensions/go-lego-edit.ofn $(GO_PLUS).owl mirror/ro-download.owl extensions/legorel.owl extensions/go-bfo-bridge.owl mirror/taxslim.owl mirror/taxslim-disjoint-over-in-taxon.owl mirror/cl.owl mirror/uberon.owl imports/go-lego-chebi-import.owl mirror/wbbt.owl mirror/eco.owl
	$(ROBOT) merge -i $< --collapse-import-closure true --include-annotations false reason -r ELK --exclude-duplicate-axioms true --remove-redundant-subclass-axioms true --exclude-tautologies structural relax reduce --named-classes-only true annotate -O $(BASE)/$@ -V $(RELEASE_URIBASE)/$@ -o $@

extensions/reacto.owl: $(GO_LEGO).owl mirror/chebi.owl
	mkdir -p reacto-tmp
	wget -O ./reacto-tmp/biopax2go.jar --no-check-certificate https://github.com/geneontology/pathways2GO/releases/download/v1.1.4/biopax2go.jar
	wget -O ./reacto-tmp/biopax.zip --no-check-certificate https://reactome.org/download/current/biopax.zip
	unzip -o ./reacto-tmp/biopax.zip -d ./reacto-tmp/
	java -jar -Xmx8G ./reacto-tmp/biopax2go.jar -b ./reacto-tmp/Homo_sapiens.owl -reacto ./extensions/reacto -lego $(GO_LEGO).owl -chebi ./mirror/chebi.owl
	$(ROBOT) convert -i extensions/reacto.ttl -o extensions/reacto.owl
	rm ./reacto-tmp/*
	rmdir ./reacto-tmp

$(GO_LEGO_REACTO).owl: extensions/go-lego-reacto-edit.ofn $(GO_LEGO).owl extensions/reacto.owl
	$(ROBOT) merge -i $< --collapse-import-closure true --include-annotations false reason -r ELK --exclude-duplicate-axioms true --remove-redundant-subclass-axioms true --exclude-tautologies structural relax reduce --named-classes-only true annotate -O $(BASE)/$@ -V $(RELEASE_URIBASE)/$@ -o $@

# ----------------------------------------
# OBO and subsets
# ----------------------------------------

# while go-plus is the full version, the successive releases eliminate various things to simplify the
# file, including
#  - no imports or external ontologies
#  - smaller set of relations (v small for go-basic)
#  - ...
# go.obo is a simplified; we use oort to remove imports etc
# This version of the ontology is used in another step prior to filtering narrow xrefs
$(ONT)-pre.owl: reasoned.owl
	$(OWLTOOLS) $(USECAT) $< --remove-imports-declarations --remove-dangling --make-subset-by-properties $(GO_MAIN_RELATIONS) --set-ontology-id -v $(RELEASE_URIBASE)/$(ONT).owl $(OBO)/go.owl -o -f owl $@.tmp && mv $@.tmp $@

$(ONT)-pre-reduced.owl: $(ONT)-pre.owl
	$(ROBOT) reduce -r elk -i $< query --update ../sparql/remove-narrow-xrefs.ru -o $@
.PRECIOUS: $(ONT)-pre-reduced.owl

# use OORT
# side effects: also builds go-simple.obo
$(ONT).obo: $(ONT)-pre-reduced.owl
	ontology-release-runner --catalog-xml catalog-v001.xml --ignoreLock --skip-release-folder --skip-format owx --skip-format metadata --outdir $(BUILD_DIR) --allow-overwrite --asserted --simple --no-reasoner --remove-trailing-qualifiers $< &&\
	$(PERLCHECK) --disable-xrf-abbs-check --disable-multiply-labeled-edge $(BUILD_DIR)/go.obo &&\
	cp $(BUILD_DIR)/go.obo $@ &&\
	cp $(BUILD_DIR)/go-simple.obo . &&\
	cp $(BUILD_DIR)/go.owl .

# TODO make slims like this
# owltools go-basic.obo --extract-ontology-subset -s goslim_pombe  -o -f obo ...

# This is produced as a byproduct of go.obo
go-simple.obo: $(ONT).obo
go.owl: $(ONT).obo

# remove non-basic relationship types (e.g. has_part)
go-simple-filtered.obo: go-simple.obo
	$(OWLTOOLS) $< --make-subset-by-properties $(GO_BASIC_RELATIONS) // -o -f obo $@

go-simple-filtered-reduced.obo: go-simple-filtered.obo
	$(ROBOT) reduce -r elk -i $< -o $@

# filter inter-ontology (e.g. MF to BP) links
go-basic.obo: go-simple-filtered-reduced.obo
	$(PERLFILTER) $< > $@.tmp && mv $@.tmp $@ && $(PERLCHECK) --disable-xrf-abbs-check $@

go-basic.owl: go-basic.obo
	$(ROBOT) convert -i $< -o $@

# ----------------------------------------
# SUBSETS AND REPORTS
# ----------------------------------------
# Currently the only per-subset report is id-label pairs
# See: https://github.com/geneontology/go-ontology/issues/14028

PUBLISH_SUBSETS = gocheck_do_not_annotate gocheck_do_not_manually_annotate goslim_agr goslim_candida goslim_chembl goslim_drosophila goslim_flybase_ribbon goslim_generic goslim_metagenomics goslim_mouse goslim_pir goslim_plant goslim_pombe goslim_synapse goslim_yeast goslim_prokaryote

SUBSET_OWLS = $(patsubst %,subsets/%.owl,$(PUBLISH_SUBSETS))
# Also generates %.obo and %.json
subset-owls: $(SUBSET_OWLS)

# Also generates %.obo and %.json
# Implicitly depends on build/subsets/%.owl generated as side effect of go.obo
subsets/%.owl: $(ONT).obo 
	$(ROBOT) annotate -i $(BUILD_DIR)/$@ --annotation owl:versionInfo $(RELEASEDATE) -o $@ convert -o $(patsubst %.owl,%.obo,$@) convert -o $(patsubst %.owl,%.json,$@)

# so far we only make simple .tsv reports
SUBSET_REPORTS = $(patsubst %,%.tsv,$(basename $(SUBSET_OWLS)))
subset-reports: $(SUBSET_REPORTS)
subsets/%.tsv: subsets/%.owl
	$(ROBOT) query -f tsv -i $< -s ../sparql/labels.sparql $@

# ----------------------------------------
# IMPORT MODULES
# ----------------------------------------

IMPORTS = chebi cl po pato ro ncbitaxon uberon ddanat fao oba so opl reactome_xrefs go_taxon_constraints
IMPORTS_OWL = $(patsubst %, imports/%_import.owl,$(IMPORTS)) $(patsubst %, imports/%_import.obo,$(IMPORTS))

# Make this target to regenerate ALL
all_imports: $(IMPORTS_OWL)
clean_imports:
	rm mirror/*

seed.txt: enhanced.owl imports/go_taxon_constraints.owl imports/go-taxon-groupings-edit.owl ../taxon_constraints/present_in_taxon.ofn imports/go-catalytic-activities-participants.owl
	$(ROBOT) merge --collapse-import-closure false -i enhanced.owl -i imports/go_taxon_constraints.owl -i imports/go-taxon-groupings-edit.owl -i ../taxon_constraints/present_in_taxon.ofn -i imports/go-catalytic-activities-participants.owl query -f csv --select ../sparql/terms.sparql $@

# Specialize seed terms for PR. The inclusion of taxon IRIs in the full seed was causing PR to pull
# in overly specific proteins (e.g. human forms of everything) and referencing gene IRIs. This is kind
# of a general problem to balance for all import module extractions; need to come up with a consistent approach.
imports/pr_terms_combined.txt: imports/pr_terms.txt seed.txt
	cat $^ | grep 'PR_' > $@

# Specialize seed terms for OPL.
imports/opl_terms_combined.txt: imports/opl_terms.txt seed.txt
	cat $^ | grep 'OPL_' > $@

imports/%_terms_combined.txt: imports/%_terms.txt seed.txt
	cat $^ > $@

# Use ROBOT for imports

# Inserting extra taxon disjoints here because ROBOT is used (standard disjoints come from owltools; could migrate to all via SPARQL like this one)
imports/%_import_pre.owl: mirror/%.owl imports/%_terms_combined.txt $(SRC) ../sparql/add-taxon-disjoints.ru
	$(ROBOT) extract -i $< -T imports/$*_terms_combined.txt --method BOT query --update ../sparql/add-taxon-disjoints.ru reason --exclude-duplicate-axioms true --exclude-tautologies structural annotate -O $(BASE)/imports/$*_import.owl -V $(RELEASE_URIBASE)/imports/$*_import.owl -o $@
.PRECIOUS: imports/%_import_pre.owl

imports/ncbitaxon_import.owl: imports/ncbitaxon_import_pre.owl
	$(OWLTOOLS) $< --create-taxon-disjoint-over-in-taxon -s -r NCBITaxon:1 -m --set-ontology-id $(BASE)/$@ -o $@

../taxon_constraints/only_in_taxon.ofn: ../taxon_constraints/only_in_taxon.yaml ../taxon_constraints/only_in_taxon.tsv dosdp-tools-0.19.3
	$(DOSDP_TOOLS) generate --infile=../taxon_constraints/only_in_taxon.tsv --obo-prefixes=true --template=$< --outfile=$@

../taxon_constraints/never_in_taxon.ofn: ../taxon_constraints/never_in_taxon.yaml ../taxon_constraints/never_in_taxon.tsv dosdp-tools-0.19.3
	$(DOSDP_TOOLS) generate --infile=../taxon_constraints/never_in_taxon.tsv --obo-prefixes=true --template=$< --outfile=$@

../taxon_constraints/present_in_taxon.ofn: ../taxon_constraints/present_in_taxon.yaml ../taxon_constraints/present_in_taxon.tsv dosdp-tools-0.19.3
	$(DOSDP_TOOLS) generate --infile=../taxon_constraints/present_in_taxon.tsv --generate-defined-class=true --obo-prefixes=true --template=$< --outfile=$@

imports/go_taxon_constraints.owl: ../taxon_constraints/only_in_taxon.ofn ../taxon_constraints/never_in_taxon.ofn
	$(ROBOT) merge $(addprefix -i , $^) annotate -O $(BASE)/$@ -o $@

imports/go-computed-taxon-constraints.owl: $(SRC) $(SPARQLDIR)/taxon-constraints-materialization.ru $(SPARQLDIR)/taxon-constraints-in-taxon-annotation.rq $(SPARQLDIR)/taxon-constraints-never-in-taxon-annotation.rq
	$(ROBOT) merge -i $< query --update $(SPARQLDIR)/taxon-constraints-materialization.ru materialize --term RO:0002162 query --query $(SPARQLDIR)/taxon-constraints-in-taxon-annotation.rq taxon-constraints-in-taxon-annotation.ttl --query $(SPARQLDIR)/taxon-constraints-never-in-taxon-annotation.rq taxon-constraints-never-in-taxon-annotation.ttl &&\
	$(ROBOT) merge -i taxon-constraints-in-taxon-annotation.ttl -i taxon-constraints-never-in-taxon-annotation.ttl annotate -O $(BASE)/$@ -o $@

imports/go-computed-taxon-constraints.obo: imports/go-computed-taxon-constraints.owl
	$(ROBOT) convert -i $< -o imports/go-computed-taxon-constraints.tmp.obo && grep -v '^owl-axioms' imports/go-computed-taxon-constraints.tmp.obo >$@

imports/%_import.owl: imports/%_import_pre.owl
	cp $< $@

#bio-chebi-merged.owl: bio-chebi.owl
#	$(OWLTOOLS) $(USECAT) $< --merge-imports-closure -o $@
#imports/chebi_import.owl: bio-chebi.owl imports/chebi_terms_combined.txt $(SRC)
#	$(ROBOT) extract -i $< -T imports/chebi_terms_combined.txt --method BOT -O $(BASE)/$@ annotate -V $(RELEASE_URIBASE)/$@ -o $@
CHEBIRELS = RO:0004007 RO:0004009 RO:0004008 RO:0000057 RO:0002233 RO:0002234 RO:0002313 RO:0002233 RO:0002332 RO:0002340  RO:0002345 BFO:0000051 RO:0000087 GOCHEREL:0000000 GOCHEREL:0000001 GOCHEREL:0000002  GOCHEREL:0000003 GOCHEREL:0000004

#robot doesn't appear to work for making modules with GCIs; hence this contorted mechanism
# See: https://github.com/ontodev/robot/issues/175
seed.owl: $(SRC)
	$(OWLTOOLS) $(USECAT) $< --remove-imports-declarations -o $@
imports/chebi_import_nogci.owl: bio-chebi.owl imports/chebi_terms_combined.txt $(SRC)
	$(ROBOT) extract -i bio-chebi.owl -T imports/chebi_terms_combined.txt --method BOT -O $(BASE)/$@ annotate -V $(RELEASE_URIBASE)/$@ -o $@
imports/chebi_import.owl: imports/chebi_import_nogci.owl seed.owl bio-chebi.owl
	$(OWLTOOLS) $(USECAT) seed.owl $< --merge-support-ontologies  bio-chebi.owl --add-imports-from-supports --extract-module -s $(OBO)/go/extensions/bio-chebi.owl -c  --make-subset-by-properties -n $(CHEBIRELS) // --remove-annotation-assertions -r -l -p 'http://www.geneontology.org/formats/oboInOwl#inSubset' --add-obo-shorthand-to-properties --set-ontology-id $(OBO)/go/$@ -o $@
.PRECIOUS: imports/chebi_import.owl

imports/%_import.obo: imports/%_import.owl
	$(OWLTOOLS) $(USECAT) $< -o -f obo --no-check $@.tmp && grep -v ^owl-axioms: $@.tmp > $@

# ----------------------------------------
# CACHEING EXTERNAL ONTOLOGIES
# ----------------------------------------

# Fix external ontologies to specific versions. These should be updated regularly!
CHEBI_SOURCE=http://purl.obolibrary.org/obo/chebi.owl.gz
CL_SOURCE=http://purl.obolibrary.org/obo/cl/cl-base.owl
UBERON_SOURCE=http://purl.obolibrary.org/obo/uberon/uberon-base.owl
WBBT_SOURCE=http://purl.obolibrary.org/obo/wbbt/wbbt-base.owl
ECO_SOURCE=http://purl.obolibrary.org/obo/eco/eco-basic.owl

WGET_OUT = -O $@.tmp && cp $@.tmp $@ && touch $@

mirror:
	mkdir $@

# special case: download obo for speed for ncbitaxon.
# note also that here we only trigger new downloads if ncbitaxon_terms.txt is touched
mirror/ncbitaxon-download.owl: imports/ncbitaxon_terms.txt
	wget --no-check-certificate $(OBO)/ncbitaxon.obo $(WGET_OUT)
.PRECIOUS: mirror/ncbitaxon-download.owl
#mirror/ncbitaxon-download-enhanced.owl: mirror/ncbitaxon-download.owl
#	OWLTOOLS_MEMORY=12G owltools  $< --create-taxon-disjoint-over-in-taxon -s -r NCBITaxon:1 -m --set-ontology-id $OBO/zz -o
#.PRECIOUS: mirror/ncbitaxon-download-enhanced.owl

mirror/taxslim.owl: $(SRC)
	wget --no-check-certificate $(OBO)/ncbitaxon/subsets/taxslim.owl $(WGET_OUT)
.PRECIOUS: mirror/taxslim.owl

mirror/taxslim-disjoint-over-in-taxon.owl: $(SRC)
	wget --no-check-certificate $(OBO)/ncbitaxon/subsets/taxslim-disjoint-over-in-taxon.owl $(WGET_OUT)
.PRECIOUS: mirror/taxslim-disjoint-over-in-taxon.owl

mirror/pr-download.owl: $(SRC)
	wget --no-check-certificate $(OBO)/pr.owl $(WGET_OUT)
.PRECIOUS: mirror/pr-download.owl

# special case: download gz for speed for chebi
mirror/chebi-download.owl: $(SRC)
	wget --no-check-certificate $(CHEBI_SOURCE) -O $@.tmp.gz && mv $@.tmp.gz $@.gz && gunzip -f $@.gz && touch $@
.PRECIOUS: mirror/chebi-download.owl

# special case: use ext for uberon
mirror/uberon-download.owl: $(SRC)
	wget --no-check-certificate $(UBERON_SOURCE) $(WGET_OUT)
.PRECIOUS: mirror/uberon-download.owl

# special case: use base for pato
mirror/pato-download.owl: $(SRC)
	wget --no-check-certificate $(OBO)/pato/pato-base.owl $(WGET_OUT)
.PRECIOUS: mirror/pato-download.owl

# special case: use basic for oba
mirror/oba-download.owl: $(SRC)
	wget --no-check-certificate $(OBO)/oba/subsets/oba-basic.obo -O $@.tmp && $(OWLTOOLS) $@.tmp --make-subset-by-properties -n // -o $@
.PRECIOUS: mirror/oba-download.owl

mirror/cl-download.owl: $(SRC)
	wget --no-check-certificate $(CL_SOURCE) $(WGET_OUT)
.PRECIOUS: mirror/cl-download.owl

mirror/wbbt-download.owl: $(SRC)
	wget --no-check-certificate $(WBBT_SOURCE) $(WGET_OUT)
.PRECIOUS: mirror/wbbt-download.owl

mirror/eco-download.owl: $(SRC)
	wget --no-check-certificate $(ECO_SOURCE) $(WGET_OUT)
.PRECIOUS: mirror/eco-download.owl

mirror/ro-download.owl: $(SRC)
	wget --no-check-certificate $(OBO)/ro/ro-base.owl $(WGET_OUT)
.PRECIOUS: mirror/ro-download.owl

# general case: download remote OWL first
mirror/%-download.owl: $(SRC)
	wget --no-check-certificate $(OBO)/$*.owl $(WGET_OUT)
.PRECIOUS: mirror/%-download.owl

mirror/rhea.rdf:
	curl -L -o $@.gz 'https://ftp.expasy.org/databases/rhea/rdf/rhea.rdf.gz' && gunzip $@.gz

# bio-chebi.owl imports chebi and injects GCI axioms to conflate conjugate bases. See Hill et al
bio-chebi.owl: mirror/chebi.owl chebi-ph7_3-slim.ofn biochebi_gcis.ofn imports/substance_by_role.owl 
	$(ROBOT) merge -i $< -i chebi-ph7_3-slim.ofn -i biochebi_gcis.ofn -i imports/substance_by_role.owl annotate --ontology-iri $(BASE)/extensions/$@ -V $(RELEASE_URIBASE)/extensions/$@ -o $@.tmp.owl && mv $@.tmp.owl $@

../biochebi/chebi_pH7_3_mapping.tsv:
	wget 'ftp://ftp.expasy.org/databases/rhea/tsv/chebi_pH7_3_mapping.tsv' $(WGET_OUT)

../biochebi/chebi_pH7_3_terms.txt: ../biochebi/chebi_pH7_3_mapping.tsv
	tail -n +2 $< | cut -f 2 | sort -n -u | sed 's/^/http:\/\/purl.obolibrary.org\/obo\/CHEBI_/' >$@

chebi-ph7_3-slim.ofn: ../biochebi/chebi_pH7_3_mapping.tsv
	echo 'Ontology(<http://purl.obolibrary.org/obo/go/extensions/chebi-ph7_3-slim.ofn>' >$@.tmp &&\
	echo 'Declaration(AnnotationProperty(<http://www.geneontology.org/formats/oboInOwl#SubsetProperty>))' >>$@.tmp &&\
	echo 'Declaration(AnnotationProperty(<http://purl.obolibrary.org/obo/go#chebi_ph7_3>))' >>$@.tmp &&\
	echo 'SubAnnotationPropertyOf(<http://purl.obolibrary.org/obo/go#chebi_ph7_3> <http://www.geneontology.org/formats/oboInOwl#SubsetProperty>)' >>$@.tmp &&\
	tail -n +2 $< | cut -f 2 | sort -n -u | sed 's/^/AnnotationAssertion(<http:\/\/www.geneontology.org\/formats\/oboInOwl#inSubset> <http:\/\/purl.obolibrary.org\/obo\/CHEBI_/' | sed 's/$$/> <http:\/\/purl.obolibrary.org\/obo\/go#chebi_ph7_3>)/' >>$@.tmp
	echo ')' >>$@.tmp && mv $@.tmp $@

biochebi_gcis.tsv: ../biochebi/chebi_pH7_3_mapping.tsv ../biochebi/biochebi_excludes.txt
	echo 'source_chem	standard_chem' >$@.tmp &&\
	tail -n +2 ../biochebi/chebi_pH7_3_mapping.tsv | awk -v FS='\t' -v OFS='\t' '{ if ($$1 != $$2) { print "CHEBI:"$$1, "CHEBI:"$$2} }' | grep -v -f ../biochebi/biochebi_excludes.txt >> $@.tmp && mv $@.tmp $@

biochebi_gcis.ofn: biochebi_gcis.tsv ../biochebi/biochebi_gcis.yaml dosdp-tools-0.19.3
	$(DOSDP_TOOLS) generate --obo-prefixes=true --generate-defined-class=true --template=../biochebi/biochebi_gcis.yaml --infile=$< --outfile=$@.tmp.ofn && mv $@.tmp.ofn $@

../biochebi/go-lego-chebi-import-terms.txt: imports/chebi_terms_combined.txt ../biochebi/chebi_pH7_3_terms.txt
	cat $^ >$@

imports/go-lego-chebi-import.owl: bio-chebi.owl ../biochebi/go-lego-chebi-import-terms.txt
	$(ROBOT) extract -i $< -T ../biochebi/go-lego-chebi-import-terms.txt --method BOT annotate -O $(BASE)/imports/go-lego-chebi-import.owl -V $(RELEASE_URIBASE)/imports/go-lego-chebi-import.owl -o $@

# filter axioms
FILTER_EXTERNAL=--remove-axioms-about -d GO --remove-imports-declarations --remove-annotation-assertions -l -s -d -r --remove-axiom-annotations --remove-dangling-annotations --add-obo-shorthand-to-properties --set-ontology-id $(OBO)/$@

mirror/so.owl: mirror/so-download.owl
	$(OWLTOOLS) --use-catalog $< --make-subset-by-properties // -o $@
.PRECIOUS: mirror/uberon.owl

# Removing all external axioms from PR; considering refactoring all imports to create a "base"-ish version if not published
mirror/pr.owl: mirror/pr-download.owl
	$(OWLTOOLS) $< $(FILTER_EXTERNAL) --remove-axioms-about -d -v PR -o $@

mirror/opl.owl: mirror/opl-download.owl
	$(OWLTOOLS) $< $(FILTER_EXTERNAL) --remove-axioms-about -d -v OPL -o $@

mirror/%.owl: mirror/%-download.owl
	$(OWLTOOLS) $< $(FILTER_EXTERNAL) -o $@
.PRECIOUS: mirror/%.owl

# ----------------------------------------
# CHEBI ROLES
# ----------------------------------------
mirror/chebi.obo: mirror/chebi-download.owl
	$(OWLTOOLS) $< -o -f obo $@.tmp && mv $@.tmp $@

HAS_ROLE = RO:0000087

role.obo: mirror/chebi.obo
	$(OWLTOOLS) $< --reasoner-query -r elk -d CHEBI:50906 --make-ontology-from-results $(OBO)/go/chebi/role.owl -o -f obo $@

imports/substance_by_role_equiv.obo: role.obo
	../util/make-substance-by-role.pl -s 'role' -r $(HAS_ROLE) $< > $@.tmp && mv $@.tmp $@

imports/substance_by_role.owl: imports/substance_by_role_equiv.obo
	$(ROBOT) reason -i $< --exclude-duplicate-axioms true --exclude-tautologies structural remove --axioms equivalent -o $@

imports/substance_by_role.obo: imports/substance_by_role.owl
	$(ROBOT) convert -i $< -o $@

# ----------------------------------------
# IMPORTED AND TRANSFERRED RHEA AXIOMS
# ----------------------------------------

rhea.ttl: ../sparql/construct-rhea-reactions.sparql mirror/rhea.rdf
	arq -q --data=mirror/rhea.rdf --query=../sparql/construct-rhea-reactions.sparql --results=turtle >$@

extensions/rhea-reactions.ttl: rhea.ttl
	$(AMM) ../util/construct_rhea_ontology.sc $< rhea-reactions.ofn && \
	$(ROBOT) annotate -i rhea-reactions.ofn -O $(BASE)/$@ -V $(RELEASE_URIBASE)/$@ -o $@

extensions/rhea-reactions-simple.ttl: rhea.ttl
	$(AMM) ../util/construct_rhea_ontology_simplified.sc $< rhea-reactions-simple.ofn && \
	$(ROBOT) annotate -i rhea-reactions-simple.ofn -O $(BASE)/$@ -V $(RELEASE_URIBASE)/$@ -o $@

imports/go-catalytic-activities-participants.owl: extensions/rhea-reactions-simple.ttl $(SRC)
	$(AMM) ../util/transfer_rhea_relations.sc $< $(SRC) catalog-v001.xml $@.tmp && \
	$(ROBOT) annotate -i $@.tmp -O $(BASE)/$@ -o $@

imports/go-catalytic-activities-participants.obo: imports/go-catalytic-activities-participants.owl
	$(ROBOT) convert -i $< -o $@

# ----------------------------------------
# MAPPINGS
# ----------------------------------------
EXTERNAL2GO_DBS = EC KEGG_REACTION MetaCyc Reactome RESID UM-BBD_enzymeID UM-BBD_pathwayID UM-BBD_reactionID Wikipedia RHEA

# See : https://github.com/geneontology/go-site/issues/688
# Manually add all ID spaces here; only do this for xrefs that are managed within the obo file.
# Using a version of ontology before narrow xrefs are filtered out
.PHONY: generate-mappings
generate-mappings: $(ONT)-pre.owl
	$(OWLTOOLS) $< --external-mappings-files -o external2go --label-prefix GO: --externals $(EXTERNAL2GO_DBS)
	wget https://ftp.ebi.ac.uk/pub/databases/GO/goa/external2go/interpro2go -O external2go/interpro2go
	wget https://ftp.ebi.ac.uk/pub/databases/GO/goa/external2go/pfam2go -O external2go/pfam2go
	wget https://ftp.ebi.ac.uk/pub/databases/GO/goa/external2go/pirsf2go -O external2go/pirsf2go
	wget https://ftp.ebi.ac.uk/pub/databases/GO/goa/external2go/prints2go -O external2go/prints2go
	wget https://ftp.ebi.ac.uk/pub/databases/GO/goa/external2go/prosite2go -O external2go/prosite2go
	wget https://ftp.ebi.ac.uk/pub/databases/GO/goa/external2go/smart2go -O external2go/smart2go
	wget https://ftp.ebi.ac.uk/pub/databases/GO/goa/external2go/uniprotkb_kw2go -O external2go/uniprotkb_kw2go
	wget https://ftp.ebi.ac.uk/pub/databases/GO/goa/external2go/uniprotkb_sl2go -O external2go/uniprotkb_sl2go
	wget https://ftp.ebi.ac.uk/pub/databases/GO/goa/external2go/unirule2go -O external2go/unirule2go
	wget https://ftp.ebi.ac.uk/pub/databases/GO/goa/external2go/hamap2go -O external2go/hamap2go
	wget https://ftp.ebi.ac.uk/pub/databases/Rfam/CURRENT/rfam2go -O external2go/rfam2go

# ----------------------------------------
# TAXON GROUPINGS
# ----------------------------------------

imports/go-taxon-groupings.owl: imports/go-taxon-groupings-edit.owl imports/ncbitaxon_import.owl
	$(ROBOT) merge -i $< -i imports/ncbitaxon_import.owl reason -r hermit unmerge -i imports/ncbitaxon_import.owl -o $@

imports/go-taxon-groupings.obo: imports/go-taxon-groupings.owl
	$(ROBOT) convert -i $< -o $@.tmp.obo && grep -v ^owl-axioms $@.tmp.obo > $@

# ----------------------------------------
# VALIDATION
# ----------------------------------------

# these live in the ../sparql directory, and have suffix -violation.sparql
# adding the name here will make the violation check live

VCHECKS = equivalent-classes trailing-whitespace owldef-self-reference synonym-label-match replacedby-obsolete replacedby-namespace duplicate-exact-synonym duplicate-synonym non-IRI-value non-anyURI-value obsolete-definition definition-constraints one-to-one-xrefs-by-subject one-to-one-xrefs-by-value xref-syntax

# run all violation checks
VARGS = $(foreach V,$(VCHECKS), $(SPARQLDIR)/$V-violation.sparql)
sparql_test: $(SRC) reasoned.owl
	$(ROBOT) verify --input $< --queries $(VARGS) -O reports/
	# These purposely aren't checking problems in imports
	$(ROBOT) verify --input reasoned.owl --queries $(SPARQLDIR)/multiple-class-links-violation.sparql $(SPARQLDIR)/obsolete-reference-violation.sparql $(SPARQLDIR)/missing_superclass-violation.sparql -O reports/

# use this to run tests on an individual basis
reports/%-violation.csv: $(SRC)
	$(ROBOT) query -i $< -s $(SPARQLDIR)/$*-violation.sparql $@

check-obsolete-references-including-imports: reasoned.owl
	$(ROBOT) merge --input reasoned.owl verify --queries $(SPARQLDIR)/obsolete-reference-violation.sparql -O reports/


reports/neo-violations.report: $(GO_LEGO).owl
	$(ROBOT) report --input $(GO_LEGO).owl --tdb true --tdb-directory tdb/ -k true -p ../sparql/neo/profile.txt -o $@ --print 50 -v

# intermediate files in this target must be lexically, not numerically sorted, for use with comm
chebi_pH_7_3_check: reports/referenced_chebi_terms.tsv ../biochebi/chebi_pH7_3_mapping.tsv
	tail -n +2 reports/referenced_chebi_terms.tsv | sed 's/<http:\/\/purl.obolibrary.org\/obo\/CHEBI_//g' | sed 's/>//g' | sort -u >tmp_referenced_chebi_nums.txt &&\
	tail -n +2 ../biochebi/chebi_pH7_3_mapping.tsv | cut -f 1 | sort -u >tmp_mapped_chebi_nums.txt &&\
	tail -n +2 ../biochebi/chebi_pH7_3_mapping.tsv | cut -f 2 | sort -u >tmp_7_3_chebi_nums.txt &&\
	comm -12 tmp_referenced_chebi_nums.txt tmp_mapped_chebi_nums.txt >tmp_referenced_mapped_chebi_nums.txt &&\
	comm -23 tmp_referenced_mapped_chebi_nums.txt tmp_7_3_chebi_nums.txt >tmp_referenced_chebi_nums_not_7_3.txt &&\
	if [ -s 'tmp_referenced_chebi_nums_not_7_3.txt' ]; then echo "ERROR: CHEBI IDs should be mapped to pH 7.3:" && cat tmp_referenced_chebi_nums_not_7_3.txt && exit 1; else exit 0; fi

# ----------------------------------------
# REPORTS
# ----------------------------------------
# We use `robot query` to generate TSVs from SPARQL

REPORTS = owl-stats basic-report class-count-by-prefix edges labels xrefs obsoletes synonyms
REPORT_ARGS = $(foreach V,$(REPORTS),-s $(SPARQLDIR)/$V.sparql reports/$V.tsv)
all_reports: go.owl
	$(ROBOT) query -f tsv -i $< $(REPORT_ARGS)

#all_src_reports: $(patsubst %,reports/src-%.tsv,$(REPORTS))

reports/%.tsv: go.owl $(SPARQLDIR)/%.sparql $(REPORTDIR)
	$(ROBOT) -vv query -f tsv -i $< -s $(SPARQLDIR)/$*.sparql $@.tmp && mv $@.tmp $@
reports/src-%.tsv: go-edit.obo $(SPARQLDIR)/%.sparql $(REPORTDIR)
	$(ROBOT) query -f tsv -i $< -s $(SPARQLDIR)/$*.sparql $@.tmp && mv $@.tmp $@

reports/referenced_chebi_terms.tsv: $(SRC)
	$(ROBOT) query -f tsv -i $< --query $(SPARQLDIR)/referenced-chebi-terms.sparql $@.tmp && mv $@.tmp $@


# ----------------------------------------
# ADDING INFERENCES
# ----------------------------------------

# first strip the go_inferences import; we need to do this
# because we cannot create a new ontology with the same name
# TEMPORARY: we should be able to remove this step soon
go-edit_noinf.obo: go-edit.obo
	grep -v '^import: http://purl.obolibrary.org/obo/go/imports/go_inferences.owl' $< > $@.tmp && mv $@.tmp $@

# use robot to place inferences in a new file.
# TBD: should relaxed axioms go here?
go_inferences.owl: go-edit_noinf.obo
	$(ROBOT) reason -i $< -r ELK -n true -a true -x true annotate -R -O $(OBO)/go/imports/go_inferences.owl -o $@.tmp.owl && mv $@.tmp.owl $@

# translation to obo.
# note that in order to get obo "!" comments into the file (to enhance readability), we must:
# (a) import the go ontology that contains the labels (b) save (c) strip out the import directive
# NOTE: in svn pipeline, this file was committed by jenkins job every time ontology is edited.
go_inferences.obo: go_inferences.owl
	$(OWLTOOLS) $< --use-catalog go-edit.obo --add-imports-from-supports -o -f obo $@.tmp && grep -v ^import: $@.tmp > $@
.PRECIOUS: go_inferences.obo

# TODO: change this once diff pipeline in place
#go_inferences.obo-previous: $(SRC)
#	wget --no-check-certificate http://geneontology.org/ontology/editors/go_inferences.obo -O $@

%-previous: $(SRC)
	wget --no-check-certificate https://build.berkeleybop.org/job/build-go-ontology-inferences/lastSuccessfulBuild/artifact/target/$* -O $@.tmp && mv $@.tmp $@ || echo "Fresh diffs" > $@

# get the difference between the current staged inferences file and the
# last one to be checked in.
go_inferences.diff: go_inferences.obo go_inferences.obo-previous
	echo getting log
	git log --date=iso $(SRC) | head -6 > $@
	echo >> $@
	echo "changes in entailments" >> $@
	echo >> $@
	echo diffing
	diff -u go_inferences.obo-previous go_inferences.obo >> $@ || echo differences found
.PRECIOUS: go_inferences.diff

# append latest diffs onto difflog
# NOTE: in svn pipeline, this file was committed by jenkins job every time ontology is edited.
go_inferences_difflog.txt: go_inferences.diff go_inferences_difflog.txt-previous
	cat $^ > $@.tmp && mv $@.tmp $@

# reasoner diffs
idiff: go_inferences_difflog.txt
	mkdir -p $(RELEASEDIR)/
	cp go_inferences_difflog.txt $(RELEASEDIR) && \
	cp go_inferences.diff $(RELEASEDIR) && \
	cp go_inferences.obo $(RELEASEDIR)


# ----------------------------------------
# DESIGN PATTERNS
# ----------------------------------------

ALL_PATTERN_YAMLS=$(wildcard ../design_patterns/*.yaml)
ALL_PATTERN_NAMES=$(patsubst ../design_patterns/%.yaml,%,$(ALL_PATTERN_YAMLS))
ALL_PATTERN_TSVS=$(patsubst %.yaml,%.tsv,$(ALL_PATTERN_YAMLS))

# Currently not rebuilt automatically; waiting for updated dosdp-tools in ODK
imports/go-pattern-conformance.ttl: reasoned.owl $(ALL_PATTERN_YAMLS) dosdp-tools-0.19.3
	rm -f ../design_patterns/*.tsv &&\
	$(DOSDP_TOOLS) query --obo-prefixes=true --batch-patterns="$(ALL_PATTERN_NAMES)" --template=../design_patterns --outfile=../design_patterns --ontology=reasoned.owl --catalog=catalog-v001.xml --reasoner=elk --parallelism=4 --output-conformance=$@.tmp &&\
	$(ROBOT) annotate -i $@.tmp --ontology-iri $(BASE)/$@ -o $@

pattern-docs: imports/go-pattern-conformance.ttl reasoned.owl $(ALL_PATTERN_YAMLS) $(ALL_PATTERN_TSVS) dosdp-tools-0.19.3
	rm -f ../../docs/patterns/*.md &&\
	$(DOSDP_TOOLS) docs --obo-prefixes=true --batch-patterns="$(ALL_PATTERN_NAMES)" --template=../design_patterns --outfile=../../docs/patterns --infile=../design_patterns --data-location-prefix='https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/' --ontology=reasoned.owl --catalog=catalog-v001.xml

dosdp-tools-0.19.3:
	curl -L -O 'https://github.com/INCATools/dosdp-tools/releases/download/v0.19.3/dosdp-tools-0.19.3.tgz' && tar -zxf dosdp-tools-0.19.3.tgz
