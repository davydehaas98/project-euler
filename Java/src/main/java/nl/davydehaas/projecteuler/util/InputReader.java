package nl.davydehaas.projecteuler.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public final class InputReader {

    private InputReader() {
    }

    /// @param number The problem number as [Integer].
    /// @return the file as [List] of lines as [String].
    public static List<String> readFile(int number) {
        return readFile(number, false);
    }

    /// @param number The problem number as [Integer].
    /// @param isTest Set this to true if it should use the `*-test.txt` file instead.
    /// @return the file as [List] of lines as [String].
    public static List<String> readFile(int number, boolean isTest) {
        String pathPrefix = number < 10 ? "/problem_00%d" : number < 100 ? "/problem_0%d" : "/problem_%d";
        String pathSuffix = isTest ? "-test.txt" : ".txt";
        String fileName = String.format("src/main/resources" + pathPrefix + pathSuffix, number);

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName), 8192)) {
            return reader.lines().toList();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
