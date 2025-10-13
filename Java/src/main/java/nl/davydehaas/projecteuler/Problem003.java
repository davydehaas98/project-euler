package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

import java.util.Arrays;

public class Problem003 {

    void main() {
        timeSolution(Problem003::solve);
    }

    static Number solve() {
        var number = 600_851_475_143L;

        // Find the largest prime factor
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                number /= i;
            }
        }

        // The largest prime factor
        return number;
    }
}
