package com.bridgelabz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        BankAccount account = new BankAccount(1000);
        assertTrue(account.withdraw(500));
        assertEquals(500, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(500);
        assertFalse(account.withdraw(1000));
        assertEquals(500, account.getBalance());
    }
}

