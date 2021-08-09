#!/usr/bin/perl
use strict;

my %disabled = ();

$disabled{'obo2obo-check'} = 1;
#$disabled{'xrf-abbs-check'} = 1;
my $xrf_abbs_file;

if (!@ARGV) {
    usage();
    exit 0;
}
while (scalar(@ARGV) && $ARGV[0] =~ /^\-./) {
    my $opt = shift @ARGV;
    if ($opt eq '-h' || $opt eq '--help') {
        usage();
        exit 0;
    }
    elsif ($opt =~ /^\-\-disable\-(.*)/) {
        $disabled{$1} = 1;
    }
    elsif ($opt =~ /^\-\-enable\-(.*)/) {
        delete $disabled{$1};
    }
    elsif ($opt eq '--xref-abbs') {
        $xrf_abbs_file = shift @ARGV;
    }
    else {
        print STDERR "Unknown option: $opt\n";
        exit 1;
    }
}


my @flags = ();

my @referenced_ids = ();
my @onts = ();
my %ns = ();
my %nameh = ();
my %obsh = ();
my %obsByNameh = ();
my %idByName = ();
my %idByDef = ();
my @all = ();
my %edge = ();
my %relUsageMap = ();
my $n_relationships = 0;
my %xp = ();
my %isa = ();
my %genus = ();
my $id = ""; # current id
my $def = ""; # current def
my $n = 0;
my $stanza_type;
my %isa_closure = ();
my %disjoint_h = ();
my %abbsh = ();
my @input_files = @ARGV;
my $s_type;
my %idcount = ();
my %defline;

if (!$xrf_abbs_file) {
    my $reldir = `dirname $ARGV[0]`;
    chomp $reldir;
    $xrf_abbs_file = "$reldir/../../doc/GO.xrf_abbs";
}

unless ($disabled{'obo2obo-check'}) {
    my $obo2obo = 'obo2obo';
    if (system("which $obo2obo")) {
	flag("$obo2obo is not available - check your PATH env var");
    }
    else {
	if (@input_files) {
	    if (system("$obo2obo -o /dev/null @input_files")) {
		flag("obo2obo failed on @input_files");
	    }
	}
	else {
	    flag("you must specify input files");
	}
    }
}

unless ($disabled{'xrf-abbs-check'}) {
    open(F,$xrf_abbs_file) || die $xrf_abbs_file;
    while(<F>) {
        if (/^abbreviation: (\S+)/) {
            $abbsh{$1} = 1;
        }
    }
    close(F);
}

