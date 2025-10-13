package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem006Test {

    @Test
    void problem006() {
        Number result = Problem006.solve();
        Assertions.assertEquals(25164150, result);
    }
}
