# TODO: integrate this Makefile into normal gh actions.
# for now you must do a separate pip or poetry install
# of LinkML

RUN = poetry run
SCHEMA = subsets.schema.yaml

validate: go_subsets_metadata.yaml $(SCHEMA)
	$(RUN) linkml-validate -s subsets.schema.yaml $<

subsets.jsonschema.json: subsets.schema.yaml $(SCHEMA)
	$(RUN) gen-json-schema $< > $@
