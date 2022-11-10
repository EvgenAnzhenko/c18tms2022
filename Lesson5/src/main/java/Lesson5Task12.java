import java.util.Scanner;

public class Lesson5Task12 {
    public static void main(String[] args) {
//        12) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводим количество строк");
        int line = scanner.nextInt();
        System.out.println("Вводим количество столбцов");
        int column = scanner.nextInt();
        int[][] mass = new int[line][column];
        int[][] list = new int[line][column];


        for (int i = 0; i < mass.length; i++) {   // заполнение матрицы
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 51);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < mass.length; i++) {   // перемешивание матрицы
            for (int j = 0; j < mass[i].length; j++) {
                list[j][i] = mass[i][j];
            }
        }
        System.out.println();

        for (int i = 0; i < list.length; i++) {   // Вывод новой матрицы
            for (int j = 0; j < list[i].length; j++) {

                System.out.print(list[i][j] + " ");
            }
            System.out.println();

        }
    }
}


