<?php

$numbers = array();

while(sizeof($numbers) < 6) {
	$numbers[] = mt_rand(1, 90);
	$numbers = array_unique($numbers);
}

sort($numbers);

foreach($numbers as $index => $number) {
	if($number < 10) echo "0";
	echo $number;
	if($index < 5) echo " - ";
}

echo "\n";