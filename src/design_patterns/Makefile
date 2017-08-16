SCHEMA := util/DOSDP_schema_full.yaml

test: $(SCHEMA)
	python3 util/test_schema.py *.yaml

clean:
	rm $(SCHEMA)

$(SCHEMA):
	wget --no-check-certificate https://raw.githubusercontent.com/dosumis/dead_simple_owl_design_patterns/master/spec/DOSDP_schema_full.yaml -O $@ && touch $@

pattern-files = $(shell ls *.yaml)
tsv-files = $(patsubst %.yaml, %.tsv, $(pattern-files))

all_tsv: $(tsv-files)

#query: $(pattern-files)
query: $(pattern-files)

.PHONY: query $(pattern-files)

#$(pattern-files): ../ontology/go-edit.obo
#	dosdp-tools --prefixes=prefixes.yaml --ontology=$< --reasoner=elk --obo-prefixes=true --template=$@ --outfile=$(basename $@).tsv query

go-edit-merged.ttl: ../ontology/go-edit.obo
	owltools --catalog-xml ../ontology/catalog-v001.xml $< --merge-imports-closure -o $@.tmp && mv $@.tmp $@

SRC=go-edit-merged.ttl
# https://github.com/INCATools/dosdp-tools/issues/20
%.tsv: %.yaml $(SRC)
	dosdp-tools --prefixes=prefixes.yaml --ontology=$(SRC) --reasoner=elk --obo-prefixes=true --template=$< --outfile=$@.tmp query && ./util/fix-tsvs.pl $@.tmp > $@
