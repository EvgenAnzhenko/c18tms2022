package com.lessons.service;


import com.lessons.model.Figure;
import com.lessons.model.Line;
import com.lessons.model.Rectangle;
import com.lessons.model.Triangle;

import static com.lessons.model.FigureTypes.*;

public class Main {

    public static void main(String[] args) {
        printSquare(new Line(3), new Rectangle(4, 6), new Triangle(4, 7, 8));
    }

    public static void printSquare(Figure... figures) {
        for (Figure figure : figures) {
            if (figure.getType() == LINE) {
                System.out.println("Для линии не получится вычислить площадь");
            } else if (figure.getType() == TRIANGLE) {
                System.out.println(((Triangle) figure).getSquare());
            } else if (figure.getType() == RECTANGLE) {
                System.out.println(((Rectangle) figure).getSquare());
            }
        }
    }
}
