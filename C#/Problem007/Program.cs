using System;

namespace Problem007
{
    internal static class Program
    {
        private static void Main()
        {
            const int target = 10001;

            var numberOfPrimes = 1;
            var number = 1;

            while (numberOfPrimes < target)
            {
                number += 2;

                if (IsPrime(number))
                    numberOfPrimes++;
            }

            Console.WriteLine("The {0}th prime number is: {1}", target, number);
        }

        private static bool IsPrime(int number)
        {
            if (number <= 1)
                return false;
            if (number == 2)
                return true;
            if (number % 2 == 0)
                return false;

            var counter = 3;

            while (counter * counter <= number)
            {
                if (number % counter == 0)
                    return false;

                counter += 2;
            }

            return true;
        }
    }
}
