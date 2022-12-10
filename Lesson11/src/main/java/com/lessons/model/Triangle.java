package com.lessons.model;

import lombok.Getter;

@Getter
public class Triangle extends Figure {
    public Triangle(int length, int width, int hypotenuse) {
        super(length, width, hypotenuse);
    }

    public double getSquare() {
        double perimeter = (getLength() + getWidth() + getHypotenuse()) * 1.0 / 2;
        return Math.sqrt(perimeter * (perimeter - getLength()) * (perimeter - getWidth()) * (perimeter - getHypotenuse()));
    }
}
