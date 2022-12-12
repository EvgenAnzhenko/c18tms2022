package ru.fruit.model;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFullPrice(
                new Apple(10, 5),
                new Apple(20, 5),
                new Pear(5, 8),
                new Pear(10, 8),
                new Apricot(6, 10),
                new Apricot(5, 10)));
    }

    public static double getFullPrice(Fruit... fruits) {
        double fullPrice = 0;
        for (Fruit fruit : fruits) {
            fullPrice += fruit.getCostFruit();
        }
        return fullPrice;
    }
}
