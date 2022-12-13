package com.lessons.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.lessons.model.FigureTypes.RECTANGLE;

@Getter
@AllArgsConstructor
public class Rectangle extends Figure implements Colculationable {
    private int height;
    private int width;

    @Override
    public FigureTypes getType() {
        return RECTANGLE;
    }

    @Override
    public double getSquare() {
        return getWidth() * getHeight();
    }
}
