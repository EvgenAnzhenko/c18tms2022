package by.test11.model;

import static by.test11.utils.ClothingSize.*;

public class Main {
    public static void main(String[] args) {
        Atelier atelier = new Atelier();
        atelier.dressMan(atelier.getListClothing(XXS, XS, S, M, L));
    }
}
