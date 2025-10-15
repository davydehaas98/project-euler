package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem010 {

    void main() {
        timeSolution(Problem010::solve);
    }

    static Number solve() {
        int target = 2_000_000;

        List<Integer> primes = sieveOfEratosthenes(target - 1);

        return primes.stream()
                .mapToLong(Integer::longValue)
                .sum();
    }

    /// Returns all prime numbers from 1 to `target`
    ///
    /// - [Wikipedia](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)
    /// - [Geeks For Geeks](https://www.geeksforgeeks.org/sieve-of-eratosthenes)
    ///
    /// @return [List] of primes as [Integer]
    static List<Integer> sieveOfEratosthenes(int target) {
        // Create a boolean array "isPrime[0..n] and initialize all entries as true.
        // A value in isPrime[i] will be false if i is not a prime, else true.
        boolean[] isPrime = new boolean[target + 1];
        Arrays.fill(isPrime, true);

        int current = 2;
        List<Integer> primes = new ArrayList<>();

        while (current * current <= target) {
            // If isPrime[current] is not changed, then it is a prime
            if (isPrime[current]) {
                // Update all multiples of current
                for (int i = current * current; i < target + 1; i += current) {
                    isPrime[i] = false;
                }
            }
            current += 1;
        }

        // Add up all prime numbers
        for (int i = 2; i < target + 1; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
