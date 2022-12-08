package ru.test11.model;

public class Apricot extends Fruit {
    public Apricot(int weight, int cost) {
        super(weight, cost);
    }

    @Override
    public int getPrice() {
        return getWeight() * getCost();
    }
}
