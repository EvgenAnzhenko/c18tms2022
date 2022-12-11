package by.clothing.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Clothing {
    private ClothingSize size;
    private int price;
    private String color;

    public Clothing(ClothingSize size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
