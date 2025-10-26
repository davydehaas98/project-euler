package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

import java.util.Arrays;

import nl.davydehaas.projecteuler.util.InputReader;

public class Problem011 {

    void main() {
        timeSolution(Problem011::solve);
    }

    static Number solve() {
        int[][] grid = InputReader.readFile(11).stream()
                .map(line -> Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .toArray(int[][]::new);

        int totalRows = grid.length;
        int totalColumns = grid[0].length;
        int size = 4;
        int largestProduct = 0;

        for (int x = 0; x < totalRows; x++) {
            for (int y = 0; y < totalColumns - size + 1; y++) {
                int horizontalValue = grid[x][y] * grid[x][y + 1] * grid[x][y + 2] * grid[x][y + 3];
                int verticalValue = grid[y][x] * grid[y + 1][x] * grid[y + 2][x] * grid[y + 3][x];

                int diagonalValue = 0;
                int reverseDiagonalValue = 0;
                if (x <= totalRows - size) {
                    diagonalValue = grid[x][y] * grid[x + 1][y + 1] * grid[x + 2][y + 2] * grid[x + 3][y + 3];
                    reverseDiagonalValue = grid[x][y + 3] * grid[x + 1][y + 2] * grid[x + 2][y + 1] * grid[x + 3][y];
                }

                largestProduct = Math.max(
                        largestProduct,
                        Math.max(
                                Math.max(horizontalValue, verticalValue),
                                Math.max(diagonalValue, reverseDiagonalValue)
                        )
                );
            }
        }

        return largestProduct;
    }
}
