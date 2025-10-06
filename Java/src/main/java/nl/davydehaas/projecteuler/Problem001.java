package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

class Problem001 {

    public static void main(String[] args) {
        timeSolution(Problem001::solve);
    }

    static Number solve() {
        int target = 100;
        int sum = 0;

        for (int i = 0; i < target; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
