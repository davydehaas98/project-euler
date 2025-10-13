package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

public class Problem004 {

    void main() {
        timeSolution(Problem004::solve);
    }

    static Number solve() {
        int largestPalindrome = 0;

        for (int x = 100; x < 1000; x++) {
            for (int y = 100; y < 1000; y++) {
                int number = x * y;
                if (number > largestPalindrome && isPalindrome(number)) {
                    largestPalindrome = number;
                }
            }
        }

        // The largest palindrome made from the product of two 3-digit numbers
        return largestPalindrome;
    }

    private static boolean isPalindrome(int number) {
        String value = String.valueOf(number);
        return value.contentEquals(new StringBuilder(value).reverse());
    }
}
