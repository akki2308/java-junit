package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void shouldReverseStringCorrectly() {
        Assertions.assertEquals("cba", StringUtils.reverse("abc"));
        Assertions.assertEquals("madam", StringUtils.reverse("madam"));
        Assertions.assertEquals("987654321", StringUtils.reverse("123456789"));
    }

    @Test
    public void shouldCheckIfStringIsPalindrome() {
        Assertions.assertTrue(StringUtils.isPalindrome("madam"));
        Assertions.assertTrue(StringUtils.isPalindrome("racecar"));
        Assertions.assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    public void shouldConvertStringToUpperCase() {
        Assertions.assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        Assertions.assertEquals("JAVA", StringUtils.toUpperCase("java"));
        Assertions.assertEquals("TEST", StringUtils.toUpperCase("Test"));
    }
}

