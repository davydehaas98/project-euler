using System;

namespace Problem1
{
    class Program
    {
        static void Main(string[] args)
        {
            var sum = 0;

            for (var i = 1; i < 1000; i++)
                if (i % 3 == 0 || i % 5 == 0)
                    sum += i;

            Console.WriteLine("The sum of all numbers below 1000 dividable by 3 and 5 is: " + sum);
        }
    }
}
