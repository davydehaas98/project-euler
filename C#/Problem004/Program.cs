using System;
using System.Linq;

namespace Problem004
{
    internal static class Program
    {
        private static void Main()
        {
            var largestPalindrome = 0;

            for (var x = 100; x <= 999; x++)
            for (var y = 100; y <= 999; y++)
            {
                var number = x * y;

                if (number > largestPalindrome && IsPalindrome(number.ToString()))
                    largestPalindrome = number;
            }

            Console.WriteLine(
                "The largest palindrome made from the product of two 3-digit numbers is: {0}", largestPalindrome
            );
        }

        private static bool IsPalindrome(string number)
        {
            return number == new string(number.Reverse().ToArray());
        }
    }
}
