
import Foundation

var numbers = Set<Int>()

while numbers.count < 6 {
    numbers.insert(Int(arc4random_uniform(90) + 1))
}

for (index, number) in numbers.sort().enumerate() {
    if number < 10 {
        print("0", terminator:"")
    }
    
    print(number, terminator:"")
    
    if index < 5 {
        print(" - ", terminator:"")
    }
}

print("")