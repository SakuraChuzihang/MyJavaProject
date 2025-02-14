package com.homework.Chapter7.hw04;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount) {
        double ba = super.getBalance() + amount;
        --ba;
        setBalance(ba);
    }

    public void withdraw(double amount) {
        double ba = super.getBalance() - amount;
        --ba;
        setBalance(ba);
    }
}
