---
name: pr-review
description: For reviewing a pull request against the GO ontology, whether from a local checkout or from the automated reviewer in CI. Covers what to check, how to grade severity, and how to report coverage honestly. Use whenever asked to review, critique, or check a PR or a diff to go-edit.obo.
---

## What this skill is for

Reviewing a change to the ontology for the things that automated validation
cannot catch. It says nothing about *how* to deliver the review — posting a
GitHub review, writing a comment, or answering in chat are all callers'
concerns.

CLAUDE.md is the authoritative statement of this project's editing
conventions, and most of what you are checking is specified there. Read it
first. Consult `design-pattern`, `term-obsoletion`, `chemical-entity`,
`reaction`, `taxon-constraint`, and `mapping` when the diff touches those
areas.

## Do not re-derive what CI already covers

`master` requires the `ontology_qc` status check, which runs the full ODK
build: OBO syntax, ELK reasoning, unsatisfiable classes, and the SPARQL QC
suite. If the diff has a passing build, those properties hold. Reporting them
as findings is noise, and reporting them as *verified by you* is a false claim.

Review what CI structurally cannot see.

## Size the change before reviewing it

Measure the diff first. On anything very large (>2000 changed lines) or
obviously mechanical, do not attempt a stanza-by-stanza pass. Say plainly that
you sampled, spot-check a representative selection, and scope the verdict to
what you actually examined.

Never imply coverage you did not achieve. A review that reads as thorough but
silently skipped most of the diff is worse than no review, because it converts
an unexamined change into an apparently examined one.

## What to check

**1. References.** Every PMID or DOI introduced must be real, correctly
transcribed, and actually about the subject it is cited for. Verify them
against PubMed rather than trusting that a plausible-looking id exists — a
transposed digit yields a real paper about something else, which is the
failure mode that survives casual reading. Check ORCIDs and GOC ids are not
invented. Fabricated references are always CRITICAL.

**2. Logical axioms.** This is where the most damaging errors hide, because
they are invisible in the term's rendered form and only surface later as
misclassification.

- `intersection_of` asserts necessary AND sufficient conditions. Flag
  over-specification: axioms where the intersection admits things that are
  not instances of the term. CLAUDE.md's keratinization example is the
  canonical anti-pattern — a multicellular organismal process occurring in an
  epidermal cell is not thereby a keratinization.
- Label, text definition, and logical definition must all describe the same
  thing. If the label does not read as a name for the logical definition,
  that is the tell.
- `is_a` should not be over-asserted. The reasoner infers the most specific
  parent, so redundant or multiple asserted `is_a` is usually wrong.
- Check that `part_of` / `regulates` / `occurs_in` are used where a
  relationship suffices and an equivalence axiom would overreach. Reaching
  for `intersection_of` to express a link to an external ontology term is a
  common and specific mistake.

**3. Design patterns.** For compositional terms, confirm name, definition, and
logical definition conform to the documented pattern. Prior art is strong
evidence: find sibling terms with `obo-grep.pl` and compare. A new term that
looks unlike its siblings is either wrong or is revealing that the siblings
are wrong — either way it is worth raising.

**4. Metadata conventions.**

- `namespace` present, and one of `biological_process`, `molecular_function`,
  `cellular_component`.
- Definition present, with at least one xref.
- `created_by` / `creation_date` on NEW terms only. Adding or modifying
  either on a pre-existing term is an error, and a common one.
- `term_tracker_item` exactly as:
  `property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/N" xsd:anyURI`
- Synonym scopes correct; no synonym duplicating the label.
- New ids minted by an agent are in the `GO:777xxxx` range, and no new id
  collides with an existing `id:` or `alt_id:` anywhere in go-edit.obo.
  Review is the natural place to catch this: a collision is invisible in the
  diff and only surfaces later as two terms sharing an identifier.

**5. Obsoletions.** Verify the full procedure: no remaining references to the
obsoleted term from other terms, `replaced_by` / `consider` populated
appropriately, axioms stripped back, and the impact on existing annotations
considered.

**6. Chemicals.** CHEBI terms should use ph7.3 forms where applicable.

**7. Scope discipline.** Changes should match the linked issue and form a
coherent unit. Flag unrelated drive-by edits. Flag especially any stanza that
looks accidentally clobbered — the checkout/checkin workflow can damage
neighbouring terms silently, and the resulting diff looks like an intentional
edit.

## Severity

- **CRITICAL** — wrong or fabricated data. Hallucinated PMIDs, incorrect
  biology, axioms that would misclassify terms, damaged stanzas.
- **IMPORTANT** — convention violations with real consequences. Design pattern
  nonconformance, over-specified equivalence axioms, metadata on the wrong
  terms, incomplete obsoletion.
- **SUGGESTION** — genuinely optional improvements.

## Tone

Most PR authors here are expert GO curators with decades of domain knowledge.
Be specific and technical: cite the term id and the convention being violated.
Skip anything you cannot substantiate. No praise padding, no restating the
diff back at them, no style nitpicks.

If you are unsure whether something is wrong, ask rather than assert. Three
real findings are worth more than twenty speculative ones — and on a shared
repository, a reviewer with a high false-positive rate gets ignored, then
switched off.

## Report coverage, not just findings

Open the report with what you actually verified, so a reader can distinguish
coverage from silence. Write it once, wherever the caller says the report
goes:

- Scope of review (full or sampled, and why)
- References checked: N verified, M unverifiable
- Logical axioms reviewed
- Design pattern conformance checked against: *sibling terms consulted*
- Metadata conventions checked
- Obsoletion procedure checked, or N/A

Silence on a dimension you did not examine reads as a clean bill of health.
Say which ones you skipped.
