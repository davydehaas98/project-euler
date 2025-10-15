package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Problem011Test {

    @Test
    @Disabled
    void problem011() {
        Number result = Problem011.solve();
        Assertions.assertEquals(70600674, result);
    }
}
