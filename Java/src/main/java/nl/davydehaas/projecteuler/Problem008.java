package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

import java.util.Arrays;

import nl.davydehaas.projecteuler.util.InputReader;

public class Problem008 {

    void main() {
        timeSolution(Problem008::solve);
    }

    static Number solve() {
        int[] digits = InputReader.readFile(8).stream()
                .map(line -> line.split(""))
                .flatMap(Arrays::stream)
                .mapToInt(Integer::parseInt)
                .toArray();

        int amountAdjacentNumbers = 13;
        long largest = 0L;

        for (int i = 0; i < digits.length - amountAdjacentNumbers; i++) {
            long current = 1L;

            for (int j = 0; j < amountAdjacentNumbers; j++) {
                current *= digits[i + j];
            }

            if (current > largest) {
                largest = current;
            }
        }

        return largest;
    }
}
