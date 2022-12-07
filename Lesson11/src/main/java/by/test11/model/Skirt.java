package by.test11.model;

public class Skirt extends Clothing implements WomenClothing {
    public Skirt(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
    }

    @Override
    public String toString() {
        return "Skirt, Size: " + getSize() + ", Price " + getPrice() + ", Color " + getColor() + ".";
    }
}
