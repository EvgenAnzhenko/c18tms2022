package com.lessons.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.lessons.model.FigureTypes.TRIANGLE;

@Getter
@AllArgsConstructor
public class Triangle extends Figure implements Colculationable {
    private final FigureTypes type = TRIANGLE;
    int sideA;
    int sideB;
    int sideC;

    @Override
    public FigureTypes getType() {
        return type;
    }

    @Override
    public void getSquare() {
        double perimeter = (getSideA() + getSideB() + getSideC()) * 1.0 / 2;
        System.out.println("Площадь треугольника: " + Math.sqrt(perimeter * (perimeter - getSideA()) * (perimeter - getSideB()) * (perimeter - getSideC())));
    }
}
