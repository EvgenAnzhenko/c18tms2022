import java.util.Scanner;

public class Lesson4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 число");
        double a = scanner.nextDouble();
        System.out.println("2 число");
        double b = scanner.nextDouble();
        System.out.println("3 число");
        double c = scanner.nextDouble();
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        double minAB = Math.min(a, b);
        System.out.println(Math.min(minAB, c));

    }

}

