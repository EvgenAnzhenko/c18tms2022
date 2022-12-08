package ru.test11.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Fruit {
    private int weight;
    private int cost;

    final void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }

    abstract int getPrice();
}
