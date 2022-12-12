package com.lessons.utils;

import com.lessons.model.Figure;
import com.lessons.model.Line;
import com.lessons.model.Rectangle;
import com.lessons.model.Triangle;

import static com.lessons.model.FigureTypes.*;

public class SquareHelper {
    public void getSquare(Figure... figures) {
        for (Figure figure : figures) {
            if (figure.getType() == LINE) {
                System.out.println("Длина линии равна: " + ((Line) figure).getLength());
            } else if (figure.getType() == TRIANGLE) {
                ((Triangle) figure).getSquare();
            } else if (figure.getType() == RECTANGLE) {
                ((Rectangle) figure).getSquare();
            }
        }
    }
}
