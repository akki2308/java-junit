package com.bridgelabz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("StrongP@ss1"));
    }

    @Test
    void testTooShortPassword() {
        assertFalse(PasswordValidator.isValid("Short1"));
    }

    @Test
    void testNoUppercasePassword() {
        assertFalse(PasswordValidator.isValid("lowercase1"));
    }

    @Test
    void testNoDigitPassword() {
        assertFalse(PasswordValidator.isValid("NoDigitsHere"));
    }
}

