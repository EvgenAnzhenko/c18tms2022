package com.tms.model;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        1)Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
//                Избавиться от повторяющихся элементов в строке и вывести результат на экран.
//
        String str = "1, 2, 3, 4, 4, 5";
        Stream.of(1, 2, 3, 4, 4, 5)
                .distinct()
                .forEach(System.out::println);

//        2) Создать коллекцию, содержащую объекты HeavyBox.
//        Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
//                Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.

        List<HeavyBox> heavyBoxes = Arrays.asList(new HeavyBox(200.6), new HeavyBox(600.7), new HeavyBox(300.1));
        System.out.println(getBoxesWithWeightOverThreeHundred(heavyBoxes));

//        3) Создайте HashMap, содержащий пары значений - имя игрушки и объект игрушки (класс Toy).
//        Перебрать и распечатать набор из имен игрушек (keySet).
//                Перебрать и распечатать значения HashMap (values()).
//                Перебрать пары значений(entrySet()). Для каждого перебора создать свой метод(параметризованный)

        Map<String, Toy> toys = new HashMap<>();
        Toy car = new Toy("Авто");
        Toy doll = new Toy("Кукла");
        Toy spider = new Toy("Паук");
        toys.put(car.getName(), car);
        toys.put(doll.getName(), doll);
        toys.put(spider.getName(), spider);
        printMap(toys);
        printNamesOfMapToys(toys);
        printObjectOfMapToys(toys);


//        4) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//        Создать класс Категория, имеющий переменные имя и множество товаров.
//                Создать несколько объектов класса Категория.
//        Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
//        Используем классы компараторы для каждого вида сортировки.

        Category films = new Category("Films");
        films.getProductSet().add(new Product("Гарри Поттер и философский камень", 10, 8.8));
        films.getProductSet().add(new Product("Один дома", 8, 8.4));
        films.getProductSet().add(new Product("Зеленая миля", 11, 9.4));

        Category cartoons = new Category("Films");
        cartoons.getProductSet().add(new Product("Король Лев", 15, 9.8));
        cartoons.getProductSet().add(new Product("ВАЛЛ·И", 14, 8.8));
        cartoons.getProductSet().add(new Product("Как приручить дракона", 11, 8.4));

        printSortedCategoryByRating(cartoons);
        printSortedCategoryByName(cartoons);
        printSortedCategoryByPrice(films);


    }

    static void printSortedCategoryByRating(Category category) {
        category.getProductSet().stream()
                .sorted(Comparator.comparingDouble(Product::getRating))
                .forEach(System.out::println);
    }

    static void printSortedCategoryByName(Category category) {
        category.getProductSet().stream()
                .sorted(Comparator.comparing(Product::getName))
                .forEach(System.out::println);
    }

    static void printSortedCategoryByPrice(Category category) {
        category.getProductSet().stream()
                .sorted(Comparator.comparingInt(Product::getPrice))
                .forEach(System.out::println);
    }

    static List<HeavyBox> getBoxesWithWeightOverThreeHundred(List<HeavyBox> heavyBox) {
        return heavyBox.stream()
                .filter(weight -> weight.getWeight() > 300).toList();
    }

    static void printNamesOfMapToys(Map<String, Toy> toys) {
        toys.keySet()
                .forEach(System.out::println);
    }

    static void printObjectOfMapToys(Map<String, Toy> toys) {
        toys.values()
                .forEach(System.out::println);
    }

    static void printMap(Map<String, Toy> toys) {
        toys.entrySet()
                .forEach(System.out::println);
    }
}
