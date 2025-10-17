package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

import java.util.Arrays;

public class Problem018 {

    void main() {
        timeSolution(Problem018::solve);
    }

    static int belowHundred(int number) {
        if (number < 20) {
            return zeroToNineteen[number];
        }
        return tenths[number / 10 - 2] + zeroToNineteen[number % 10];
    }

    static int solve() {
        int target = 1000;
        int sum = 0;

        for (int i = 0; i < target + 1; i++) {
            if (i < 100) {
                sum += belowHundred(i);
            } else {
                int thousand = i / 1000;
                if (i > 999) {
                    sum += belowHundred(thousand) + "thousand".length();
                }

                int hundred = i / 100 % 10;
                if (hundred > 0) {
                    sum += zeroToNineteen[hundred] + "hundred".length();
                }

                int and = i % 100;
                if (and > 0) {
                    sum += "and".length() + belowHundred(and);
                }
            }
        }

        return sum;
    }

    private static int[] zeroToNineteen = Arrays.stream(new String[]{
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
    }).mapToInt(String::length).toArray();

    private static int[] tenths = Arrays.stream(new String[]{
            "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    }).mapToInt(String::length).toArray();
}
