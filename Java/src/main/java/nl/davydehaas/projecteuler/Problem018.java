package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

import java.util.Arrays;

import nl.davydehaas.projecteuler.util.InputReader;

public class Problem018 {

    void main() {
        timeSolution(Problem018::solve);
    }

    static int solve() {
        int[][] pyramid = InputReader.readFile(18).stream()
                .map(line -> Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .toArray(int[][]::new);

        // Iterate from the digits array by -1 until 0
        for (int x = pyramid.length - 1; x > 0; x--) {
            for (int y = 0; y < x; y++) {
                // Get the highest sum of the two possible paths.
                pyramid[x - 1][y] += Math.max(pyramid[x][y], pyramid[x][y + 1]);
            }
        }

        return pyramid[0][0];
    }
}
