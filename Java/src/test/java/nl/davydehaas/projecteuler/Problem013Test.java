package nl.davydehaas.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem013Test {

    @Test
    void problem013() {
        Object result = Problem013.solve();
        Assertions.assertEquals("5537376230", result);
    }
}
