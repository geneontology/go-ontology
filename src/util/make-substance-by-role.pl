#!/usr/bin/perl
use strict;

my $suffix;
my $rel;


while ($ARGV[0] =~ m@^-@) {
    my $opt = shift @ARGV;
    if ($opt eq '-s' || $opt eq '--suffix') {
        $suffix = shift @ARGV;
    }
    elsif ($opt eq '-r' || $opt eq '--rel') {
        $rel = shift @ARGV;
    }
    else {
        die $opt;
    }
}
die unless $suffix;
die unless $rel;

my $id;
my $name;
while(<>) {
    chomp;
    last if m@^\[Typedef@;
    next if m@^namespace:@;
    if (m@^id: (\S+)@) {
        $id = $1;
    }
    s@CHEBI:@GOCHE:@;
    if (m@^name:\s+(.*)@) {
        $name = $1;
        $_ = "name: substance with $name $suffix";
    }
    if (m@synonym:@) {
        s@\[\w+:\]@\[\]@;
    }
    print "$_\n" unless m@^is_a: CHEBI:50906@;

    if (m@^is_a:@) {
        print  "intersection_of: CHEBI:24431 ! chemical entity\n";
        print "intersection_of: $rel $id ! $name\n";
    }
}
