using System;

namespace Problem5
{
    internal static class Program
    {
        private static void Main()
        {
            var number = 20;

            while (!IsDivisible(number)) number += 20;

            Console.WriteLine(
                "The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is: {0}",
                number
            );
        }

        private static bool IsDivisible(int number)
        {
            for (var i = 1; i <= 20; i++)
                if (number % i != 0)
                    return false;

            return true;
        }
    }
}
