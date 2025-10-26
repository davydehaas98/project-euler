package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem022Test {

    @Test
    void problem022() {
        Object result = Problem022.solve();
        Assertions.assertEquals(871198282, result);
    }
}
