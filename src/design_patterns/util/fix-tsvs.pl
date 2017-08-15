#!/usr/bin/perl
$n=0;
while(<>) {
    if ($n) {
        chomp;
        my @vals = split(/\t/,$_);
        @vals = map {fix($_)} @vals;
        #$_ = "\n".join(@vals)."\n";
        $_ = join("\t", @vals)."\n";
    }
    else {
        s@\?@@g;
        s@defined_class@iri@g;
        s@_label@ label@g;
        #s@_@ @g;
    }
    print $_;
    $n++;
}
exit 0;

sub fix {
    $_ = shift @_;
    if (m@<http://purl.obolibrary.org/obo/(\S+)_(\S+)>@) {
        $_ = "$1:$2";
    }
    else {
        s@^"@@;
        s@"$@@;
    }
    return $_;
}
