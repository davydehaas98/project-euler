package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

public class Problem005 {

    void main() {
        timeSolution(Problem005::solve);
    }

    static Number solve() {
        int number = 0;
        do {
            number += 20;
        } while (!isDivisible(number));

        // The smallest positive number that is evenly divisible by all the numbers from 1 to 20
        return number;
    }

    private static boolean isDivisible(int number) {
        for (int i = 1; i < 21; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }
}
