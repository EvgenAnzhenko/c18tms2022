package ru.tms.model;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String date = "1989-08-10";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("Название дня недели по введенной даты: " + localDate.getDayOfWeek());           //Название дня недели по введенной дате

        LocalDate localDate1 = LocalDate.now();
        getNextTuesdayDate(localDate1);                 //Поиск ближайшего вторника после введенный даты
    }

    private static void getNextTuesdayDate(LocalDate localDate1) {
        LocalDate temp;
        for (int i = 1; i <= 7; i++) {
            temp = localDate1.plusDays(i);
            if (temp.getDayOfWeek().toString().equalsIgnoreCase("Tuesday")) {
                System.out.println(temp);
                break;
            }
        }
    }
}
