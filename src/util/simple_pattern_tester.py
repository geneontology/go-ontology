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
            warnings.warn(str("\n".join([e.message, str(e.instance)])))
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
        vars.update(set(pattern.data_vars.keys()))
    if 'substitutions' in pattern.keys():
        subvars = [X['out'] for X in pattern['substitutions']]
        vars.update(set(subvars))       
    expr = parse('*..vars')
    var_fields = [match for match in expr.find(pattern)]
    stat = True
    if var_fields:
        for field in var_fields:
            val = set(field.value)
            if not vars.issuperset(val):
                warnings.warn("%s has values (%s) not found in pattern variable list (%s): "
                  % (field.full_path, str(val.difference(vars)), str(vars)))
                stat = False
    else:
         warnings.warn("Pattern has no var fields")
    return stat

def test_text_fields(pattern):
    owl_entities = set()
    if 'classes' in pattern.keys(): owl_entities.update(set(pattern['classes'].keys()))
    if 'relations' in pattern.keys(): owl_entities.update(set(pattern['relations'].keys()))
    expr = parse('*..text')
    text_fields = [match for match in expr.find(pattern)]
    if text_fields:
        for field in text_fields:
            # Test for even number single quotes
            val = field.value
            m = re.findall("'", val)
            if divmod(len(m), 2)[1]:
                warnings.warn("text field '%s' has an odd number of single quotes." % val)
                state  = False
            # Test that single quoted strings are OWL entities in dict.
            m = re.findall("'(.+?)'", val)
            quoted = set(m)
            if not owl_entities.issuperset(quoted):
                warnings.warn("%s has values (%s) not found in owl entity dictionaries t (%s): "
                  % (field.full_path, str(quoted.difference(owl_entities)), str(owl_entities)))
                stat = False
    else:
         warnings.warn("Pattern has no text fields")    

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
    if not test_text_fields(pattern): stat = False
  
if not stat:
    sys.exit(1)
