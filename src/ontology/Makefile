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
## ACTUAL MAKEFILE STARTS HERE
# ----------------------------------------

OBO=http://purl.obolibrary.org/obo
ONT=go
BASE=$(OBO)/$(ONT)
SRC=$(ONT)-edit.obo
RELEASEDIR=../../target/
ROBOT_ENV = "ROBOT_JAVA_ARGS=-Xmx8G"
ROBOT= $(ROBOT_ENV) robot
OWLTOOLS= owltools
USECAT= --use-catalog

all: all_imports $(ONT).owl $(ONT).obo
test: $(ONT).obo
prepare_release: all
	mkdir -p $(RELEASEDIR)/imports &&\
	cp $(ONT).owl $(ONT).obo $(RELEASEDIR) &&\
	cp imports/*{owl,obo} $(RELEASEDIR)/imports &&\
	(test -f subsets/*owl && cp subsets/*{owl,obo} $(RELEASEDIR)/subsets && git add $(RELEASEDIR)/subsets/* || echo "no subsets") &&\
	echo "Release files are now in $(RELEASEDIR)"

release: $(ONT).owl $(ONT).obo
	cp $^ $(RELEASEDIR) && cp imports/* $(RELEASEDIR)/imports

$(ONT).owl: $(SRC)
	$(ROBOT)  reason -i $< -r ELK relax reduce -r ELK annotate -V $(BASE)/releases/`date +%Y-%m-%d`/$(ONT).owl -o $@
$(ONT).obo: $(ONT).owl
	$(ROBOT) convert -i $< -f obo -o $(ONT).obo.tmp && mv $(ONT).obo.tmp $@

IMPORTS = chebi cl po pato ro ncbitaxon uberon fao oba
IMPORTS_OWL = $(patsubst %, imports/%_import.owl,$(IMPORTS)) $(patsubst %, imports/%_import.obo,$(IMPORTS))

# Make this target to regenerate ALL
all_imports: $(IMPORTS_OWL)
clean_imports:
	test -f uberon_mirror.owl && rm uberon_mirror.owl
	test -f ncbitaxon_mirror.owl && rm ncbitaxon_mirror.owl

# Use ROBOT for imports
imports/%_import.owl: mirror/%.owl imports/%_terms.txt $(SRC)
	$(ROBOT) extract -i $< -T imports/$*_terms.txt --method BOT -O $(BASE)/$@ -o $@
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

# special case: download obo for speed for chebi
# See also: https://github.com/ebi-chebi/ChEBI/issues/3269
mirror/chebi-download.owl: $(SRC)
	wget -N --no-check-certificate $(OBO)/chebi.obo $(WGET_OUT) && perl -pi -ne 's@BFO_@BFO:@' $@
.PRECIOUS: mirror/chebi-download.owl

# general case: download remote OWL first
mirror/%-download.owl: $(SRC)
	wget -N --no-check-certificate $(OBO)/$*.owl $(WGET_OUT)
.PRECIOUS: mirror/%-download.owl

# filter axioms
mirror/%.owl: mirror/%-download.owl
	$(OWLTOOLS) $< --remove-annotation-assertions -l -s -d -r --remove-dangling-annotations  -o $@
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
