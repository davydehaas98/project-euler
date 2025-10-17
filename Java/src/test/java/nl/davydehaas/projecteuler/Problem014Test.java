package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem014Test {

    @Test
    void problem014() {
        Object result = Problem014.solve();
        Assertions.assertEquals(837799, result);
    }
}
