package com.bridgelabz.problems;
import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {

    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double calculateTotalValue() {
        double total = 0;
        for (Stock stock : stocks) {
            total += stock.calculateStockValue();
        }
        return total;
    }

    public void printStockReport() {
        System.out.println("----- STOCK REPORT -----");

        for (Stock stock : stocks) {
            System.out.println("Stock Name      : " + stock.getStockName());
            System.out.println("Shares          : " + stock.getNumberOfShares());
            System.out.println("Price per Share : " + stock.getSharePrice());
            System.out.println("Stock Value     : " + stock.calculateStockValue());
            System.out.println("------------------------");
        }

        System.out.println("Total Portfolio Value: " + calculateTotalValue());
    }
}
