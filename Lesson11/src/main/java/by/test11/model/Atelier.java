package by.test11.model;

import by.test11.utils.ClothingSize;

import java.util.ArrayList;

import static by.test11.utils.ClothingColor.*;
import static by.test11.utils.ClothingSize.*;

public class Atelier {

    public ArrayList<Clothing> getListClothing(ClothingSize... clothingSizes) {
        ArrayList<Clothing> clothing = new ArrayList<>();
        for (ClothingSize clothingSize : clothingSizes) {
            switch (clothingSize) {

                case XXS -> {
                    clothing.add(new Tshirt(XXS.getSize(), 20, color()));
                    clothing.add(new Pants(XXS.getSize(), 50, color()));
                    clothing.add(new Tie(XXS.getSize(), 10, color()));
                    clothing.add(new Skirt(XXS.getSize(), 30, color()));
                }
                case XS -> {
                    clothing.add(new Tshirt(XS.getSize(), 20, color()));
                    clothing.add(new Pants(XS.getSize(), 50, color()));
                    clothing.add(new Tie(XS.getSize(), 10, color()));
                    clothing.add(new Skirt(XS.getSize(), 30, color()));
                }
                case S -> {
                    clothing.add(new Tshirt(S.getSize(), 20, color()));
                    clothing.add(new Pants(S.getSize(), 50, color()));
                    clothing.add(new Tie(S.getSize(), 10, color()));
                    clothing.add(new Skirt(S.getSize(), 30, color()));
                }
                case M -> {
                    clothing.add(new Tshirt(M.getSize(), 20, color()));
                    clothing.add(new Pants(M.getSize(), 50, color()));
                    clothing.add(new Tie(M.getSize(), 10, color()));
                    clothing.add(new Skirt(M.getSize(), 30, color()));
                }
                case L -> {
                    clothing.add(new Tshirt(L.getSize(), 20, color()));
                    clothing.add(new Pants(L.getSize(), 50, color()));
                    clothing.add(new Tie(L.getSize(), 10, color()));
                    clothing.add(new Skirt(L.getSize(), 30, color()));
                }
            }
        }
        return clothing;
    }

    private String color() {
        int numberColor = (int) (Math.random() * 4);
        String color = null;
        switch (numberColor) {
            case 0 -> color = BLUE.name();
            case 1 -> color = BLACK.name();
            case 2 -> color = ORANGE.name();
            case 3 -> color = WHITE.name();
        }
        return color;
    }

    public void dressMan(ArrayList<Clothing> clothing) {
        for (Clothing dress : clothing) {
            if (dress instanceof MenClothing) {
                System.out.println(dress);
            }
        }
    }

    public void dressWomen(ArrayList<Clothing> clothing) {
        for (Clothing dress : clothing) {
            if (dress instanceof WomenClothing) {
                System.out.println(dress);
            }
        }
    }

}
