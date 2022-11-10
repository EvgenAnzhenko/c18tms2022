public class Lesson5Task14 {
    public static void main(String[] args) {
        int[][] mass = new int[10][10];

        for (int i = 0; i < mass.length; i++) {            //Заполнение массива
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 10001);
            }
        }
//        for (int i = 0; i < mass.length; i++) {            //Вывод массива
//            for (int j = 0; j < mass[i].length; j++) {
//                System.out.print(mass[i][j] + " ");
//            }
//            System.out.println();
//        }

        int max = 0;
        int maxLine = 0;
        int maxColumn = 0;
        for (int i = 0; i < mass.length; i++) {            //Считаем максимальную сумму тройки
            for (int j = 1; j < mass[i].length - 1; j++) {
                if ((mass[i][j - 1] + mass[i][j] + mass[i][j + 1]) > max) {
                    max = mass[i][j - 1] + mass[i][j] + mass[i][j + 1];
                    maxLine = i;
                    maxColumn = j - 1;
                }
            }
        }
        System.out.println(max + " (" + maxLine + "," + maxColumn + ")");
    }
}
