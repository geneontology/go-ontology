install:
	pip install -r requirements.txt

DOSDP_schema_full.yaml:
	wget --no-check-certificate https://raw.githubusercontent.com/dosumis/dead_simple_owl_design_patterns/master/spec/$@ -O $@

test: install DOSDP_schema_full.yaml 
	python src/test_patterns.py validated_patterns/
