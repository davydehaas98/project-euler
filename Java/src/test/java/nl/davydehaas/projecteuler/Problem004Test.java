package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem004Test {

    @Test
    void problem004() {
        Number result = Problem004.solve();
        Assertions.assertEquals(906609, result);
    }
}
