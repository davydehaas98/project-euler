package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

public class Problem014 {

    void main() {
        timeSolution(Problem014::solve);
    }

    private static int calculateChain(long n, int iteration) {
        iteration += 1;

        // Stop the chain if 1 has been reached.
        if (n == 1) {
            return iteration;
        }
        // Calculate the next step in the chain
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = 3 * n + 1;
        }

        return calculateChain(n, iteration);
    }

    static int solve() {
        int maxNumber = 1_000_000;
        int longestChain = 0;
        int longestNumber = 0;

        for (int currentNumber = 2; currentNumber < maxNumber; currentNumber++) {
            int currentChain = calculateChain(currentNumber, 0);

            if (currentChain > longestChain) {
                longestChain = currentChain;
                longestNumber = currentNumber;
            }
        }

        return longestNumber;
    }
}
