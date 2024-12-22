package ru.mirea.targetfunc;

import java.util.ArrayList;
import java.util.List;

public class StockSelection {
    public static void main(String[] args) {
        List<Stock> stocks = new ArrayList<>();

        stocks.add(new Stock("Акция A", 0.7, 1000, -500));
        stocks.add(new Stock("Акция B", 0.5, 1500, -800));
        stocks.add(new Stock("Акция C", 0.6, 1200, -600));

        Stock bestStock = null;
        double maxExpectedValue = Double.NEGATIVE_INFINITY;

        for (Stock stock : stocks) {
            double expectedValue = stock.calculateExpectedValue();
            System.out.println("Акция: " + stock.name + ", Ожидаемая ценность: " + expectedValue);
            if (expectedValue > maxExpectedValue) {
                maxExpectedValue = expectedValue;
                bestStock = stock;
            }
        }

        if (bestStock != null) {
            System.out.println("Наиболее выгодный набор акций: " + bestStock.name +
                    ", с ожидаемой ценностью: " + maxExpectedValue);
        }
    }
}
