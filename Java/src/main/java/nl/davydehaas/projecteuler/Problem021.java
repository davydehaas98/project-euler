package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

public class Problem021 {

    void main() {
        timeSolution(Problem021::solve);
    }

    static int solve() {
        int maxRange = 10_000;
        int sum = 0;

        for (int a = 1; a < maxRange; a++) {
            int b = d(a);
            // Is amicable
            if (a != b && d(b) == a) {
                sum += a;
            }
        }

        return sum;
    }

    private static int d(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
