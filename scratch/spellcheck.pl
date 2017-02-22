#!/usr/bin/perl
foreach my $f (@ARGV) {
    print STDERR "CHECKING $f\n";
    open(F,$f);
    while(<F>) {
        if (m@pizza@i) {
            push(@errs, $_);
            print STDERR "No pizza allowed: $_  in $f\n";
        }
    }
}
if (!scalar(@errs)) {
    print STDERR "ALL OK!\n";
}
exit(scalar(@errs));
