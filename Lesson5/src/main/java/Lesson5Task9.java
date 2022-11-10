public class Lesson5Task9 {
    public static void main(String[] args) {
//       9) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
        int[] mass = new int[20];
        for (int count = 0; count < 20; count++) {
            mass[count] = (int) (Math.random() * 21);
        }
        for (int result : mass) {
            System.out.print(result + " ");
        }
        for (int countNew = 0; countNew < 20; countNew++) {
            if (countNew % 2 != 0) {
                mass[countNew] = 0;
            }
        }
        System.out.println();
        for (int resultNew : mass) {
            System.out.print(resultNew + " ");
        }
    }
}
