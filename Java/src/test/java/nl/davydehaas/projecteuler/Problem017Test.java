package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem017Test {

    @Test
    void problem017() {
        Object result = Problem017.solve();
        Assertions.assertEquals(21124, result);
    }
}
