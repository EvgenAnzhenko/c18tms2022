import java.util.ArrayList;
import java.util.Scanner;

public class Lesson4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        int i = 0;

        while (i != 3) {
            System.out.println("Вводим " + (i + 1) + " число");
            list.add(i, scanner.nextDouble());
            i++;
        }
        double min = Math.abs(list.get(0));
        double result_min = 0;
        for (int n = 0; n < list.size(); n++) {
            if (Math.abs(list.get(n)) < min) {
                min = Math.abs(list.get(n));
                result_min = list.get(n);
            }

        }
        System.out.println(result_min);
    }

}

