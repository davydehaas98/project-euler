package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

public class Problem007 {

    void main() {
        timeSolution(Problem007::solve);
    }

    static Number solve() {
        int target = 10001;
        int numberOfPrimes = 1;
        int number = 1;

        while (numberOfPrimes < target) {
            number += 2;
            if (isPrime(number)) {
                numberOfPrimes++;
            }
        }
        // The 10001th prime number is
        return number;
    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        int counter = 3;
        while (counter * counter <= number) {
            if (number % counter == 0) {
                return false;
            }
            counter += 2;
        }
        return true;
    }
}
