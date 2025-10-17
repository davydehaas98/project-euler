package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem018Test {

    @Test
    void problem018() {
        Object result = Problem018.solve();
        Assertions.assertEquals(21124, result);
    }
}
