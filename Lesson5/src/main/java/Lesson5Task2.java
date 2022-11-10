import java.util.Scanner;

public class Lesson5Task2 {
    public static void main(String[] args) {
        //2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа


        System.out.println("Введите количество часов (кратные 3)");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt() / 3;
        int valueAmeba = (int) Math.pow(2, hours);
        System.out.println("Количество амеб будет " + valueAmeba);
    }
}
