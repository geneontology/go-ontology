import yaml
from jsonschema import Draft4Validator
import sys
import glob
import re
import warnings
import requests
from jsonpath_rw import parse

"""ARG = path to directory with pattern files in yaml
Files must have the extension .yaml or .yml.
All files in directory with these extensions are assumed to be dosdp
pattern files.
"""

def test_jschema(validator, test_pattern):
    if not validator.is_valid(test_pattern):
        es = validator.iter_errors(test_pattern)
        for e in es:
            warnings.warn(str(e))
            return False
    else:
        return True

def test_vars(pattern):
    """Tests whether variable names in any field with key 'vars'
    is in the vars list for the pattern"""
    if 'vars' in pattern.keys():
        vars = set(pattern['vars'].keys())
    else:
        warnings.warn("Pattern has no vars")  
        return True ## If this is to be compulsory, should be spec'd as such in json_schema
    if 'data_vars' in pattern.keys():
        vars = vars.update(set(pattern.data_vars.keys()))
    expr = parse('*..vars')
    var_fields = [match for match in expr.find(pattern)]
    stat = True
    for field in var_fields:
        val = set(field.value)
        if not vars.issuperset(val):
            warnings.warn("%s has values (%s) not found in pattern variable list (%s): "
                  % (field.full_path, str(val.difference(vars)), str(vars)))
            stat = False
    return stat

schema_url = 'https://raw.githubusercontent.com/dosumis/dead_simple_owl_design_patterns/master/spec/DOSDP_schema_full.yaml'
dosdp_full_text = requests.get(schema_url)

dosdp = yaml.load(dosdp_full_text.text)

v = Draft4Validator(dosdp)

pattern_docs = glob.glob(sys.argv[1] + "*.yaml")
pattern_docs.extend(glob.glob(sys.argv[1] + "*.yml"))
stat = True
for pattern_doc in pattern_docs:
    warnings.warn("Checking %s" % pattern_doc)
    file = open(pattern_doc, "r")
    pattern = yaml.load(file.read())
    if not test_jschema(v, pattern): stat = False
    if not test_vars(pattern): stat = False
  
if not stat:
    sys.exit(1)
