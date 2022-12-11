package ru.fruit.service;

import ru.fruit.model.Apple;
import ru.fruit.model.Apricot;
import ru.fruit.model.Pear;

public class Main {
    public double getFullPrice() {                                          // Полная стоимость всех фруктов
        return Pear.fullPearCost + Apple.fullPearCost + Apricot.fullPearCost;

    }

    public static void main(String[] args) {
        Main main = new Main();
        Apple apple = new Apple(10, 5);
        Apple apple1 = new Apple(20, 5);
        Pear pear = new Pear(5, 8);
        Pear pear1 = new Pear(10, 8);
        Apricot apricot = new Apricot(6, 10);
        Apricot apricot1 = new Apricot(5, 10);
        System.out.println(apple.getCostFruit());
        System.out.println(pear.getCostFruit());
        System.out.println(apricot.getCostFruit());
        System.out.println(main.getFullPrice());
    }
}
