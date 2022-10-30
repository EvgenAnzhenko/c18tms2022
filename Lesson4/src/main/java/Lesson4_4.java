import java.util.Scanner;

public class Lesson4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);
        if (i > 0 && i <= 3599) {
            System.out.println("Осталось 0 часов");
        } else if (i >= 3600 && i <= 7199) {
            System.out.println("Остался 1 час");
        } else if (i >= 7200 && i <= 10799) {
            System.out.println("Осталось 2 часа");
        } else if (i >= 10800 && i <= 14399) {
            System.out.println("Осталось 3 часа");
        } else if (i >= 14400 && i <= 17999) {
            System.out.println("Осталось 4 часа");
        } else if (i >= 18000 && i <= 21599) {
            System.out.println("Осталось 5 часов");
        } else if (i >= 21600 && i <= 25199) {
            System.out.println("Осталось 6 часов");
        } else if (i >= 25200 && i <= 27799) {
            System.out.println("Осталось 7 часов");
        } else if (i == 28800) {
            System.out.println("Осталось 8 часов");
        }


    }
}
