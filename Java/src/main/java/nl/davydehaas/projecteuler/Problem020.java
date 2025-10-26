package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

import java.math.BigInteger;
import java.util.Arrays;

public class Problem020 {

    void main() {
        timeSolution(Problem020::solve);
    }

    static int solve() {
        int n = 100;
        BigInteger factorial = BigInteger.ONE;
        // n! means n * (n - 1) * ... 3 * 2 * 1.
        // Get the product of all positive integers less than, or equal to, n.
        for (int currentFactorial = n; currentFactorial > 0; currentFactorial--) {
            factorial = factorial.multiply(BigInteger.valueOf(currentFactorial));
        }

        // Find the sum of the digits in the number.
        return Arrays.stream(factorial.toString().split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
