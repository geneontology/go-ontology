SCHEMA := util/DOSDP_schema_full.yaml

test: $(SCHEMA)
	python3 util/test_schema.py *.yaml

clean:
	rm $(SCHEMA)

$(SCHEMA):
	wget --no-check-certificate https://raw.githubusercontent.com/dosumis/dead_simple_owl_design_patterns/master/spec/DOSDP_schema_full.yaml -O $@ && touch $@

pattern-files = $(shell ls *.yaml)

query: $(pattern-files)

.PHONY: query $(pattern-files)

$(pattern-files): ../ontology/go-edit.obo
	dosdp-tools --prefixes=prefixes.yaml --ontology=$< --reasoner=elk --obo-prefixes=true --template=$@ --outfile=$(basename $@).tsv query

SRC=../../target/go.owl
%.tsv: %.yaml
	dosdp-tools --prefixes=prefixes.yaml --ontology=$(SRC) --reasoner=elk --obo-prefixes=true --template=$< --outfile=$@ query
