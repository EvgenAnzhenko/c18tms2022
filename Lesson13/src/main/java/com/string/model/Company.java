package com.string.model;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Василий Петрович Иванов", 2000));
        employees.add(new Employee("Артем Евгеньевич Петров", 4000));
        Report report = new Report();
        System.out.println(report.generateReport(employees));
    }
}
