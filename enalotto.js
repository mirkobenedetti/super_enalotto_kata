
var numbers = [];

function unique(array) {
	return array.filter(function(el, index, arr) {
		return index == arr.indexOf(el);
	});
}

var numSort = function (a, b) {
	return a - b;
}

while(numbers.length < 6) {
	numbers.push(Math.floor((Math.random() * 90) + 1));
	numbers = unique(numbers);
}

numbers.sort(numSort);

numbers.forEach(function(number, index) {
	if(number < 10) process.stdout.write("0");
	number = number.toString();
	process.stdout.write(number);
	if(index < 5) process.stdout.write(" - ");
});

console.log("");