using System;

namespace Problem3
{
    internal static class Program
    {
        private static void Main()
        {
            var number = 600851475143;
            var prime = number;

            for (var i = 1; i < prime; i++)
            {
                if (prime % i == 0)
                    prime /= i;
            }

            Console.WriteLine("The largest prime factor of the number " + number + " is: " + prime);
        }
    }
}
