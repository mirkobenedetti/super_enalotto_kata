
from random import randint
import sys

numbers = set()

while len(numbers) < 6 :
	numbers.add(randint(1,90))

numbers = sorted(numbers)

for (index, number) in enumerate(numbers) :
	if(number < 10) :
		sys.stdout.write(str(0))

	sys.stdout.write(str(number))

	if(index < 5) :
		sys.stdout.write(" - ")

print ""