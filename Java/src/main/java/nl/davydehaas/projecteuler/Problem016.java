package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

import java.math.BigInteger;
import java.util.Arrays;

public class Problem016 {

    void main() {
        timeSolution(Problem016::solve);
    }

    static int solve() {
        BigInteger number = BigInteger.TWO;
        int power = 1000;

        // Calculate the power
        BigInteger currentNumber = BigInteger.ONE;
        for (int i = 0; i < power; i++) {
            currentNumber = currentNumber.multiply(number);
        }

        int[] digits = Arrays.stream(String.valueOf(currentNumber).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }
}
