package ru.fruit.model;

public class Apricot extends Fruit {
    public Apricot(double weight, double pricePerKilogram) {
        super(weight, pricePerKilogram);
    }

    @Override
    public double getCostFruit() {
        return getWeight() * getPricePerKilogram();
    }
}
