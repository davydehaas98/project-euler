package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem012Test {

    @Test
    void problem012() {
        Number result = Problem012.solve();
        Assertions.assertEquals(76576500, result);
    }
}
