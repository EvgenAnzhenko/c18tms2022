package by.test11.model;

public class Pants extends Clothing implements MenClothing, WomenClothing {
    public Pants(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }

    @Override
    public String toString() {
        return "Pants, Size: " + getSize() + ", Price " + getPrice() + ", Color " + getColor() + ".";
    }
}
