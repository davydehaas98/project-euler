using System;

namespace Problem6
{
    internal static class Program
    {
        private static void Main()
        {
            var square = 0;
            var number = 0;

            for (var i = 0; i <= 100; i++)
            {
                square += i;
                number += i * i;
            }

            var difference = square * square - number;

            Console.WriteLine(
                "The difference between the sum of the squares of the first one hundred natural numbers ({0}) " +
                "and the square of the sum ({1}) is: {2}",
                number, square * square, difference
            );
        }
    }
}
