
import java.util.Random  
Random rand = new Random()

SortedSet<Integer> numbers = [] as SortedSet<Integer>

while (numbers.size() < 6) {
	numbers.addAll(rand.nextInt(90) + 1)
}

index = 0
numbers.each({ number ->
	if(number < 10) print "0"
	print number
	if(index < 5) print " - "
	index++
})

println ""