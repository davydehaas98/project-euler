package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem005Test {

    @Test
    void problem005() {
        Number result = Problem005.solve();
        Assertions.assertEquals(232792560, result);
    }
}
