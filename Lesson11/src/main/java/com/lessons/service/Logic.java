package com.lessons.service;

import com.lessons.model.*;

import static com.lessons.model.Figure.listOfFigures;
import static com.lessons.model.FigureTypes.*;

public class Logic {
    void getSquare(FigureTypes type) {
        for (Figure figure : listOfFigures) {
            if (figure.getClass() == Line.class && type == LINE) {
                System.out.println("Длина линии равна: " + figure.getLength());
            } else if (figure.getClass() == Triangle.class && type == TRIANGLE) {
                System.out.println("Площадь треугольника равна: " + ((Triangle) figure).getSquare());
            } else if (figure.getClass() == Rectangle.class && type == RECTANGLE) {
                System.out.println("Площадь прямоугольника равна: " + ((Rectangle) figure).getSquare());
            }
        }
    }
}
