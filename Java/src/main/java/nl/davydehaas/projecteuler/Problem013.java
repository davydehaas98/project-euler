package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

import java.math.BigInteger;

import nl.davydehaas.projecteuler.util.InputReader;

public class Problem013 {

    void main() {
        timeSolution(Problem013::solve);
    }

    static String solve() {
        BigInteger[] digits = InputReader.readFile(13).stream()
                .map(BigInteger::new)
                .toArray(BigInteger[]::new);

        BigInteger sum = BigInteger.ZERO;

        for (BigInteger digit : digits) {
            sum = sum.add(digit);
        }

        return String.valueOf(sum).substring(0, 10);
    }
}
