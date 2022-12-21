package com.string.model;

import java.util.ArrayList;

public class Report {
    ArrayList<String> generateReport(ArrayList<Employee> employees) {
        ArrayList<String> report = new ArrayList<>();
        for (Employee employee : employees) {
            String[] temp = employee.getFullName().split(" ");
            report.add(String.format("Employee: |%-30s| %20.2f|}",
                    temp[0].charAt(0) + ". " + temp[1].charAt(0) + ". " + temp[2], employee.getSalary()));
        }
        return report;
    }
}
