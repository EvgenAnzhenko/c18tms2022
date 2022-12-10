package com.lessons.service;

import com.lessons.model.*;

import static com.lessons.model.Figure.listOfFigures;

public class Logic {
    void getSquare(FigureTypes type) {
        for (Figure figure : listOfFigures) {
            if (figure.getClass() == Line.class && type == FigureTypes.LINE) {
                System.out.println("Длина линии равна: " + figure.getLength());
            } else if (figure.getClass() == Triangle.class && type == FigureTypes.TRIANGLE) {
                System.out.println("Площадь треугольника равна: " + ((Triangle) figure).getSquare());
            } else if (figure.getClass() == Rectangle.class && type == FigureTypes.RECTANGLE) {
                System.out.println("Площадь прямоугольника равна: " + ((Rectangle) figure).getSquare());
            }
        }
    }
}
