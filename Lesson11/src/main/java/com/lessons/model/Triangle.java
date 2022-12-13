package com.lessons.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.lessons.model.FigureTypes.TRIANGLE;

@Getter
@AllArgsConstructor
public class Triangle extends Figure implements Colculationable {
    int sideA;
    int sideB;
    int sideC;

    @Override
    public FigureTypes getType() {
        return TRIANGLE;
    }

    @Override
    public double getSquare() {
        double perimeter = (getSideA() + getSideB() + getSideC()) * 1.0 / 2;
        return Math.sqrt(perimeter * (perimeter - getSideA()) * (perimeter - getSideB()) * (perimeter - getSideC()));
    }
}
