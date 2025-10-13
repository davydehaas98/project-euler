package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

public class Problem007 {

    void main() {
        timeSolution(Problem007::solve);
    }

    static Number solve() {
        int square = 0;
        int number = 0;

        for (int i = 0; i < 101; i++) {
            square += i;
            number += i * i;
        }

        // The difference between the sum of
        // the squares of the first one hundred natural numbers
        // and the square of the sum
        return square * square - number;
    }
}
