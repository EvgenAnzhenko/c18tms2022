public class Lesson5Task6 {
    public static void main(String[] args) {
        //        6) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

        String[][] listА = {{" ", " ", " ", "*"}, {" ", " ", "*", "*"}, {" ", "*", "*", "*"}, {"*", "*", "*", "*"}};
        String[][] listB = {{"*", " ", " ", " "}, {"*", "*", " ", " "}, {"*", "*", "*", " "}, {"*", "*", "*", "*"}};
        String[][] listC = {{"*", "*", "*", "*"}, {" ", "*", "*", "*"}, {" ", " ", "*", "*"}, {" ", " ", " ", "*"}};
        String[][] listD = {{"*", "*", "*", "*"}, {"*", "*", "*", " "}, {"*", "*", " ", " "}, {"*", " ", " ", " "}};


        System.out.println("Треугольник вида a");
        for (int line = 0; line < 4; line++) {
            for (int element = 0; element < 4; element++) {
                System.out.print(" " + listА[line][element]);
            }
            System.out.println();
        }
        System.out.println("Треугольник вида B");
        for (int line = 0; line < 4; line++) {
            for (int element = 0; element < 4; element++) {
                System.out.print(" " + listB[line][element]);
            }
            System.out.println();
        }
        System.out.println("Треугольник вида C");
        for (int line = 0; line < 4; line++) {
            for (int element = 0; element < 4; element++) {
                System.out.print(" " + listC[line][element]);
            }
            System.out.println();
        }
        System.out.println("Треугольник вида D");
        for (int line = 0; line < 4; line++) {
            for (int element = 0; element < 4; element++) {
                System.out.print(" " + listD[line][element]);
            }
            System.out.println();
        }
    }
}
