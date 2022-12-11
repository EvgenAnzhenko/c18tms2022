package by.clothing.model;

public class Tie extends Clothing implements MenClothing {
    public Tie(ClothingSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Tie: " + getSize() + ", Price " + getPrice() + ", Color " + getColor() + ".");
    }
}
