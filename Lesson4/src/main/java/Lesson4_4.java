import java.util.Scanner;

public class Lesson4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);
        int vr = i / 3600;
        if (vr == 0 || (vr >= 5 && vr <= 8)) { //Это делается для корректного окончания. ОсталСЯ, ОсталОСЬ, час, часА.
            System.out.println("Осталось " + vr + " часов");
        } else if (vr == 1) {
            System.out.println("Остался 1 час");
        } else if (vr >= 2 && vr <= 4) {
            System.out.println("Осталось " + vr + " часа");
        } else {
            System.out.println("Через " + vr + " часов идем домой!"); // можно и так, тогда меньше строк. Но по условию было:
            // Вывод фразами осталось, остался
        }
    }
}
