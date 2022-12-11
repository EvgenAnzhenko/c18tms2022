package by.clothing.model;

public class Tshirt extends Clothing implements MenClothing, WomenClothing {
    public Tshirt(ClothingSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man`s T-shirt: " + getSize() + ", Price " + getPrice() + ", Color " + getColor() + ".");
    }

    @Override
    public void dressWomen() {
        System.out.println("Woman`s T-shirt: " + getSize() + ", Price " + getPrice() + ", Color " + getColor() + ".");
    }
}
