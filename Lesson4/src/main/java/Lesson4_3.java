import java.util.ArrayList;
import java.util.Scanner;

public class Lesson4_3 {
    public static void main(String[] args) {
        System.out.println("Вводим количество чисел");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int amount = scanner.nextInt();
            addList(amount);
        }
    }

    public static void addList(int amount) {    // метод для заполнения массива
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            System.out.println("Вводим " + (i + 1) + " число");
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextDouble());
        }
        minAbs(list);
    }

    public static void minAbs(ArrayList<Double> list) {  //метод для нахождения мин модуля
        double min = Math.abs(list.get(0));
        for (int n = 0; n < list.size(); n++) {
            if (Math.abs(list.get(n)) < min) {
                min = Math.abs(list.get(n));
            }
        }
        System.out.println(min);
    }
}

