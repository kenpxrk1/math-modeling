package ru.mirea.targetfunc;

class Stock {
    String name;
    double probabilityOfIncrease;
    double expectedProfit;
    double expectedLoss;

    public Stock(String name, double probabilityOfIncrease, double expectedProfit, double expectedLoss) {
        this.name = name;
        this.probabilityOfIncrease = probabilityOfIncrease;
        this.expectedProfit = expectedProfit;
        this.expectedLoss = expectedLoss;
    }

    public double calculateExpectedValue() {
        return probabilityOfIncrease * expectedProfit + (1 - probabilityOfIncrease) * expectedLoss;
    }
}
