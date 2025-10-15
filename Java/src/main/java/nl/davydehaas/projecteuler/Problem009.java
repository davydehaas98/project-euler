package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

public class Problem009 {

    void main() {
        timeSolution(Problem009::solve);
    }

    static Number solve() {
        int target = 1000;

        for (int a = 1; a < target / 3; a++) {
            for (int b = 1; b < target / 2; b++) {
                int c = target - a - b;

                if (a < b && b < c) {
                    if (a * a + b * b == c * c) {
                        return a * b * c;
                    }
                }
            }
        }

        return null;
    }
}
