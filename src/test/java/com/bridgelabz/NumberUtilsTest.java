package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class NumberUtilsTest {

    @Test
    void testEvenNumbers() {
        Assertions.assertTrue(NumberUtils.isEven(2));
        Assertions.assertTrue(NumberUtils.isEven(4));
        Assertions.assertTrue(NumberUtils.isEven(6));
    }

    @Test
    void testOddNumbers() {
        Assertions.assertFalse(NumberUtils.isEven(7));
        Assertions.assertFalse(NumberUtils.isEven(9));
    }
}


