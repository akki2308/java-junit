package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculatorexceptiontest {

    @Test
    public void shouldThrowArithmeticExceptionWhenDividingByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculator.divide(10, 0));
    }
}

