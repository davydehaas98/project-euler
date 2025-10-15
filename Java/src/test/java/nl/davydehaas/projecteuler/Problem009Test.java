package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem009Test {

    @Test
    void problem009() {
        Number result = Problem009.solve();
        Assertions.assertEquals(31875000, result);
    }
}