my $line = '';
while (<>) {
    chomp;
    $line = $_;

    if (m@^>>>@ || m@^<<<@ || m@^===@) {
        flag('merge-markers', 'Line has git merge markers indicating a failed merge: ', $line);
    }
    
    if (/^\[(\S+)\]$/) {
        if ($stanza_type eq "Term") {
            # check that the prev stanze is a term, has an id and validate that def is not empty
            if (length($id) > 0) {
                if (length($def) == 0) {
                    flag('has-definition', 'missing definition for id', $id);
                }
            }
        }
        $stanza_type = $1;
        $def = ""; # reset current def for each frame
        $id = ""; # reset current id for each frame
    }
    if (/^id:\s+(\S+)/) {
        $id=$1;
        $s_type->{$id} = $stanza_type;
        if ($stanza_type eq 'Typedef') {
            if ($relUsageMap{$id}) {
                delete $relUsageMap{$id};
            }
        }
        if ($stanza_type eq 'Term') {
            if ($id !~ m@:@ || $id =~ m@_@) {
                flag('bad-id', 'badly formatted id', $id);
            }
        }
            
    }
    if (/^(id|alt_id):\s+(\S+)/) {
        my $idref = $2;
        if ($idcount{$idref}) {
            flag('ID-mentioned-twice:',$idref);
        }
        $idcount{$idref}++;
    }    
    if (/^ontology:\s+(.*)/) {
        push(@onts, $1);
    }
    if (/^name:\s+(.*)/) {
        my $n = $1;
        $nameh{$id} = $n;
        push(@{$idByName{$n}},$id);
        if (/\{.*=\"/) {
            flag("axiom annotation in label", "in: $id -- line: $_");
        }
    }
    if (/^name:\s+(obsolete .*)/) {
        $obsByNameh{$id} = $1;
    }
    if (/^disjoint_from:\s*(\S+)/) {
        my $y = $1;
        push(@{$disjoint_h{$id}},$y);
        push(@{$disjoint_h{$y}},$id);
    }
    if (/^is_a: (\S+)/) {
        if ($1 =~ /^$id$/) {
            flag('circular is_a ref', "in: $id -- line: $_");
        }
        $edge{$id}{$1}{'is_a'}++;
        push(@{$isa{$id}},$1);
        push(@referenced_ids, $1) if $stanza_type eq 'Term';

    }
    if (/^relationship: (\S+) (\S+)/) {
        if ($2 =~ /^$id/) {
        	flag("circular $1 ref", $id);
        }
        $edge{$id}{$2}{$1}++;
        $relUsageMap{$1}++;
        $n_relationships++;
        push(@referenced_ids, $2);
    }
    if (/^intersection_of:\s*(.*)/) {
        my $arg1 = $1;
        if ($arg1 =~ /$id/) {
            flag("circular intersection_of ref", $id);
        }
        push(@{$xp{$id}},$arg1);
        if (/^intersection_of:\s+(\S+)\s+(\S+)\s\!/) {        
            $relUsageMap{$1}++;
            push(@referenced_ids, $2);
        }
        elsif (/^intersection_of:\s+(\S+)\s+(\S+)\s*$/) {        
            $relUsageMap{$1}++;
            push(@referenced_ids, $2);
        }
        else {
            $arg1 =~ s@\s*\!.*@@;
            push(@referenced_ids, $arg1);
            push(@{$genus{$id}}, $arg1);
        }
    }
    if (/^is_obsolete: true/) {
        $obsh{$id} = 1;
    }
    if (/^namespace:\s+(\S+)/) {
        $ns{$id} = $1;
    }
    if (/^def:\s+\"(.*)\"\s+\[/) {
        $def = $1;
        push(@{$idByDef{$def}},$id) unless $def eq '.';
    }
    if (/^def:\s+\".*\"\s+\[([^\"].*)\]/) {
        my $dx = $1;
        check_xref(split(/,\s+/,$dx));
        $defline{$id} = $_;
    }
    if (/^def:\s+\".*\"\s+\[\]/) {
        flag('definition-lacks-dbxref', $id) unless $s_type->{$id} eq 'Typedef';
    }

    push(@all,$_);

    if (/^==/ || /^\<\</ || /^\>\>/) {
	flag("CVS conflict marker: $_");
    }

    unless ($disabled{'is-symmetric-check'}) {
        # See #12654
        if (/^is_symmetric/) {
            flag("Unexpected symmetry axiom found in line: $_ -- are you really sure you need this?");
        }
    }
    
    
    unless ($disabled{'null-definition-dbxref-check'}) {
        if (/^def: .* " \[\]/) {
            flag('null-definition-dbxref-check', "Line: $_") unless $s_type->{$id} eq 'Typedef';
        }
    }

    unless ($disabled{'owl-axiom-check'}) {
        if (/^owl-axiom/) {
            flag('owl-axiom-check', "Line: $_");
        }
    }

    unless ($disabled{'null-dbxref-check'}) {
        if (/\<new dbxref\>/) {
            flag('null-dbxref-check', "Line: $_");
        }
    }

    unless ($disabled{'non-simple-property-check'}) {
        if (/ (has_part|part_of)\s+(\S+)\s*\{.*cardinality=/i) {
            flag('non-simple-property-check', "Line: $_");
        }
    }

    unless ($disabled{'null-synonym-check'}) {
        if (/\<new synonym\>/) {
            flag('null-synonym-check', "Line: $_");
        }
    }

    unless ($disabled{'whitespace-synonym-check'}) {
        if (/^synonym: ".*\s+" \w+ /) {
            flag('whitespace-synonym-check', "Line: $_");
        }
        if (/^synonym: "\s+.*" \w+ /) {
            flag('whitespace-synonym-check', "Line: $_");
        }
        if (/^synonym: ".*\s\s.*" /) {
            flag("synonym has double-whitespace", "line: $_");
        }
        if (/^name: .*\s\s/) {
            flag("label has double-whitespace", "line: $_");
        }

    }

    unless ($disabled{'pmid-check'}) {
	if (/PMID:(.*)/) {
	    if ($1 !~ /^[1-9]/) {
		flag("bad-pmid", "Line: $_");
	    }
	}
    }

    unless ($disabled{'whitespace-check'}) {
        # note this is more specific than the synonym check above
        # currently too specific see https://github.com/geneontology/go-ontology/issues/21941
        #if (/[^\.]\s\s/) {
        #    flag("double-whitespace", "line: $_");
        #}
        if (/\s$/) {
            flag("EOL whitespace", "line: $_");
        }
        if (/\t/) {
            flag("tab", "line: $_");
        }
    }
    

    unless ($disabled{'ascii-check'}) {
        if (/[\200-\377]/ ||
            /[\0-\10]/ ||
            /[\16-\37]/ ||
            /\177/) {
            flag('ascii-check',"Line: $_");
        }
    }
    if (/^\s*$/) {
        unless ($disabled{'isa-incomplete-strict'}) {
            if ($id &&
                !@{$isa{$id} || []}) {
                if ($id eq 'GO:0008150' || $id eq 'GO:0005575' || $id eq 'GO:0003674') {
                    # one of 3 hardcoded root notes
                }
                elsif ($obsh{$id}) {
                    # obsolete classes have no isa parents
                }
                #elsif ($xp{$id}) {
                #    # logically defined classes need to have isa parents asserted in edit version
                #}
                elsif ($stanza_type eq 'Typedef') {
                    # we don't expect relations to have parents
                }
                else {
                    flag('isa-incomplete',$id);
                }
            }
        }
        unless ($disabled{'isa-incomplete'}) {
            ## Note: code is duplicated from above
            if ($id &&
                !@{$isa{$id} || []}) {
                if ($id eq 'GO:0008150' || $id eq 'GO:0005575' || $id eq 'GO:0003674') {
                    # one of 3 hardcoded root notes
                }
                elsif ($obsh{$id}) {
                    # obsolete classes have no isa parents
                }
                # differs from strict check in this clause:
                elsif ($xp{$id}) {
                    # logically defined classes need to have isa parents asserted in edit version
                }
                elsif ($stanza_type eq 'Typedef') {
                    # we don't expect relations to have parents
                }
                else {
                    flag('isa-incomplete',$id);
                }
            }
        }
    }
}

unless ($disabled{'obsolete-name-check'}) {
    foreach my $id (keys %obsh) {
        if (!$obsByNameh{$id}) {
            flag('obsolete-class-should-have-prefixed-label', "$id");
        }
    }
    foreach my $id (keys %obsByNameh) {
        if (!$obsh{$id}) {
            flag('non-obsolete-class-has-obsolete-label', "$id -> $obsByNameh{$id}");
        }
    }
}

unless ($disabled{'no-logical-axioms-on-obsolete-check'}) {
    foreach my $id (keys %obsh) {
        if ($xp{$id}) {
            flag('logic-axiom-references-obsolete', "$id has logical def @{$xp{$id}}");
        }
        if ($edge{$id}) {
            foreach (keys %{$edge{$id}}) {
                flag('logic-axiom-references-obsolete', "$id has relationship to $_");
            }
        }
        if ($disjoint_h{$id}) {
            flag('logic-axiom-references-obsolete', "$id $nameh{$id} in disjointness axiom $disjoint_h{$id}");
        }
    }
}

unless ($disabled{'duplicate-names'}) {
    foreach my $n (keys %idByName) {
        my @ids = grep { !$obsh{$_} } @{$idByName{$n}};
        if (@ids > 1) {
            flag('duplicate-names',"@ids --> $n");
        }
    }
}

unless ($disabled{'duplicate-defs'}) {
    foreach my $d (keys %idByDef) {
        my @ids = grep { !$obsh{$_} } @{$idByDef{$d}};
        if (@ids > 1) {
            flag('duplicate-defs',"@ids --> $d");
        }
    }
}

unless ($disabled{'single-labeled-edges'}) {
    foreach my $i (keys %edge) {
        foreach my $j (keys %{$edge{$i}}) {
            my @rels = keys %{$edge{$i}{$j}};
            if (@rels > 1) {
                if (@rels == 2 && grep {$_ eq 'results_in'} @rels) {
                    # this is allowed
                }
                else {
                    flag('multiply-labeled-edge',"$i $j --> @rels");
                }
            }
        }
    }
}

unless ($disabled{'referenced-id-syntax-check'}) {
    foreach my $id (@referenced_ids) {
        if ($id =~ /^(\S+):(\d+)/) {
            ##check_xref($id);
        }
        else {
            flag('invalid-id-reference',"$id");
        }
    }
}

unless ($disabled{'single-intersection-tag'}) {
    foreach my $i (keys %xp) {
        if (scalar(@{$xp{$i} || []}) == 1) {
            flag('single intersection_of tag',"$i");
        }
    }
}

unless ($disabled{'namespace-switch'}) {
    foreach my $x ((keys %isa), (keys %genus)) {
        foreach my $y ((@{$isa{$x} || []}), (@{$genus{$x} || []})) {
            if ($ns{$x} ne $ns{$y}) {
                flag('namespace-different-from-is_a-parent',"$x in $ns{$x}, $y in $ns{$y}");
            }
        }
    }
}

unless ($disabled{'disjoint-violation'}) {
    calc_isa_closure();
    foreach my $i (keys %isa) {
         foreach my $xd (keys %{$isa_closure{$i}}) {
            if ($disjoint_h{$xd}) {
                foreach my $yd (@{$disjoint_h{$xd}}) {
                    if ($isa_closure{$i}{$yd}) {
                        flag('disjoint_from_violation',"$i $nameh{$i} is_a $xd $nameh{$xd} + $yd $nameh{$yd}");
                    }
                }
            }
        }
    }
}

unless ($disabled{'ontology-declaration-check'}) {
    if (@onts == 1 && $onts[0] eq 'go') {
        # ok
    }
    else {
        flag('ontology-declaration-check', "@onts");
    }
}

unless ($disabled{'dangling-relations'}) {
    foreach my $k (keys %relUsageMap) {
        flag('Undeclared relation',$k);
    }
}

unless ($disabled{'must-have-relationships'}) {
    if (!$n_relationships) {
        flag('relationships have vanished',$n_relationships);
    }
}

my @no_go = (
'cellular_component is_a molecular_function',
'cellular_component is_a biological_process',
'molecular_function is_a cellular_component',
#'molecular_function is_a biological_process',
'biological_process is_a cellular_component',
'biological_process is_a molecular_function',
## part_of
'cellular_component part_of molecular_function',
'cellular_component part_of biological_process',
'molecular_function part_of cellular_component',
#'molecular_function part_of molecular_function',   ## but these are WRONG!!
'biological_process part_of cellular_component',
'biological_process part_of molecular_function',
## has_part
'cellular_component has_part molecular_function',
'cellular_component has_part biological_process',
'molecular_function has_part cellular_component',
#'molecular_function has_part molecular_function',  ## and so are these!
'molecular_function has_part biological_process',
'biological_process has_part cellular_component',
## regulation
'cellular_component regulates cellular_component',
'cellular_component regulates molecular_function',
'cellular_component regulates biological_process',
'molecular_function regulates cellular_component',
'biological_process regulates cellular_component',
'cellular_component negatively_regulates cellular_component',
'cellular_component negatively_regulates molecular_function',
'cellular_component negatively_regulates biological_process',
'molecular_function negatively_regulates cellular_component',
'biological_process negatively_regulates cellular_component',
'cellular_component positively_regulates cellular_component',
'cellular_component positively_regulates molecular_function',
'cellular_component positively_regulates biological_process',
'molecular_function positively_regulates cellular_component',
'biological_process positively_regulates cellular_component',
);

foreach my $i (keys %edge)
{	next if $s_type->{$i} ne 'Term';
	if (! $ns{$i})
	{
            ## allowed in megafile
            ##flag('no_namespace', "$i");
	}
	else
	{	my $ns1 = $ns{$i};
		foreach my $j (keys %{$edge{$i}})
		{	
                    my $ns2 = $ns{$j};
                    foreach my $r (keys %{$edge{$i}{$j}})
                    {	if (grep { $_ eq "$ns1 $r $ns2" } @no_go)
                        {	flag('illegal_relations', "$i ($ns1) $r $j ($ns2)");
                        }
                    }
                    
		}
	}
}

if ($#flags > 0) {
    # obtain month, day, and year for the subject line for the report email
    my ($sec,$min,$hour,$mday,$mon,$year) = localtime(time);
    $year += 1900;
    $mon += 1;
    ($mon = "0" . $mon) if ($mon < 10);
    ($mday = "0" . $mday) if ($mday < 10);

#    my $mailer = '/usr/bin/mailx';

    # if errors, something in the flags array, email the errors to go-ontology list

    my $recipients = "go-ontology\@lists.stanford.edu";
    my $subject = "OBO Check ERRORS, $mon-$mday-$year";

    open(MAIL, "> mailfile.txt") || die "Could not open mailer\n";

#    open(MAIL, "| $mailer -s '$subject' -b 'cherry\@stanford.edu' $recipients") || die "Could not open mailer\n";

    print MAIL "The following errors were reported by the OBO checking script.\n\n";

    print MAIL "This check runs nightly before the ontology is converted into the\nvarious OBO filenames.  Once the error(s) have been fixed the\nconversion will occur successfully.\n\n";

    print MAIL join(' ', @flags) . "\n";
    close(MAIL);
}

exit(scalar(@flags));

####

sub scriptname {
    my @p = split(/\//,$0);
    pop @p;
}

sub check_xref {
    my $x = shift;
    return unless keys (%abbsh);
    if ($x =~ m@^http://@) {
        return;
    }
    if ($x =~ m@^https://@) {
        return;
    }
    if ($x =~ /^([\w\-]+):/) {
        my $prefix = $1;
        if (!$abbsh{$prefix} && $prefix ne 'GOCHEREL') {
            flag('valid-id-space',"bad id space '$1' in xref $x");
        }
        else {
        }
    }
    else {
        flag('valid-id-space',"bad xref: $x Line: $line");
    }
}

sub flag {
    my $type = shift;
    my $msg = shift;
    my @rest = @_;
    if ($disabled{$type}) {
        return 0;
    }
    my $msg = "ERROR: $type: $msg\n";
    print STDERR "@rest :: $msg ";
    push(@flags,$msg);
    return 0;
}

sub calc_isa_closure {
    return if %isa_closure; # done
    foreach my $s (keys %isa) {
        get_isa_closure($s);
    }
}
sub get_isa_closure {
    my $s = shift;
    my %superclass_h = ();
    return %{$isa_closure{$s}} if $isa_closure{$s};
    $superclass_h{$s}=1;
    foreach my $p (@{$isa{$s}}) {
        %superclass_h =
            (%superclass_h,
             get_isa_closure($p));
    }
    #printf STDERR "$s -> $_\n" foreach keys %superclass_h;
    $isa_closure{$s} = \%superclass_h;
    return %superclass_h;
}

sub usage {
    my $sn = scriptname();

    print <<EOM;
$sn [--disable-CHECK]* [--enable-CHECK]* [--xref-abbs XRF_ABBS] OBO-FILE

GO-specific ontology check

The following checks are currently implemented and enabled by default

+ duplicate-names:
   no two non-obsolete terms should have identical names
+ single-labeled-edges
   maximum one asserted edge between any two terms
+ ascii-check
   only ascii characters should be used

If any check fails, exits with non-zero error code, writes report on STDERR
If all checks pass with no problems flagged, exists with zero error code

EOM

}

