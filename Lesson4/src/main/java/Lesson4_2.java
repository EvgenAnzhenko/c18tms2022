import java.util.Scanner;

public class Lesson4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
        }
        System.out.println("Ошибка: Вводим только целые числа!");
    }
}




