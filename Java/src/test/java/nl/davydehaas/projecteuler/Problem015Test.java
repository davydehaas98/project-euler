package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem015Test {

    @Test
    void problem015() {
        Object result = Problem015.solve();
        Assertions.assertEquals(137846528820L, result);
    }
}
