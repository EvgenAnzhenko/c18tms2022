package com.lessons.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.lessons.model.FigureTypes.LINE;

@Getter
@AllArgsConstructor
public class Line extends Figure {
    private final FigureTypes type = LINE;
    private int length;

    @Override
    public FigureTypes getType() {
        return type;
    }
}
