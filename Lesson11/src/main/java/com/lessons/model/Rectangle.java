package com.lessons.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.lessons.model.FigureTypes.RECTANGLE;

@Getter
@AllArgsConstructor
public class Rectangle extends Figure implements Colculationable {
    private final FigureTypes type = RECTANGLE;
    private int height;
    private int width;

    @Override
    public FigureTypes getType() {
        return type;
    }

    @Override
    public void getSquare() {
        System.out.println("Площадь прямоугольника: " + getWidth() * getHeight());
    }
}
