package com.tms.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(4);
        List<String> strings = new ArrayList<>();
        strings.add("антон");
        strings.add("вася");
        strings.add("петя");

        Stream<Integer> stream = list.stream();
        stream.mapToInt(a -> a * 2).forEach(System.out::println);  //Вывести список чисел, умноженных на 2

        Stream<Integer> stream1 = list.stream();
        System.out.println(stream1.filter(x -> x % 2 == 0).count());   //Определение количества четных чисел в потоке данных.

        Stream<String> stream2 = strings.stream();
        stream2.map(x -> x.substring(0, 1).toUpperCase() + x.substring(1)).forEach(System.out::println);  //Вывести список имен, но с первой заглавной буквой. список имен


    }
}
