package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem021Test {

    @Test
    void problem021() {
        Object result = Problem021.solve();
        Assertions.assertEquals(31626, result);
    }
}
