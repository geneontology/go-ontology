# TEMPORARY
OLDED=$(HOME)/repos/go/ontology/editors/
sync:
	cp $(OLDED)/gene_ontology_write.obo go-edit.obo ;\
	cp $(OLDED)/go_inferences_null.owl . ;\
	cp $(OLDED)/go-idranges.txt . ;\
	cp $(OLDED)/*.dict . ;\
	perl -npe 's@\.\./extensions/@imports/@' $(OLDED)/catalog-v001.xml > catalog-v001.xml ;\
	perl -npe 's@\.\./extensions/@imports/@' $(OLDED)/oboedit.catalog > oboedit.catalog

## ACTUAL MAKEFILE STARTS HERE

OBO=http://purl.obolibrary.org/obo
ONT=go
BASE=$(OBO)/$(ONT)
SRC=$(ONT)-edit.obo
RELEASEDIR=../..
ROBOT= robot
OWLTOOLS= owltools
USECAT= --use-catalog

all: all_imports $(ONT).owl $(ONT).obo
test: all
prepare_release: all
	cp $(ONT).owl $(ONT).obo $(RELEASEDIR) &&\
	mkdir -p $(RELEASEDIR)/imports &&\
	cp imports/*{owl,obo} $(RELEASEDIR)/imports &&\
	git add $(RELEASEDIR)/imports/*{obo,owl} &&\
	(test -f subsets/*owl && cp subsets/*{owl,obo} $(RELEASEDIR)/subsets && git add $(RELEASEDIR)/subsets/* || echo "no subsets") &&\
	echo "Release files are now in $(RELEASEDIR) - now you should commit, push and make a release on github"

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

# Use ROBOT, driven entirely by terms lists NOT from source ontology
imports/%_import.owl: mirror/%.owl imports/%_terms.txt
	$(ROBOT) extract -i $< -T imports/$*_terms.txt --method BOT -O $(BASE)/$@ -o $@
.PRECIOUS: imports/%_import.owl

imports/%_import.obo: imports/%_import.owl
	$(OWLTOOLS) $(USECAT) $< -o -f obo --no-check $@

# clone remote ontology locally, perfoming some excision of relations and annotations
mirror/%.owl: $(SRC)
	$(OWLTOOLS) $(OBO)/$*.owl --remove-annotation-assertions -l -s -d --remove-dangling-annotations  -o $@
.PRECIOUS: mirror/%.owl

release: $(ONT).owl $(ONT).obo
	cp $^ $(RELEASEDIR) && cp imports/* $(RELEASEDIR)/imports

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
