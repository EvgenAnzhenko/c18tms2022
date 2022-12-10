package com.lessons.model;

import lombok.Getter;

@Getter
public class Rectangle extends Figure {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    public int getSquare() {
        return getWidth() * getLength();
    }
}
