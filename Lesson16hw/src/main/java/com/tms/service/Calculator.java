package com.tms.service;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Calculator {
    public <T extends Number, V extends Number> double sum(T first, V second) {
        return second.doubleValue() + first.doubleValue();
    }

    public <T extends Number, V extends Number> double multiply(T first, V second) {
        return second.doubleValue() * first.doubleValue();
    }

    public <T extends Number, V extends Number> double divide(T first, V second) {
        return first.doubleValue() / second.doubleValue();
    }

    public <T extends Number, V extends Number> double subtraction(T first, V second) {
        return first.doubleValue() - second.doubleValue();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2, 1));
        System.out.println(calculator.multiply(2, 1.1));
        System.out.println(calculator.divide(4.4, 2));
        System.out.println(calculator.subtraction(10.4, 2));
    }
}
