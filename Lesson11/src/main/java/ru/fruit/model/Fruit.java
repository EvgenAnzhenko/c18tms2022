package ru.fruit.model;

import lombok.Getter;

@Getter
public abstract class Fruit {
    private double weight;
    private final double pricePerKilogram;

    public Fruit(double weight, double pricePerKilogram) {
        this.weight += weight;
        this.pricePerKilogram = pricePerKilogram;
    }

    abstract double getCostFruit();

    final void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }
}
