package ru.test11.model;

public class Pear extends Fruit {
    public Pear(int weight, int cost) {
        super(weight, cost);
    }

    @Override
    public int getPrice() {
        return getWeight() * getCost();
    }
}
