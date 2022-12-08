package by.test11.model;

public class Tie extends Clothing implements MenClothing {
    public Tie(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public String toString() {
        return "Tie, Size: " + getSize() + ", Price " + getPrice() + ", Color " + getColor() + ".";
    }
}
