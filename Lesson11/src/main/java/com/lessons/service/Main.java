package com.lessons.service;


import com.lessons.model.Line;
import com.lessons.model.Rectangle;
import com.lessons.model.Triangle;
import com.lessons.utils.SquareHelper;

public class Main {

    public static void main(String[] args) {
        SquareHelper squareHelper = new SquareHelper();
        squareHelper.getSquare(new Line(3), new Rectangle(4, 6), new Triangle(4, 7, 8));
    }
}
