
require 'set'

numbers = SortedSet.new

while numbers.size() < 6  do
	numbers.add(rand(90) + 1)
end

numbers.each_with_index do |number, index|
	print "0" if number < 10
	print number
	print " - " if index < 5
end

puts ""