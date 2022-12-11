package by.clothing.model;

public class Skirt extends Clothing implements WomenClothing {
    public Skirt(ClothingSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Skirt: " + getSize() + ", Price " + getPrice() + ", Color " + getColor() + ".");
    }
}
