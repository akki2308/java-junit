package com.bridgelabz;

class PasswordValidator {
    static boolean isValid(String password) {
        return password.length() >= 8 &&  // Must be at least 8 characters long
                password.matches(".*[A-Z].*") &&  // Must contain at least one uppercase letter
                password.matches(".*\\d.*");  // Must contain at least one digit
    }
}

