package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem010Test {

    @Test
    void problem010() {
        Number result = Problem010.solve();
        Assertions.assertEquals(142913828922L, result);
    }
}
