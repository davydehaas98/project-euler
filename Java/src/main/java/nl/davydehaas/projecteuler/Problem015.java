package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

public class Problem015 {

    void main() {
        timeSolution(Problem015::solve);
    }

    static long solve() {
        int xPoints = 20 + 1;
        int yPoints = 20 + 1;
        long[][] grid = new long[xPoints][yPoints];

        for (int x = 0; x < xPoints; x++) {
            for (int y = 0; y < yPoints; y++) {
                if (x == 0 || y == 0) {
                    // Sides are always 1.
                    grid[x][y] = 1;
                } else {
                    grid[x][y] = grid[x - 1][y] + grid[x][y - 1];
                }
            }
        }

        return grid[xPoints - 1][yPoints - 1];
    }
}
