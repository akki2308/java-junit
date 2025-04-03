package com.bridgelabz;

class BankAccount {
    private double balance;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    double getBalance() {
        return balance;
    }
}

