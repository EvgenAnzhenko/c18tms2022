package ru.fruit.model;

public class Apricot extends Fruit {
    private static double fullWeight;
    public static double fullPearCost;

    public Apricot(double weight, double pricePerKilogram) {
        super(weight, pricePerKilogram);
        fullWeight += weight;
        fullPearCost += weight * pricePerKilogram;
    }

    @Override
    public double getCostFruit() {
        return fullWeight * getPricePerKilogram();
    }
}
