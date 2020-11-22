using System;

namespace Problem7
{
    internal static class Program
    {
        private static void Main()
        {
            var number = 10001;
            var prime = 1;
            for (var i = 1; i <= number; i++)
            {
                var isPrime = true;
                if (number % i == 0)
                    isPrime = false;
                if (prime % i == 0)
                    prime /= i;
            }
            
            Console.WriteLine("The {0}th prime number is: {1}", number, prime);
        }
    }
}
