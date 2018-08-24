object Enalotto {
  def main(args: Array[String]): Unit = {
	val numbers = scala.collection.mutable.SortedSet[Int]()
	val r = scala.util.Random

	while(numbers.size < 6) {
		numbers += r.nextInt(90) + 1
	}

	for ((number, index) <- numbers.view.zipWithIndex) {
		if(number < 10) print("0")
		print(number)
		if(index < 5) print(" - ")
	}
	
	println("")
  }
}