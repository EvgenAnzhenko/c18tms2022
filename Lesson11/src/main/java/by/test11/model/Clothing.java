package by.test11.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Clothing {
    int size;
    int price;
    String color;

    public Clothing(int size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public abstract String toString();
}
