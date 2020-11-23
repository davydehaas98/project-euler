using System;

namespace Problem003
{
    internal static class Program
    {
        private static void Main()
        {
            const long number = 600851475143;
            var prime = number;

            for (var i = 1; i < prime; i++)
                if (prime % i == 0)
                    prime /= i;

            Console.WriteLine("The largest prime factor of {0} is: {1}", number, prime);
        }
    }
}
