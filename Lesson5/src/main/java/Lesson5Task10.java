public class Lesson5Task10 {
    public static void main(String[] args) {
//        10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
        int[] mass = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = mass[0];
        int maxNumber = 0;
        for (int count = 0; count < mass.length; count++) {
            if (mass[count] > max) {
                max = mass[count];
                maxNumber = count;
            }
        }
        int temp = mass[0];
        mass[0] = max;
        mass[maxNumber] = temp;

    }
}
