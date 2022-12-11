package ru.fruit.model;

public class Apple extends Fruit {
    private static double fullWeight;
    public static double fullPearCost;

    public Apple(double weight, double pricePerKilogram) {
        super(weight, pricePerKilogram);
        fullWeight += weight;
        fullPearCost += weight * pricePerKilogram;
    }

    @Override
    public double getCostFruit() {
        return fullWeight * getPricePerKilogram();
    }
}

