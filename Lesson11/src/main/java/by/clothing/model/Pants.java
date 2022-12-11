package by.clothing.model;

public class Pants extends Clothing implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man`s Pants: " + getSize() + ", Price " + getPrice() + ", Color " + getColor() + ".");
    }

    @Override
    public void dressWomen() {
        System.out.println("Woman`s Pants: " + getSize() + ", Price " + getPrice() + ", Color " + getColor() + ".");
    }
}
