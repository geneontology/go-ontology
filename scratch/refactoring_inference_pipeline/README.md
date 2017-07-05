## Review of inference required for move to automated inference pipeline.

### Strategy for review of ETINEs

Stale inferences for review are in [etines.tsv](https://github.com/geneontology/go-ontology/blob/master/refactoring_inference_pipeline/etines.tsv). This file was derived from [Jenkins build-go-assert-inferences-report #2877 16/02/29](http://build.berkeleybop.org/job/build-go-assert-inferences-report/2877/)

#### Using the file: 

Simple copy and paste the contents into Excel.  When you've finished editing, select all -> copy and paste back & commit.

#### Headers: 

* Columns from ETINE flagging job - do not edit: Class_id	Class_name	parent_class_id	parent_class_name
* Stat: Is the inference true (1) or false (0)?  If false (0), the axiom is tagged for deletion.
* Manual: If stat = 1, use this column to indicate whether the classification should be manually asserted (1) or whether work is required to add back inference.
* Entailed - Checked in Protégé: Some ETINEs appear to be wrongly flagged when they are inferred.  Enter a '1' in this column if this is the case.
* Redundant: (1/0) Is the inference redundant (Column may not be necessary)
* Fixed: Edits in place to ensure inference: Enter a 1 if they are.
* Notes: Free text

#### General categories & suggested approach:

* Chemical classification: Defer to Chebi (except roles)
* Single organism process: Do we care if these classifications expire? 
* Cellular: shift all to manual?
...
