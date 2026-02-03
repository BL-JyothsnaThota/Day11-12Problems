package com.bridgelabz.problems;
public class Account {

    private double balance;

    public Account(double balance) {
        if (balance >= 0)
            this.balance = balance;
        else
            this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
            System.out.println("Debit successful. Remaining Balance: " + balance);
        }
    }
}
