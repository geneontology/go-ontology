---
name: odk-make
description: Use whenever you run a Makefile target (e.g. `make travis_build`, `make test`, `make reasoned.ofn`) or any one-off ROBOT / owltools / dosdp-tools / scala-cli command derived from a Makefile recipe. These must run inside the pinned ODK Docker image, not against host tools. Covers validation, reasoning, imports, and release builds in src/ontology.
---

## The core rule

Every Makefile target and every one-off command copied from a Makefile recipe
**must run inside the ODK Docker image** (`obolibrary/odkfull`). The Makefile
recipes call `robot`, `owltools`, `dosdp-tools`, and `scala-cli`; the ODK image
is what provides those tools **at the exact versions GO's build and CI expect**.
Running `make` or `robot` against whatever happens to be on the host PATH is not
reproducible — host tools may be missing, or be the wrong version, and you will
get results that don't match CI.

The canonical console invocation is the wrapper `src/ontology/run.sh`, which a
human editor runs **from inside `src/ontology`**:

```sh
cd src/ontology
./run.sh make test
./run.sh robot --version
```

`run.sh` is just `docker run ... obolibrary/odkfull:<pinned-version> "$@"`, with
the repo mounted at `/work` and the working directory set to
`/work/src/ontology`. It mounts `$PWD/../../`, so it only mounts correctly when
invoked from `src/ontology`.

## How YOU (an agent) should run these commands

`run.sh` requests an interactive TTY (`docker run -ti`). That fails in a
non-interactive shell — the normal case when you run commands — with:

```
cannot attach stdin to a TTY-enabled container because stdin is not a terminal
```

So do **not** call `./run.sh` directly. Use the bundled TTY-free wrapper in this
skill instead. It mirrors `run.sh` exactly (same image tag — read live from
`run.sh` so it never drifts — same mount, same workdir) but omits `-ti`, and it
works from any directory in the repo:

```sh
.claude/skills/odk-make/odk-run.sh make travis_build
.claude/skills/odk-make/odk-run.sh make reasoned.ofn
.claude/skills/odk-make/odk-run.sh robot --version
```

Decision rule:

- **Local development / agent on a workstation** (Docker available, you are NOT
  already inside the ODK container): always go through `odk-run.sh`.
- **Already inside the ODK image** (GitHub Actions / `dragon-ai-agent`, where the
  job itself runs in the ODK container; or you launched an interactive
  `./run.sh bash` shell): the tools are already on PATH, so call `make` / `robot`
  directly with **no** wrapper. Don't nest Docker.

If you're unsure which environment you're in: `robot --version` succeeding on the
bare PATH and a `/work` working directory are signs you're already inside ODK.
Otherwise assume you need `odk-run.sh`.

> Note on CLAUDE.md: the project guide writes validation as
> `cd src/ontology && make travis_build`. That shorthand assumes the ODK
> environment is already active (as in CI). On a local machine, run the
> equivalent through the wrapper:
> `.claude/skills/odk-make/odk-run.sh make travis_build`.

## Common targets

| Goal | Command (local) |
| --- | --- |
| Full validation (CI gate) | `.claude/skills/odk-make/odk-run.sh make travis_build` |
| Test suite | `.claude/skills/odk-make/odk-run.sh make test` |
| Reason the edit file | `.claude/skills/odk-make/odk-run.sh make reasoned.ofn` |
| Regenerate an import | `.claude/skills/odk-make/odk-run.sh make imports/<name>.owl` |
| Regenerate all imports | `.claude/skills/odk-make/odk-run.sh make all_imports` |
| Simulate a release build | `.claude/skills/odk-make/odk-run.sh make` |

`make travis_build` is the primary post-edit validation gate. **Allow at least
~10 minutes** for it to run; don't kill it early. If it times out, you can run
the SPARQL verification checks and the ELK reasoning step on their own (see the
AUTOMATED-VALIDATION section of CLAUDE.md) — those are also Makefile-derived
commands, so run them through `odk-run.sh` too, e.g.:

```sh
.claude/skills/odk-make/odk-run.sh \
  robot reason -r ELK -i go-edit.obo -o go-edit.reasoned.obo
```

## One-off ROBOT / owltools commands

Anything you'd lift from a Makefile recipe — a `robot verify`, `robot explain`,
`robot convert -vvv` for a syntax stack trace, an `owltools` diff — goes through
the same wrapper. Paths are relative to `src/ontology` (the container's working
directory), so reference files the way the Makefile does (`go-edit.obo`,
`imports/...`, `../sparql/...`, `../taxon_constraints/...`):

```sh
# Syntax error stack trace
.claude/skills/odk-make/odk-run.sh robot convert -vvv -i go-edit.obo -f obo -o go-edit.TMP.obo

# Explain unsatisfiable classes
.claude/skills/odk-make/odk-run.sh \
  robot explain --input go-edit.obo --reasoner ELK -M unsatisfiability \
  --unsatisfiable all explanations.md
```

## Gotchas

- **Use ELK, never a DL reasoner (HermiT) on the full ontology** — GO is large and
  only has EL axioms; ELK is the default and is sufficient. HermiT will not scale.
- **Run from the repo, not a stray subdir.** `odk-run.sh` figures out the repo
  root from its own path, but the *paths you pass to commands* are interpreted
  inside `/work/src/ontology`. Keep the repo as your working tree.
- **First run pulls the image.** If the ODK image isn't cached locally, the first
  `docker` invocation downloads it (can take a while). This is expected.
- **Don't commit build artifacts.** Targets write many derived files (`*.ofn`,
  `*.owl`, `reasoned.*`, reports). Only commit the source files you actually
  edited (normally `src/ontology/go-edit.obo`), per CLAUDE.md.
- **Don't edit `run.sh` to drop `-ti`** — console editors rely on the interactive
  shell. Use `odk-run.sh` for non-interactive runs instead.
