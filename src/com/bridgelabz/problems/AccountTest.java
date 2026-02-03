package com.bridgelabz.problems;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(balance);

        System.out.print("Enter amount to debit: ");
        double debitAmount = sc.nextDouble();

        account.debit(debitAmount);

        System.out.println("Final Balance: " + account.getBalance());
        sc.close();
    }
}
