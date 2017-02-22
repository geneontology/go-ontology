#!/usr/bin/perl
foreach my $f (@ARGV) {
    print STDERR "CHECKING $f\n";
    open(F,"cat $f | aspell -a check|");
    while(<F>) {
        if (m@\&@) {
            push(@errs, $_);
            print STDERR "ERR: $_  in $f\n";
        }
    }
}
if (!scalar(@errs)) {
    print STDERR "ALL OK!\n";
}
exit(scalar(@errs));
