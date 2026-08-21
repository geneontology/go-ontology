# Soufflé language reference

Everything below was **verified by running Soufflé** against two builds: a
Homebrew 2.4.1 host build and the copy in `obolibrary/odkfull:v1.6.1`, which CI
uses. Results were identical, including error text, except for word size (see
Types). Statements tagged `(docs)` come from <https://souffle-lang.github.io/>
and were not independently exercised; where the manual and the binaries
disagreed, the binaries win and the discrepancy is called out.

The ODK build reports its version as `(UNKNOWN)`, so check word size and
behaviour rather than a version string:

```bash
souffle --version
```

## Program structure

A `.dl` program is a set of declarations, facts, rules, and directives. Order
does not matter, but every relation must be declared with `.decl` before it is
referenced.

```
.decl edge(from: symbol, to: symbol)     // declaration
edge("a", "b").                          // fact
.decl path(from: symbol, to: symbol)
path(x, y) :- edge(x, y).                // rule
path(x, z) :- path(x, y), edge(y, z).    // recursive rule
.input edge                              // read edge.facts
.output path                             // write path.csv
```

Comments are `//` and `/* ... */`. A leading `#` is a **preprocessor directive,
not a comment** — `# this is a note` fails in the preprocessor, before parsing
begins.

## Types

Four primitives: `symbol` (string), `number` (signed int), `unsigned`, `float`.
Word size is a build option and **differs between environments**: the Homebrew
2.4.1 build reports 32 bits, the ODK image 64. `number` therefore tops out near
2.1x10^9 on a stock host build and far higher in CI, so don't let a count or an
arithmetic result depend on the margin.

Everything in this repo uses `symbol` exclusively — RDF terms are kept in their
serialized form and compared as strings.

Type constructors (docs, unused here): `.type Even <: number` (subtype),
`.type Place = City | Town` (union), `.type Conn = [from: Place, to: Place]`
(record), and ADTs with `$Branch(...)` construction.

## Rules, grounding, and negation

**Grounding.** Every variable in the head, and every variable used in a
constraint or negated literal, must be *grounded* by a positive body literal.

```
c(x, y) :- a(x), !b(y).     // ERROR: y is not grounded
c(x, y) :- a(x), dom(y), !b(y).   // OK
```

```
Error: Ungrounded variable y in file ungrounded.dl at line 5
```

**Negation** is `!` and binds nothing. **Stratification** forbids cyclic
negation — relation A may not depend negatively on B while B depends negatively
on A:

```
Error: Unable to stratify relation(s) {a,b}
... has cyclic negation in file nonstrat.dl at line 6
```

Practically: negation may not appear inside a recursive cycle. Recursion itself
(`path` above) is fine and is the reason to use Datalog at all.

**Wildcard** `_` matches anything and introduces no variable. Each `_` is
independent.

**Disjunction** uses `;` inside parentheses:

```
lives_at(p, b) :- owner(o, b), (p = o ; housemate(o, p)).
```

**Multiple heads** are allowed — one rule may populate several relations. Used
in `relation-diff.dl`:

```
output_node(s), output_node(o) :- lost(s, _, o, _).
```

## Constraints

Constraints are boolean tests in a rule body; they do not ground variables.

| Constraint | Notes |
| --- | --- |
| `=` `!=` `<` `<=` `>` `>=` | On `number` and on `symbol`. Symbol comparison is lexicographic (verified: `"apple" < "banana"` holds). |
| `match(pattern, string)` | **Full match, not a search.** See below. |
| `contains(substring, string)` | Argument order is (needle, haystack) — verified. `contains("", x)` is always true. |
| `true` / `false` | Literal constants (docs). |

### `match` is a full match

This is the single most misleading item in the language for anyone arriving from
SPARQL `REGEX` or `grep`. Verified:

```
match("ab",  "abc")   // FALSE — the pattern must consume the whole string
match("ab.", "abc")   // TRUE
```

The manual describes it as a "wildcard pattern" and its example `match("a.*", x)`
happens to work only because of the trailing `.*`. Every pattern in this repo
spans the whole term for exactly this reason — `<.+>`, `"EC:.+"`, `"http.*`. If
you write
`match("GO_0005", iri)` expecting a substring test, your rule silently matches
nothing. Use `contains` for substring tests, or terminate the pattern with `.*`.

