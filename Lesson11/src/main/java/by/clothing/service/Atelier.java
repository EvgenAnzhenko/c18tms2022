package by.clothing.service;

import by.clothing.model.Clothing;
import by.clothing.model.MenClothing;
import by.clothing.model.WomenClothing;

import java.util.ArrayList;

public class Atelier {
    public ArrayList<Clothing> clothing;

    public Atelier(ArrayList<Clothing> clothing) {
        this.clothing = clothing;
    }

    public void dressMan(ArrayList<Clothing> clothing) {
        for (Clothing dress : clothing) {
            if (dress instanceof MenClothing) {
                ((MenClothing) dress).dressMan();
            }
        }
    }

    public void dressWomen(ArrayList<Clothing> clothing) {
        for (Clothing dress : clothing) {
            if (dress instanceof WomenClothing) {
                ((WomenClothing) dress).dressWomen();
            }
        }
    }
}
