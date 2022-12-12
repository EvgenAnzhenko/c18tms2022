package ru.fruit.model;

public class Apple extends Fruit {
    public Apple(double weight, double pricePerKilogram) {
        super(weight, pricePerKilogram);
    }

    @Override
    public double getCostFruit() {
        return getWeight() * getPricePerKilogram();
    }
}