Regex dialect is ECMAScript. Verified to work: `\\d`, POSIX classes like
`[[:digit:]]`, alternation `(cat|dog)`, bounded repetition `a{2,3}`, lazy
quantifiers `a.*?c`, and `.` matching a space. Matching is case-sensitive
(`match("ABC","abc")` is false). Anchors `^`/`$` are accepted but redundant.

**Escaping:** the string literal is processed by Soufflé's lexer first, so a
regex backslash must be doubled. A lone `\d` is a compile error:

```
Error: Unknown escape sequence \d in file r.dl at line 12
```

Write `"a\\d+"`. To match a literal double quote (common, since RDF literals
carry theirs), write `"\""` — verified `strlen("\"x\"")` is 3.

## Functors

### String

| Functor | Signature | Notes |
| --- | --- | --- |
| `cat(a, b, ...)` | symbol... → symbol | **Variadic** — verified with 1, 3, and 4 arguments, though the manual documents only the two-argument form. `ontology-qc.dl` relies on this; `cycles.dl` nests calls instead, which also works. |
| `strlen(s)` | symbol → number | Length after escape processing. |
| `substr(s, index, length)` | (symbol, number, number) → symbol | **0-based** index. Verified: `substr("abcdef",0,2)` = `"ab"`. |
| `ord(s)` | symbol → number | Internal symbol-table ordinal, assigned by order of appearance. **Not lexicographic and not stable across runs** — never use it to sort or compare. |

`substr` edge cases (verified): a `length` that overruns the end is silently
clamped (`substr("abc",1,99)` = `"bc"`); an `index` past the end emits a runtime
warning and returns the empty string:

```
warning: wrong index position provided by substr("abc",5,2) functor.
```

Neither case fails the run, so guard arithmetic with `strlen` rather than
relying on the warning being noticed.

### Conversion

`to_number(symbol)` — accepts decimal, hex (`to_number("0xff")` = 255,
verified), and binary. `to_string(number)`. `to_float`, `to_unsigned`,
and `as(value, Type)` for explicit casts (docs; note `as(1.9, number)` on a
float *constant* is rejected as a type mismatch).

### Numeric and logical

Arithmetic `+ - * / % ^`. Verified: integer division truncates (`7/2` = 3) and
`^` is exponentiation (`2^10` = 1024), not xor.

Bitwise `band bor bxor bshl bshr bshru`; logical `land lor lxor lnot` (docs).

`min(a, b)` and `max(a, b)` are two-argument *functors*, entirely separate from
the `min`/`max` aggregates below — an easy confusion.

### Generators

`autoinc()` returns a fresh number per invocation (docs). `range(lo, hi)` generates
values with the **upper bound exclusive** — verified: `range(0, 5)` yields 5
values. A three-argument `range(lo, hi, step)` exists (docs).

User-defined functors (`.functor f(x:number):number`, invoked as `@f(x)`)
require a C-linkable shared library; not used in this repo.

## Aggregates

`count`, `sum`, `min`, `max`, `mean`. Braces are required for a multi-literal
body and optional for a single literal:

```
n = count : { rel(x, _), other(x) }
n = count : rel(_, _)
m = max v : { rel(_, v) }
```

`mean` returns a `float`, and `to_string` has no float overload — wrapping it
produces `Error: no valid overloads`.

An aggregate whose body matches nothing leaves the result unbound and the
containing rule unsatisfied (docs) — it does not yield 0.

### The witness trap — silently wrong answers

Grouping by a key **requires grounding the key outside the aggregate**. Getting
this wrong does not error; it returns a wrong answer with no warning.

```
family("x",3). family("x",9). family("y",5). family("y",1).

// WRONG — p is grounded only inside the aggregate
youngest(p, n) :- n = min x : family(p, x).
// produces:  y  1        <- global minimum, x dropped entirely

// RIGHT — ground p first, then aggregate within its group
youngest(p, n) :- family(p, _), n = min x : { family(p, x) }.
// produces:  x  3
//            y  1
```

The upstream docs state that the first form raises a "Witness Problem Error".
**Neither build raises it** — the rule compiles, runs, exits 0, and quietly
computes the global aggregate. Always ground the grouping key in a positive
literal before the aggregate, and check the row count against expectations.

## I/O directives

```
.input  rel
.output rel
.printsize rel
```

Defaults, all verified:

- `.input rel` reads **`rel.facts`**, tab-separated, no header, from the fact
  directory (default: the current working directory).
- `.output rel` writes **`rel.csv`** — the extension says CSV but the content is
  **tab-separated** — to the output directory (default: the current working
  directory). No header row.
