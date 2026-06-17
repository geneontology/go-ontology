#!/bin/sh
# Non-interactive ODK runner for agents.
#
# This mirrors src/ontology/run.sh (same image, same mount, same workdir) but
# DROPS the `-ti` flags. run.sh requests an interactive TTY, which fails when
# there is no terminal attached (the usual case for an agent running commands):
#
#   cannot attach stdin to a TTY-enabled container because stdin is not a terminal
#
# Use this wrapper to run Makefile targets or one-off ODK tool commands. It can
# be invoked from anywhere in the repo (it locates the repo root from its own
# path) and reads the pinned ODK image tag straight from run.sh so it never
# drifts from what console users / CI use.
#
#   .claude/skills/odk-make/odk-run.sh make travis_build
#   .claude/skills/odk-make/odk-run.sh robot --version
#   .claude/skills/odk-make/odk-run.sh make reasoned.ofn

set -eu

REPO="$(cd "$(dirname "$0")/../../.." && pwd)"
RUN_SH="$REPO/src/ontology/run.sh"

if [ ! -f "$RUN_SH" ]; then
  echo "odk-run.sh: cannot find $RUN_SH (is this the go-ontology repo?)" >&2
  exit 1
fi

# Extract the pinned image, e.g. obolibrary/odkfull:v1.6.1, from run.sh.
IMG="$(grep -o 'obolibrary/odkfull:[^ "]*' "$RUN_SH" | head -n1)"
if [ -z "$IMG" ]; then
  echo "odk-run.sh: could not determine ODK image from $RUN_SH" >&2
  exit 1
fi

# Same memory limit and mount as run.sh, but no -ti.
exec docker run --rm -m 12g -v "$REPO:/work" -w /work/src/ontology "$IMG" "$@"
