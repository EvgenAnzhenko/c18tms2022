import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(103);
        countDevs(11);
        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сдвелать проверку что если пользователь вел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int amount = scanner.nextInt();
        if (amount < 0) {
            System.out.println("Размер массива должен быть только положительный!");
            amount = scanner.nextInt();
        }
        int[] list = new int[amount];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 1000);
        }
        for (int number : list) {
            System.out.println(number);
        }
    }


    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number = number - 2;
        } else {
            number = 10;
        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int value : ints) {
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        if (count % 100 >= 5 && count % 100 <= 20) {
            System.out.println(count + " программистов");
        } else if ((count % 100 == 1) || (count % 100 == 21) || (count % 100 == 31) || (count % 100 == 41) || (count % 100 == 51) || (count % 100 == 61) || (count % 100 == 71) || (count % 100 == 81) || (count % 100 == 91)) {
            System.out.println(count + " программист");
        } else if (count % 10 >= 2 && count % 10 <= 4) {
            System.out.println(count + " программиста");
        } else if ((count % 10 >= 5 && count % 10 <= 9) || count % 10 == 0) {
            System.out.println(count + " программистов");
        }
    }


    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {

        if ((number % 5 == 0) && (number % 3 == 0)) {
            System.out.println("foobar");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */

    public static void printPrimeNumbers() {

        for (int number = 2; number < 1000; number++) {
            int count = 0;
            for (int division = 1; division < 1000; division++) {
                if (number % division == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number);
            }
        }
    }
}

