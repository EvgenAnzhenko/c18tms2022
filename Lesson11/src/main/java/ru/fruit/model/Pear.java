package ru.fruit.model;

public class Pear extends Fruit {
    public Pear(double weight, double pricePerKilogram) {
        super(weight, pricePerKilogram);
    }

    @Override
    public double getCostFruit() {
        return getWeight() * getPricePerKilogram();
    }
}
