using System;
using System.Collections.Generic;

namespace com.prontobenedict.enalotto
{
    class Enalotto
    {
        static void Main(string[] args)
        {
            SortedSet<int> numbers = new SortedSet<int>();
            Random rnd = new Random();

            while(numbers.Count < 6) {
                numbers.Add(rnd.Next(1, 91));
            }

            int index = 0;
            foreach(int number in numbers) {
                if(number < 10) Console.Write("0");
                Console.Write(number);
                if(index < 5) Console.Write(" - ");
                index++;
            }
        }
    }
}
