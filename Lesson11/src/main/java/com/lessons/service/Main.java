package com.lessons.service;

import com.lessons.model.FigureTypes;
import com.lessons.model.Line;
import com.lessons.model.Rectangle;
import com.lessons.model.Triangle;

import static com.lessons.model.Figure.listOfFigures;

public class Main {

    public static void main(String[] args) {
        Logic Logic = new Logic();
        listOfFigures.add(new Rectangle(1, 2));
        listOfFigures.add(new Line(5));
        listOfFigures.add(new Triangle(5, 5, 9));
        Logic.getSquare(FigureTypes.TRIANGLE);
        Logic.getSquare(FigureTypes.LINE);
        Logic.getSquare(FigureTypes.RECTANGLE);
    }
}
