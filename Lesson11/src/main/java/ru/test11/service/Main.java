package ru.test11.service;

import ru.test11.model.Apple;
import ru.test11.model.Apricot;
import ru.test11.model.Pear;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple(10, 5);
        Pear pear = new Pear(5, 8);
        Apricot apricot = new Apricot(6, 10);

        System.out.println(apple.getPrice() + pear.getPrice() + apricot.getPrice());
        System.out.println(apple.getPrice());
    }
}
