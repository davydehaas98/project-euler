using System;
using System.Collections.Generic;

namespace Problem2
{
    class Program
    {
        static void Main(string[] args)
        {
            var sum = 0;
            var fibonacciNumbers = new List<int>();
            var evenFibonacciNumbers = new List<int>();

            fibonacciNumbers.Add(1);
            fibonacciNumbers.Add(2);

            for (var i = 2; i < 1000; i++)
            {
                var number = fibonacciNumbers[i - 2] + fibonacciNumbers[i - 1];
                
                if (number > 4000000) break;
                
                fibonacciNumbers.Add(number);
            }

            for (var i = 0; i < fibonacciNumbers.Count; i++)
            {
                if (fibonacciNumbers[i] % 2 == 0)
                    sum += fibonacciNumbers[i];
            }
            
            Console.WriteLine("The sum of the even Fibonacci numbe    rs not exceeding 4 million is: " + sum);
        }
    }
}
