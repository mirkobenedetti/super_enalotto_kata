
import java.util.*;
import java.util.Random;

public class Enalotto {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<Integer>();

		while(numbers.size() < 6) {
			numbers.add(randInt(1, 90));
		}

		int index = 0;
		for (Integer item : numbers) {
			if(item < 10) System.out.print("0");
			System.out.print(item);
			if(index < 5) System.out.print(" - ");
			index++;
		}

		System.out.println("");
	}

	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
	
}