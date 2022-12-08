package by.test11.model;

public class Tshirt extends Clothing implements MenClothing, WomenClothing {
    public Tshirt(int size, int price, String color) {
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
        return "T-shirt, Size: " + getSize() + ", Price " + getPrice() + ", Color " + getColor() + ".";
    }
}
