package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem007Test {

    @Test
    void problem007() {
        Number result = Problem007.solve();
        Assertions.assertEquals(104743, result);
    }
}
