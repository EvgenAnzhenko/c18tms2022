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
        System.out.println(summ(first, second));

    }

    public static int summ(int a, int b) {
        int summ = 0;
        if (a < 0 && b < 0) {
            for (int count = 0; count < Math.abs(a); count++) {
                summ += Math.abs(b);
            }
        } else if (a < 0 && b > 0) {
            for (int count = 0; count < b; count++) {
                summ += a;
            }
        } else if ((a > 0 && b < 0) || (a > 0 && b > 0)) {

            for (int count = 0; count < a; count++) {
                summ += b;
            }
        }
        return summ;
    }
}


