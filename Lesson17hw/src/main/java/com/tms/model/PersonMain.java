package com.tms.model;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonMain {
    public static void main(String[] args) {
        Person.list.add(new Person("Имя", "Фамилия"));
        Person.list.add(new Person("Иван", "Дудов"));
        Person.list.add(new Person("Петя", "Детров"));
        Person.list.add(new Person("Вася", "Васильев"));
        System.out.println(getWordsWithFirstD((ArrayList<Person>) Person.list));
        printSurnameFirstLetterAndCount((ArrayList<Person>) Person.list);

    }

    private static Optional<List<String>> getWordsWithFirstD(ArrayList<Person> list) {
        Optional<List<String>> wordsWithFirstD = Optional.of(list.stream().map(Person::getSurname)
                .filter(str -> StringUtils.substring(str, 0, 1).equals("Д")).collect(Collectors.toList()));
        return wordsWithFirstD;
    }

    private static void printSurnameFirstLetterAndCount(ArrayList<Person> list) {
        int count = 0;
        Stream<Person> stream = list.stream();
        List<String> strings = stream.map(Person::getSurname)
                .map(str -> str.substring(0, 1)).toList();
        Set<String> letters = new HashSet<>(strings);   //Сделал для исключения повторяющихся букв

        for (String letter : letters) {
            for (Person person : list) {
                if (letter.equals(person.getSurname().substring(0, 1))) {
                    count++;
                }
            }
            System.out.println(letter + " " + count);
            count = 0;
        }
    }
}
