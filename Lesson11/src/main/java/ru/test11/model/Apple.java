package ru.test11.model;

public class Apple extends Fruit {
    public Apple(int weight, int cost) {
        super(weight, cost);
    }

    @Override
    public int getPrice() {
        return getWeight() * getCost();
    }
}

