package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem002Test {

    @Test
    void problem002() {
        Number result = Problem002.solve();
        Assertions.assertEquals(4613732, result);
    }
}
