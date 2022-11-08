import java.util.Scanner;

public class Lesson5Task3 {
    public static void main(String[] args) {

        //3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для анализа");
        int number = scanner.nextInt();
        String value;

        if (number < 0) {                 // здесь смотрим положительное или отрицательное число
            value = " - это отрицательное число,";
        } else {
            value = " - это положительное число,";
        }
        int length = String.valueOf(Math.abs(number)).length();
        System.out.println(number + value + " количество цифр = " + length);
    }
}