- `.printsize rel` prints `rel<TAB><count>` to stdout.

A **missing fact file is a hard error**, exit status 1 (verified):

```
Error loading missing data: Cannot open fact file missing.facts
```

Options (`(docs)` except `filename` and `IO=stdout`, which were verified):

| Option | Meaning |
| --- | --- |
| `filename="..."` | Overrides the default name. Relative paths resolve against `-F` (input) or `-D` (output). |
| `IO=file \| stdin \| stdout \| sqlite` | Source/destination. `IO=stdout` is handy for quick debugging. |
| `delimiter="..."` | Defaults to tab. |
| `headers=true` | Emit/expect a header row; default false. |
| `compress` | gzip; auto-detected on input. |
| `rfc4180` | Proper CSV: comma delimiter, quoted fields. |
| `columns="4:7"` | Input only; select and reorder source columns. |

## Preprocessor

Soufflé does not implement its own preprocessor — it shells out to the real C
preprocessor, `mcpp`:

```
mcpp -e utf8 -W0 -I "." -DRAM_DOMAIN_SIZE=64 prog.dl
```

So full C preprocessor semantics apply, `mcpp` must be installed, and
`RAM_DOMAIN_SIZE` is predefined to the word size (64 in ODK, 32 on a stock
Homebrew host build). Object-like and function-like macros both work
(verified):

```
#define OWL_CLASS "<http://www.w3.org/2002/07/owl#Class>"
#define IRI(x) cat("<http://example.org/", cat(x, ">"))
```

`#include "other.dl"` and `#ifdef` are supported, as is `-M` on the command line
to define macros externally.

`#` is never a comment. A stray `# note` fails before parsing even begins
(verified):

```
error: Unknown #directive "this"
1 error in preprocessor.
Pre-processor command failed with code 5632
```

## Command-line options

| Flag | Meaning |
| --- | --- |
| `-F, --fact-dir=DIR` | Directory for `.facts` inputs (default: CWD). |
| `-D, --output-dir=DIR` | Directory for outputs (default: CWD). `-D -` sends everything to stdout. |
| `-j, --jobs=N` | Parallel evaluation; `N=auto` for system default. |
| `-c, --compile` | Generate and run compiled C++ instead of interpreting. Much faster for large inputs, slower to start. |
| `-o FILE` / `-g FILE` | Emit a compiled binary / the generated C++ without running. |
| `-p, --profile=FILE` | Write profile data (view with `souffleprof`). |
| `--show=...` | Dump `parse-errors`, `precedence-graph`, `scc-graph`, `transformed-datalog`, `transformed-ram`, `type-analysis`. |
| `-M, --macro=...` | Set preprocessor macros. |
| `-w, --no-warn` | Suppress warnings — **don't**, see below. |
| `-v, --verbose` | Verbose output. |

Flags in this table are from the manual except `-F` and `-D`, which were
verified — including that a relative `filename=` inside the program resolves
against `-F`. They are the clean way to run a program without polluting the
working directory.

## Messages you will actually hit

| Message | Means | Fix |
| --- | --- | --- |
| `Warning: No rules/facts defined for relation X` | `X` is declared but nothing populates it. **Exit status is still 0.** | Almost always a typo in a relation name or a missing `.input`. Treat as an error. |
| `Error: Ungrounded variable v` | `v` appears only in a negated literal, constraint, or head. | Add a positive literal that binds it. |
| `Error: Unable to stratify relation(s) {a,b}` | Cyclic negation. | Break the cycle; compute the positive relation first, negate in a later stratum. |
| `Error: Unknown escape sequence \d` | Single backslash in a string literal. | Double it: `\\d`. |
| `Error loading ... Cannot open fact file X.facts` | `.input X` with no `X.facts` in the fact dir. | Check `-F` / CWD and the relation name. |
| `Error: no valid overloads` | Functor applied to the wrong type, e.g. `to_string` on a float. | Check the signature above. |
| `warning: wrong index position provided by substr(...)` | Runtime, non-fatal, yields `""`. | Guard with `strlen`. |

Never pass `-w`. The "no rules/facts" warning is the main early signal that a
rule is dead.

## Deliberately not covered

Components, records/ADTs, subsumption, provenance/debugging (`-t explain`),
choice-domain, magic-set transformation, and user-defined functors. None appear
in this repo. Upstream documentation: <https://souffle-lang.github.io/>
