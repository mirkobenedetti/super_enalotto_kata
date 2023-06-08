
package com.prontobenedict.enalotto

import java.util.*

fun main(args : Array<String>) {
    val numbers: SortedSet<Int> = intArrayOf().toSortedSet()

    while(numbers.count() < 6) {
        numbers.add(randInt(1, 90))
    }

    for ((index, number) in numbers.withIndex()) {
        if(number < 10) print("0")
        print(number)
        if(index < 5) print(" - ")
    }
}

fun randInt(min: Int, max: Int): Int {
    val rand = Random()
    val randomNum = rand.nextInt(max - min + 1) + min
    return randomNum
}
