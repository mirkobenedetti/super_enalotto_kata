
package main

import "fmt"
import "sort"
import "time"
import "math/rand"

func main() {
	numbers := make(map[int]struct{})

	for len(numbers) < 6 {
		rand.Seed(time.Now().UTC().UnixNano())
		r1 := rand.Intn(89) + 1
		numbers[r1] = struct{}{}
	}

	var values []int
	for k := range numbers {
		values = append(values, k)
	}
	
	sort.Ints(values)

	for index, value := range values {
		if(value < 10) {fmt.Print(0)}
		fmt.Print(value)
		if(index < 5) {fmt.Print(" - ")}
	}

	fmt.Println("")
}