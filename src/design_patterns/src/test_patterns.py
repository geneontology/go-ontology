import yaml
from jsonschema import Draft4Validator
import sys
import glob
import re
import warnings


def test_jschema(validator, file_path):
    test_file = open(file_path, "r")
    test_pattern = yaml.load(test_file.read())

    if not validator.is_valid(test_pattern):
        es = validator.iter_errors(test_pattern)
        for e in es:
            warnings.warn(str(e))
            return False
    else:
        return True

dosdp_full_file = open("DOSDP_schema_full.yaml", "r")
dosdp = yaml.load(dosdp_full_file.read())

v = Draft4Validator(dosdp)

pattern_docs = glob.glob(sys.argv[1] + "*.yaml")
stat = True
for pattern in pattern_docs:
  print("Checking %s" % pattern)
  if not test_jschema(v, pattern): stat = False
  
if not stat:
    sys.exit(1)
