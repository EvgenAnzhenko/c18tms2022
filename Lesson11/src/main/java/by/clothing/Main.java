package by.clothing;

import by.clothing.model.*;
import by.clothing.service.Atelier;

import java.util.ArrayList;

import static by.clothing.model.ClothingColor.*;
import static by.clothing.model.ClothingSize.*;

public class Main {
    ArrayList<Clothing> clothing = new ArrayList<>();

    public void getListClothing(ClothingSize... clothingSizes) {

        for (ClothingSize clothingSize : clothingSizes) {
            switch (clothingSize) {

                case XXS -> {
                    clothing.add(new Tshirt(XXS, 20, getRandomColor()));
                    clothing.add(new Pants(XXS, 50, getRandomColor()));
                    clothing.add(new Tie(XXS, 10, getRandomColor()));
                    clothing.add(new Skirt(XXS, 30, getRandomColor()));
                }
                case XS -> {
                    clothing.add(new Tshirt(XS, 20, getRandomColor()));
                    clothing.add(new Pants(XS, 50, getRandomColor()));
                    clothing.add(new Tie(XS, 10, getRandomColor()));
                    clothing.add(new Skirt(XS, 30, getRandomColor()));
                }
                case S -> {
                    clothing.add(new Tshirt(S, 20, getRandomColor()));
                    clothing.add(new Pants(S, 50, getRandomColor()));
                    clothing.add(new Tie(S, 10, getRandomColor()));
                    clothing.add(new Skirt(S, 30, getRandomColor()));
                }
                case M -> {
                    clothing.add(new Tshirt(M, 20, getRandomColor()));
                    clothing.add(new Pants(M, 50, getRandomColor()));
                    clothing.add(new Tie(M, 10, getRandomColor()));
                    clothing.add(new Skirt(M, 30, getRandomColor()));
                }
                case L -> {
                    clothing.add(new Tshirt(L, 20, getRandomColor()));
                    clothing.add(new Pants(L, 50, getRandomColor()));
                    clothing.add(new Tie(L, 10, getRandomColor()));
                    clothing.add(new Skirt(L, 30, getRandomColor()));
                }
            }
        }
    }

    private String getRandomColor() {
        int numberColor = (int) (Math.random() * 4);
        return switch (numberColor) {
            case 0 -> BLUE.name();
            case 1 -> BLACK.name();
            case 2 -> ORANGE.name();
            case 3 -> WHITE.name();
            default -> throw new IllegalStateException("Unexpected value: " + numberColor);
        };

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getListClothing(XXS, XS, S, M, L);
        Atelier atelier = new Atelier();
        atelier.dressMan(main.clothing);
        atelier.dressWomen(main.clothing);

    }
}
