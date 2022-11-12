import java.util.ArrayList;

public class Lesson5Task7 {
    public static void main(String[] args) {
        //        7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
        ArrayList<Integer> list = new ArrayList<>();
        for (int value = 1; value <= 100; value += 2) {
            list.add(value);
        }
        System.out.println(list);
        for (int number = list.size() - 1; number >= 0; number--) {
            System.out.print(list.get(number) + " ");
        }
    }
}
