import java.util.Scanner;

public class Lesson5Task4 {
    public static void main(String[] args) {
        //4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число рождения");
        int date = scanner.nextInt();
        System.out.println("Введите месяц рождения");
        int month = scanner.nextInt();

        if ((month == 1 && date >= 21) || (month == 2 && date <= 18)) {
            System.out.println("Водолей");
        } else if ((month == 2 && date >= 19) || (month == 3 && date <= 20)) {
            System.out.println("Рыбы");
        } else if ((month == 3 && date >= 21) || (month == 4 && date <= 20)) {
            System.out.println("Овен");
        } else if ((month == 4 && date >= 21) || (month == 5 && date <= 21)) {
            System.out.println("Телец");
        } else if ((month == 5 && date >= 22) || (month == 6 && date <= 21)) {
            System.out.println("Близнецы");
        } else if ((month == 6 && date >= 22) || (month == 7 && date <= 22)) {
            System.out.println("Рак");
        } else if ((month == 7 && date >= 23) || (month == 8 && date <= 23)) {
            System.out.println("Лев");
        } else if ((month == 8 && date >= 24) || (month == 9 && date <= 22)) {
            System.out.println("Дева");
        } else if ((month == 9 && date >= 23) || (month == 10 && date <= 23)) {
            System.out.println("Весы");
        } else if ((month == 10 && date >= 24) || (month == 11 && date <= 22)) {
            System.out.println("Скорпион");
        } else if ((month == 11 && date >= 23) || (month == 12 && date <= 21)) {
            System.out.println("Стрелец");
        } else if ((month == 12 && date >= 22) || (month == 1 && date <= 20)) {
            System.out.println("Козерог");
        }

    }

}
