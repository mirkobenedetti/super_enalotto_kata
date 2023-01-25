
extern crate rand;

use std::collections::BTreeSet;
use rand::{thread_rng, Rng};

fn main() {
	let mut numbers: BTreeSet<u8> = BTreeSet::new();
	let mut rng = thread_rng();
	
	while numbers.len() < 6 {
		numbers.insert(rng.gen_range(1..90));
	}

	for(index, number) in numbers.iter().enumerate() {
		if *number < 10u8 {
			print!("0");
		}

		print!("{}", number);

		if index < 5 {
			print!(" - ");
		}
	}

	println!("");
}
