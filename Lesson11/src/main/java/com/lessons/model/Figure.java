package com.lessons.model;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public abstract class Figure {
    private int length;
    private int width;
    private int hypotenuse;
    public static ArrayList<Figure> listOfFigures = new ArrayList<>();

    public Figure(int length) {
        this.length = length;
    }

    public Figure(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Figure(int length, int width, int hypotenuse) {
        this.length = length;
        this.width = width;
        this.hypotenuse = hypotenuse;
    }

}

