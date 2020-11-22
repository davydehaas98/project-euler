using System;
using System.Collections.Generic;
using System.Linq;

namespace Problem2
{
    internal static class Program
    {
        private static void Main()
        {
            var fibonacciNumbers = new List<int>
            {
                1,
                2
            };

            for (var i = 2; i < 1000; i++)
            {
                var number = fibonacciNumbers[i - 2] + fibonacciNumbers[i - 1];

                if (number > 4000000) break;

                fibonacciNumbers.Add(number);
            }

            var sum = fibonacciNumbers.Where(t => t % 2 == 0).Sum();

            Console.WriteLine("The sum of the even Fibonacci numbers not exceeding 4 million is: " + sum);
        }
    }
}
