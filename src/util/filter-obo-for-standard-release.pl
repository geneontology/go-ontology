#!/usr/bin/perl
use strict;

our %basic_relation_h =
    (
     is_a=>1,
     part_of=>1,
     regulates=>1,
     negatively_regulates=>1,
     positively_regulates=>1,
    );

my @errors = ();
my $add_data_version = 0;
if ($ARGV[0] && $ARGV[0] =~ /^\-.+/) {
    my $opt = shift @ARGV;
    if ($opt eq '-h' || $opt eq '--help') {
        usage();
        exit 0;
    }
    elsif ($opt eq '--add-data-version') {
        $add_data_version = 1;
    }
    elsif ($opt eq '--no-add-data-version') {
        $add_data_version = 0;
    }
    else {
        print STDERR "Unknown option: $opt\n";
        exit 1;
    }
}

# ----------------------------------------
# initial pass:
#   build a lookup table mapping IDs to
#   namespaces
# ----------------------------------------

my %term = ();
my %ns = ();
my @all = ();
my $id; # current id
my $n = 0;
my $revision;
my $data_version;
my %isa_h = ();
while (<>) {
    if (/^id:\s+(\S+)/) {
        $id=$1;
        $term{$1} = $_;
    }
    if (/^is_a:\s+(\S+)/) {
        $isa_h{$id}{$1}++;
    }
    if (/^remark:.*Revision:\s+(\S+)/) {
        $revision = $1;
        # Example: remark: cvs version: $Revision: 2480 $
        s/\$Revision:\s*\d*\s*\$/use data-version/;
    }
    if (/^namespace:\s+(\S+)/) {
        $ns{$id} = $1;
    }
    if (/^data-version:\s+(\S+)/) {
        $data_version = $1;
    }
    push(@all,$_);
}

# ----------------------------------------
# filter:
#   write all lines except those
#   that are for inter-ontology links
# ----------------------------------------
my $line_no = 0;
my $stanza_type;
foreach (@all) {
    $line_no++;
    if (/^\[(\S+)\]/) {
        $stanza_type=$1;  
    }

    if (/^id:\s+(\S+)/) {
        $id=$1;  
    }

    if (/^property_value/) {
        next;
    }

    if (/^expand_assertion_to/) {
        next;
    }

    # A common OE error is misconfiguring resulting in IDs with prefix "ID:"
    # (note: see check-obo-for-standard-release.pl)
    if ($id =~ /^ID:/) {
        flag("incorrect ID-space in line: $id");
    }

    if (/^==/ || /^\<\</ || /^\>\>/) {
	flag("CVS conflict marker: $_");
    }

    if (/^date:/) {
        # note: no longer required, this is pre-populated by Oort using standard obolibrary YYYY-MM-DD system
        if ($add_data_version && !$data_version) {
            print "data-version: 1.$revision\n";
        }
    }

    if (/^relationship:\s*(\S+)\s+(\S+)/) {
        my $rel = $1;
        my $target = $2;
        if ($target eq $id) {
            flag("self-reference: $id --$rel--> $target");
        }
        if ($isa_h{$id}{$target}) {
            print STDERR "Filtering out link: $id $rel $target, as the edge is_a: $target already exists. Otherwise multiply-labeled-edge will fail\n";
            $n++;
        }
        elsif ($ns{$target} ne $ns{$id}) {
            # inter-ontology link. do not write
            print STDERR "Filtering out inter-ontology link: $id $rel $target // $ns{$id} $ns{$target}\n";
            $n++;
        }
        elsif ($ns{$target} eq 'molecular_function' && $rel =~ /regulates/) {
            # intra-MF regulates link. do not write
            print STDERR "Filtering out intra-ontology MF regulates link: $id r:$rel t:$target // in $ns{$target}\n";
            $n++;
        }
        elsif (!$basic_relation_h{$rel}) {
            # filter out has_part etc
            print STDERR "Filtering out non-standard relation: $id r:$rel t:$target // in $ns{$target}\n";
            $n++;
        }
        else {
            print "$_";
        }
    }
    elsif (/^is_a:\s*(\S+)/) {
        if ($1 eq $id) {
            flag("self-reference: $id --is_a--> $1");
        }
        print $_;
    }
    elsif (/^created_by:/) {
        # filter for now
    }
    elsif (/^creation_date:/) {
        # filter for now
    }
    elsif (/^disjoint_from:/) {
        print STDERR "Filtering out disjoint_from axioms between stanzas: $id $_\n";
        $n++;
        #if ($stanza_type eq 'Term') {
        #    print $_;
        #}
        #else {
        #    print STDERR "Filtering out disjoint_from axioms between relations: $id $_\n";
        #    $n++;
        #}
    }
    elsif (/^intersection_of:/) {
        print STDERR "Filtering $id -- $_";
        $n++;
        # filter for now, although we may choose to include at some future date
    }
    else {
        print "$_";
    }
}

print STDERR "\nRemoved: $n links\n";

if (@errors) {
    printf STDERR "There were %d errors. The editors file should NOT be propagated!\n", scalar(@errors);
    exit 1;
}

exit(0);

sub flag {
    my $msg = shift;
    print STDERR "Error in line: $line_no \"$msg\"\n";
    push(@errors,$msg);
    return;
}

sub scriptname {
    my @p = split(/\//,$0);
    pop @p;
}


sub usage {
    my $sn = scriptname();

    print <<EOM;
$sn FILE [FILE2..]

This file filters certain content from the full/extended GO obo file
to generate the GO basic file.

At this time this includes the following steps:

1. filters inter-ontology link
2. filters intra-molecular_function ontology regulates links

As of Feb 9 2009, the full GO will include regulation links that span
ontologies (BP to MF), and regulation links within MF. This script
will filter out these additions.

Note that the actual behavior of this script may change with time, as
we add more advanced content to the full GO.

The filtered ontology is written on STDOUT

A report is written on STDERR

EOM
}

