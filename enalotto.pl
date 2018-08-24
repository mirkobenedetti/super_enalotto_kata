#!/usr/bin/perl

use 5.16.0;
use warnings;

my %data = ();
my @keys = keys %data;

while(@keys < 6) {
	$data{1 + int(rand(90))} = 1;
	@keys = keys %data;
}

my @numbers = sort { $a <=> $b } @keys;

while (my ($index, $number) = each @numbers) {
	print "0" if ($number < 10);
	print "$number";
	print " - " if ($index < 5);
}

print "\n";