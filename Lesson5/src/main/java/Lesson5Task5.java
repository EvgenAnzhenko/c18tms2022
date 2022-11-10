import java.util.Scanner;

public class Lesson5Task5 {
    public static void main(String[] args) {
        //  5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        System.out.println(test(first, second));

    }

    public static int test(int a, int b) {
        int test = 0;
        if (a < 0 && b < 0) {
            for (int count = 0; count < Math.abs(a); count++) {
                test += Math.abs(b);
            }
        } else if (a < 0 && b > 0) {
            for (int count = 0; count < b; count++) {
                test += a;
            }
        } else if (a > 0 && b < 0) {
            for (int count = 0; count < a; count++) {
                test += b;
            }
        } else if (a > 0 && b > 0) {
            for (int count = 0; count < a; count++) {
                test += b;
            }
        } else {
            test = 0;
        }
        return test;
    }
}


