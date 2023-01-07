package ru.tms.model;

import java.util.Scanner;

public class HomeworkMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        if (result == 1) {
            Homework test = new Homework();
            test.setSecondValue("User");
            test.method(1);
        } else {
            Homework test = new Homework();
            test.setFirstValue(6);
            test.method(2);
        }
    }
}
