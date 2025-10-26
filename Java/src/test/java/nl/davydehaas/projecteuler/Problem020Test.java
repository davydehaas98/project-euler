package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem020Test {

    @Test
    void problem020() {
        Object result = Problem020.solve();
        Assertions.assertEquals(648, result);
    }
}
