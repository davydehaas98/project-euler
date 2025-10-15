package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem008Test {

    @Test
    void problem008() {
        Number result = Problem008.solve();
        Assertions.assertEquals(23514624000L, result);
    }
}
