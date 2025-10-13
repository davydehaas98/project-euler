package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

import java.util.Arrays;

public class Problem002 {

    void main() {
        timeSolution(Problem002::solve);
    }

    static Number solve() {
        int limit = 4_000_000;
        int[] fibonacciNumbers = new int[1000];
        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 2;

        for (int i = 2; i < 1000; i++) {
            int number = fibonacciNumbers[i - 2] + fibonacciNumbers[i - 1];
            if (number > limit) {
                break;
            }
            fibonacciNumbers[i] = number;
        }

        // All even Fibonacci numbers
        return Arrays.stream(fibonacciNumbers)
                .filter(i -> i % 2 == 0)
                .sum();
    }
}
