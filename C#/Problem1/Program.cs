using System;

namespace Problem1
{
    internal static class Program
    {
        private static void Main()
        {
            const int number = 1000;
            var sum = 0;

            for (var i = 1; i < number; i++)
                if (i % 3 == 0 || i % 5 == 0)
                    sum += i;

            Console.WriteLine("The sum of all numbers below {0} dividable by 3 and 5 is: {1}", number, sum);
        }
    }
}
