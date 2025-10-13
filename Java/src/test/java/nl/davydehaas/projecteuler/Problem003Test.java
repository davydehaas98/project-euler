package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem003Test {

    @Test
    void problem003() {
        Number result = Problem003.solve();
        Assertions.assertEquals(6857L, result);
    }
}
