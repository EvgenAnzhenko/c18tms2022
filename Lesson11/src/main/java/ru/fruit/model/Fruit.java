package ru.fruit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Fruit {
    private double weight;
    private double pricePerKilogram;

    abstract double getCostFruit();

    final void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }
}
