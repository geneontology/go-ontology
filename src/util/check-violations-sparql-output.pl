#!/usr/bin/perl
my $n=0;
foreach my $f (@ARGV) {
    @fails = ();
    open(F,$f) || die $f;
    $hdr = <F>;
    foreach (<F>) {
        chomp;
        print STDERR "violation: $_ // in $f\n";
        $n++;
    }
    close(F);
}
print STDERR "Violations: $n\n";
exit($n);
