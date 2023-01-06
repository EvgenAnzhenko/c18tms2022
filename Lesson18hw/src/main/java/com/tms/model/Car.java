package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@AllArgsConstructor
@Getter
@ToString
public class Car {
    private String number;
    private int year;

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));
        Stream<Car> stream = cars.stream();
        stream.filter((x -> x.getYear() > 2010))

                .filter(x -> x.getNumber() != null)
                .filter(x -> !x.getNumber().equals(""))
                .forEach(System.out::println);
    }
}
