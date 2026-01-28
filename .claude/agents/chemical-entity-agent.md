---
name: chemical-entity-agent
description: An agent for working with any terms referencing chemical entities (CHEBI). CHEBI has some unusual properties that are counter-intuitive, so always use this agent to plan or check work that involves a chemical entity or CHEBI IDs, whether a new term, or significant alteration of existing terms
---

# When to use

- Find ChEBI IDs for chemical entities to use in GO term definitions
- Determine the correct protonation state for a chemical
- Understand chemical classification and parent classes
- Create biosynthetic process or metabolic process terms that reference chemicals
- Verify chemical cross-references

The general thing to keep in mind is that selecting the right CHEBI term is harder than it seems. Don't assume that the term with the most biologist-friendly label is the right one!

CRITICAL: Protonation State Selection (pH 7.3 Canonicalization)

**For GO term logical definitions, ALWAYS prefer the major species at physiological pH (approximately 7.3).**

- for chemicals with different protonation states, the ph7.3 form must be used
- for chemicals with different stereoisomers, the appropriate L or D form must be used (except in very rare cases where we want to be agnostic)

## Exemplar term

```
id: GO:0005290
name: L-histidine transmembrane transporter activity
namespace: molecular_function
def: "Enables the transfer of L-histidine from one side of a membrane to the other. L-histidine is 2-amino-3-(1H-imidazol-4-yl)propanoic acid." [GOC:ai, GOC:mtg_transport, ISBN:0815340729]
synonym: "histidine/arginine/lysine/ornithine porter activity" NARROW []
synonym: "L-histidine transporter activity" BROAD []
is_a: GO:0015174 ! basic amino acid transmembrane transporter activity
intersection_of: GO:0022857 ! transmembrane transporter activity
intersection_of: has_primary_input CHEBI:57595 ! L-histidine zwitterion
relationship: part_of GO:0089709 ! L-histidine transmembrane transport
```

Corresponds to `src/design_patterns/transmembrane_transport.yaml` design pattern. Note that even if the user requested `histidine` we would have interpreted that to mean the L-form. Note also that there is a CHEBI term with the label "L-histidine" (CHEBI:15971), but this is not the ph7.3 form, we instead use the ph7.3 form. However, we retain the biologist friendly label.

## Core Tool: OAK (Ontology Access Kit)

### Basic ChEBI Lookup

The primary tool for ChEBI lookups is OAK with the sqlite adapter:

```bash
# Search by name (exact match)
runoak -i sqlite:obo:chebi info 'L-cysteine'

# Search by fuzzy match (any match)
runoak -i sqlite:obo:chebi info 'l~terpenoid'

# Search by prefix (starts with)
runoak -i sqlite:obo:chebi info 'l^glutam'
# Finds terms starting with "glutam"
```

## 7.3 mapping

Here is how we would obtain the correct term for L-histidine

```
runoak -i sqlite:obo:chebi info L-histidine
```
==> CHEBI:15971


Look this up

```
cd src/ontology && wget ftp://ftp.expasy.org/databases/rhea/tsv/chebi_pH7_3_mapping.tsv
grep '^15971\t' chebi_pH7_3_mapping.tsv
```

yields

```
15971   57595   computation
```

Check:

```
runoak -i sqlite:obo:chebi info CHEBI:57595
```

==> `CHEBI:57595 ! L-histidine zwitterion`
