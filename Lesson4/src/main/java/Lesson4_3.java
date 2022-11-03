import java.util.ArrayList;
import java.util.Scanner;

public class Lesson4_3 {
    public static void main(String[] args) {
        System.out.println("Вводим количество чисел");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int amount = scanner.nextInt();
            System.out.println(minAbs(addList(amount)));
        }
    }

    public static ArrayList<Double> addList(int amount) {    // метод для заполнения массива
        ArrayList<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < amount; i++) {
            System.out.println("Вводим " + (i + 1) + " число");

            list.add(scanner.nextDouble());
        }
        return list;
    }

    public static double minAbs(ArrayList<Double> list) {  //метод для нахождения минимального числа по модулю
        double min = Math.abs(list.get(0));
        for (int n = 0; n < list.size(); n++) {
            if (Math.abs(list.get(n)) < min) {
                min = Math.abs(list.get(n));
            }
        }
        return min;
    }
}

