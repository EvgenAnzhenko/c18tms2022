public class Lesson5Task8 {
    public static void main(String[] args) {
//        8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
        int[] mass = new int[12];
        for (int count = 0; count < 12; count++) {
            mass[count] = (int) (Math.random() * 16);
        }

        int max = mass[0];
        int indexMax = 0;
        for (int countMax = 0; countMax < 12; countMax++) {
            if (mass[countMax] >= max) {
                max = mass[countMax];
                indexMax = countMax;
            }
        }

        System.out.println("Максимальный элемент " + max + ", индекс его последнего вхождения в массив = " + indexMax);

    }
}
