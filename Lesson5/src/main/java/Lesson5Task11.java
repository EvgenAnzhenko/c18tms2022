import java.util.ArrayList;

public class Lesson5Task11 {
    public static void main(String[] args) {
//      11) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
        int[] mass = {0, 3, 46, 3, 2, 1, 2};
        ArrayList<Integer> list = new ArrayList<>();
        for (int count = 0; count < mass.length; count++) {
            for (int countNew = count + 1; countNew < mass.length; countNew++) {
                if (mass[count] == mass[countNew]) {
                    list.add(mass[countNew]);
                }
            }
        }
        if (list.size() > 0) {
            System.out.print("Массив имеет повторяющиеся элементы ");
            int result = 0;
            for (int i = 0; i < list.size(); i++) {
                result = list.get(i);
                System.out.print(result);
                if (list.get(i) != list.size()) {
                    System.out.print(",");
                }
            }
        } else {
            System.out.print("Массив не имеет повторяющихся элементов");
        }
    }
}

