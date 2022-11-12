import java.util.Scanner;

public class Lesson5Task13 {
    public static void main(String[] args) {
        calculateSumOfDiagonalElements();
        printMatrix();
    }


    public static void calculateSumOfDiagonalElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Водим количество строк в массиве");
        int line = scanner.nextInt();
        System.out.println("Вводим количество стоблцов в массиве");
        int column = scanner.nextInt();
        int[][] mass = new int[line][column];

        for (int i = 0; i < mass.length; i++) {   //заполняем массив здесь
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 20);
            }
        }

        for (int i = 0; i < mass.length; i++) {   // Вывод массива
            for (int j = 0; j < mass[i].length; j++) {

                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < mass.length; i++) {   //берем диагональные значения и считаем сумму
            sum += mass[i][i];
        }
        System.out.println("Сумма по диагонали = " + sum);
    }


    public static void printMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводим количество строк в массиве");
        int line = scanner.nextInt();
        System.out.println("Вводим количество стобцов в массиве");
        int column = scanner.nextInt();
        int[][] mass = new int[line][column];

        for (int i = 0; i < mass.length; i++) {   //Заполнили здесь массив
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 101);
            }
        }

        System.out.println("Вывод новой матрицы");
        String result;
        for (int i = 0; i < mass.length; i++) {   //Вывод новой матрицыматрицы
            for (int j = 0; j < mass[i].length; j++) {
                if (((mass[i][j] % 3 == 0) && (mass[i][j] % 7 == 0)) | (mass[i][j] % 3 == 0)) {
                    result = "+";
                } else if (mass[i][j] % 7 == 0) {
                    result = "-";
                } else {
                    result = "*";
                }
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}

