package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

import java.util.Arrays;

import nl.davydehaas.projecteuler.util.InputReader;

public class Problem022 {

    void main() {
        timeSolution(Problem022::solve);
    }

    static int solve() {
        String[] names = InputReader.readFile(22).getFirst()
                .replace("\"", "")
                .split(",");

        // Sort names alphabetically
        names = Arrays.stream(names)
                .sorted()
                .toArray(String[]::new);

        var totalScore = 0;
        for (int i = 0; i < names.length; i++) {
            totalScore += calculateAlphabeticalValue(names[i]) * (i + 1);
        }

        return totalScore;
    }

    private static int calculateAlphabeticalValue(String name) {
        return name.chars()
                // Capitalized characters in ASCII start at 65, so subtract 64.
                .map(i -> i - 64)
                .sum();
    }
}
