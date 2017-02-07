# ----------------------------------------
# TEMPORARY
# ----------------------------------------

# until we switch to new repo, we need to periodically sync for testing

OLDED=$(HOME)/repos/go/ontology/editors/
sync:
	cp $(OLDED)/gene_ontology_write.obo go-edit.obo ;\
	cp $(OLDED)/go_inferences_null.owl . ;\
	cp $(OLDED)/go-idranges.txt . ;\
	cp $(OLDED)/*.dict . ;\
	perl -npe 's@\.\./extensions/@imports/@' $(OLDED)/catalog-v001.xml > catalog-v001.xml ;\
	perl -npe 's@\.\./extensions/@imports/@' $(OLDED)/oboedit.catalog > oboedit.catalog

# ----------------------------------------
# ACTUAL MAKEFILE STARTS HERE
# ----------------------------------------

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
RELEASEDIR_IMPORTS=$(RELEASEDIR)/extensions


# ROBOT is a release tool
ROBOT_ENV = ROBOT_JAVA_ARGS=-Xmx8G
ROBOT= $(ROBOT_ENV) robot

# OWLTools is a swiss-army knife
OWLTOOLS_ENV = OWLTOOLS_MEMORY=8G
OWLTOOLS= $(OWLTOOLS_ENV) owltools

# Oort build dir
BUILD_DIR=build

# OWL catalogs map ontology IRIs to local paths
USECAT= --use-catalog

# obo-centric checks
PERLCHECK= ../util/check-obo-for-standard-release.pl

# This can be overridden to make snapshot releases:
#
#   $ RELEASE_SUFFIX=SNAPSHOT make prepare_release
#
RELEASE_SUFFIX= 
RELEASE_URIBASE= $(BASE)/releases/`date +%Y-%m-%d`$(RELEASE_SUFFIX)

# basic relations are part_of & 3 regulations relations
GO_BASIC_RELATIONS = BFO:0000050 RO:0002211 RO:0002212 RO:0002213

# extend with has_part, occurs_in and during relations
GO_MAIN_RELATIONS = $(GO_BASIC_RELATIONS) BFO:0000051 BFO:0000066 RO:0002091 RO:0002092 RO:0002093

# ----------------------------------------
# TOP LEVEL TARGETS
# ----------------------------------------

all: all_imports $(ONT).owl $(ONT).obo
test: $(ONT).owl
full_test: $(ONT).obo
prepare_release: all
	mkdir -p $(RELEASEDIR)/imports &&\
	mkdir -p $(RELEASEDIR_IMPORTS) &&\
	cp $(ONT).owl $(ONT).obo $(RELEASEDIR) &&\
	cp imports/*.owl $(RELEASEDIR_IMPORTS) &&\
	cp imports/*.obo $(RELEASEDIR_IMPORTS) &&\
	(test -f subsets/*owl && cp subsets/*{owl,obo} $(RELEASEDIR)/subsets && git add $(RELEASEDIR)/subsets/* || echo "no subsets") &&\
	echo "Release files are now in $(RELEASEDIR)"

release: $(ONT).owl $(ONT).obo
	cp $^ $(RELEASEDIR) && cp imports/* $(RELEASEDIR)/imports

# ----------------------------------------
# OWL
# ----------------------------------------

# go.owl is equivalent to editors source, after reason-relax-reduce pipeline
$(ONT).owl: $(SRC)
	$(ROBOT)  reason -i $< -r ELK relax reduce -r ELK annotate -V $(RELEASE_URIBASE)/$(ONT).owl -o $@

# ----------------------------------------
# OBO and subsets
# ----------------------------------------

# go.obo is a simplified; we use oort to remove imports etc

$(ONT)-pre.owl: $(ONT).owl
	owltools $(USECAT) $< --remove-imports-declarations --remove-dangling --make-subset-by-properties $(GO_MAIN_RELATIONS) --set-ontology-id $(OBO)/go.owl -o -f obo $@.tmp && egrep -v '(property_value|relationship): never_in_taxon' $@.tmp > $@

# use OORT
# side effects: also builds go-simple.obo
$(ONT).obo: $(ONT)-pre.owl
	ontology-release-runner --catalog-xml catalog-v001.xml --ignoreLock --skip-release-folder --skip-format owx --skip-format owl --skip-format metadata --outdir $(BUILD_DIR) --allow-overwrite --asserted --simple --no-reasoner --remove-trailing-qualifiers $< &&\
	$(PERLCHECK) --disable-xrf-abbs-check --disable-multiply-labeled-edge $(BUILD_DIR)/go.obo &&\
	cp $(BUILD_DIR)/go.obo $@

# This is produced as a byproduct of go.obo
go-simple.obo: $(ONT).obo

# remove non-basic relationship types (e.g. has_part)
go-simple-filtered.obo: go-simple.obo
	owltools $< --make-subset-by-properties $(GO_BASIC_RELATIONS) // -o -f obo $@

# filter inter-ontology (e.g. MF to BP) links
go-basic.obo: go-simple-filtered.obo
	filter-obo-for-standard-release.pl $< > $@.tmp && mv $@.tmp $@ && check-obo-for-standard-release.pl --disable-xrf-abbs-check $@

# ----------------------------------------
# IMPORT MODULES
# ----------------------------------------

IMPORTS = chebi cl po pato ro ncbitaxon uberon fao oba
IMPORTS_OWL = $(patsubst %, imports/%_import.owl,$(IMPORTS)) $(patsubst %, imports/%_import.obo,$(IMPORTS))

# Make this target to regenerate ALL
all_imports: $(IMPORTS_OWL)
clean_imports:
	test -f uberon_mirror.owl && rm uberon_mirror.owl
	test -f ncbitaxon_mirror.owl && rm ncbitaxon_mirror.owl

seed.txt: $(SRC)
	owltools --use-catalog $< --export-table $@.tmp && cut -f1 $@.tmp > $@

imports/%_terms_combined.txt: imports/%_terms.txt seed.txt
	cat $^ > $@

# Use ROBOT for imports
imports/%_import.owl: mirror/%.owl imports/%_terms_combined.txt $(SRC)
	$(ROBOT) extract -i $< -T imports/$*_terms_combined.txt --method BOT -O $(BASE)/$@ annotate -V $(RELEASE_URIBASE)/$@ -o $@
.PRECIOUS: imports/%_import.owl

imports/%_import.obo: imports/%_import.owl
	$(OWLTOOLS) $(USECAT) $< -o -f obo --no-check $@

# ----------------------------------------
# CACHEING EXTERNAL ONTOLOGIES
# ----------------------------------------

WGET_OUT = -O $@.tmp && cp $@.tmp $@ && touch $@

# special case: download obo for speed for ncbitaxon
mirror/ncbitaxon-download.owl: $(SRC)
	wget -N --no-check-certificate $(OBO)/ncbitaxon.obo $(WGET_OUT)
.PRECIOUS: mirror/ncbitaxon-download.owl

# special case: download obo for speed for ncbitaxon
mirror/pr-download.owl: $(SRC)
	wget -N --no-check-certificate $(OBO)/pr.obo $(WGET_OUT)
.PRECIOUS: mirror/pr-download.owl

# special case: download obo for speed for chebi
# See also: https://github.com/ebi-chebi/ChEBI/issues/3269
mirror/chebi-download.owl: $(SRC)
	wget -N --no-check-certificate $(OBO)/chebi.obo $(WGET_OUT) && perl -pi -ne 's@BFO_@BFO:@' $@
.PRECIOUS: mirror/chebi-download.owl

# special case: use ext for uberon
mirror/uberon-download.owl: $(SRC)
	wget -N --no-check-certificate $(OBO)/uberon/ext.owl $(WGET_OUT)
.PRECIOUS: mirror/uberon-download.owl

# special case: use basic for oba
mirror/oba-download.owl: $(SRC)
	wget -N --no-check-certificate $(OBO)/oba/subsets/oba-basic.obo $(WGET_OUT)
.PRECIOUS: mirror/oba-download.owl

# general case: download remote OWL first
mirror/%-download.owl: $(SRC)
	wget -N --no-check-certificate $(OBO)/$*.owl $(WGET_OUT)
.PRECIOUS: mirror/%-download.owl

# filter axioms
FILTER_EXTERNAL=--remove-imports-declarations --remove-annotation-assertions -l -s -d -r --remove-dangling-annotations --add-obo-shorthand-to-properties --set-ontology-id $(OBO)/$@
mirror/uberon.owl: mirror/uberon-download.owl
	$(OWLTOOLS) $< --remove-classes-in-idspace -s GO --remove-classes-in-idspace -s CHEBI $(FILTER_EXTERNAL) -o $@
.PRECIOUS: mirror/uberon.owl

mirror/%.owl: mirror/%-download.owl
	$(OWLTOOLS) $< $(FILTER_EXTERNAL) -o $@
.PRECIOUS: mirror/%.owl

# bio-chebi.owl imports chebi and injects GCI axioms to conflate conjugate bases. See Hill et al
bio-chebi.owl: mirror/chebi.owl
	owltools --create-biochebi -o $@ -c $<

# ----------------------------------------
# ADDING INFERENCES
# ----------------------------------------
# see: https://github.com/geneontology/go-ontology/issues/12315
# go inferences now go into a separate file.
# this is imported during an OE session (see oboedit.catalog)

# first strip the go_inferences import; we need to do this
# because we cannot create a new ontology with the same name
go-edit_noinf.obo: go-edit.obo
	grep -v '^import: http://purl.obolibrary.org/obo/go/extensions/go_inferences.owl' $< > $@.tmp && mv $@.tmp $@

# use robot to place inferences in a new file.
# TBD: should relaxed axioms go here?
go_inferences.owl: go-edit_noinf.obo
	robot reason -i $< -r ELK -n true -a true -x true annotate -R -O $(OBO)/go/extensions/go_inferences.owl -o $@.tmp.owl && mv $@.tmp.owl $@

# translation to obo.
# note that in order to get obo "!" comments into the file (to enhance readability), we must:
# (a) import the go ontology that contains the labels (b) save (c) strip out the import directive
go_inferences.obo: go_inferences.owl
	owltools $< --use-catalog go-edit.obo --add-imports-from-supports -o -f obo $@.tmp && grep -v ^import: $@.tmp > $@
