package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem016Test {

    @Test
    void problem016() {
        Object result = Problem016.solve();
        Assertions.assertEquals(1366, result);
    }
}
