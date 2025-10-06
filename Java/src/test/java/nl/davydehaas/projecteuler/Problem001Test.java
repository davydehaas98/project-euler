package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Problem001Test {

    @Test
    void problem001() {
        Number result = Problem001.solve();
        Assertions.assertEquals(2318, result);
    }
}