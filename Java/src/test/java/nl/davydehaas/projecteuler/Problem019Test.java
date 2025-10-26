package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem019Test {

    @Test
    void problem019() {
        Object result = Problem019.solve();
        Assertions.assertEquals(171, result);
    }
}
