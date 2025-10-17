package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

import java.util.Arrays;

public class Problem012 {

    void main() {
        timeSolution(Problem012::solve);
    }

    static Number solve() {
        int targetDivisors = 500;
        int currentDivisors = 0;
        int currentTriangle = 1;
        int current = 0;

        while(currentDivisors <= targetDivisors) {
            current += currentTriangle;
            int squareRoot = 0;

            // Calculate the next triangle number.
            for (int i = 1; i < current + 1; i++) {
                int square = i * i;
                if (square > current) {
                    squareRoot = i;
                    break;
                }
            }

            // Calculate the total divisors of the current triangle number.
            currentDivisors = 1;
            for (int i = 1; i < squareRoot + 1; i++) {
                if (current % i == 0) {
                    if (current / i == i) {
                        currentDivisors += 1;
                    } else {
                        currentDivisors += 2;
                    }
                }
            }
            currentTriangle += 1;
        }
        return current;
    }
}
