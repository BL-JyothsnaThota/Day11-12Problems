package com.bridgelabz.problems;
import java.util.Scanner;

public class StockAccountMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for stock " + i);

            System.out.print("Stock Name: ");
            String name = sc.next();

            System.out.print("Number of Shares: ");
            int shares = sc.nextInt();

            System.out.print("Share Price: ");
            double price = sc.nextDouble();

            Stock stock = new Stock(name, shares, price);
            portfolio.addStock(stock);
        }

        portfolio.printStockReport();
        sc.close();
    }
}
