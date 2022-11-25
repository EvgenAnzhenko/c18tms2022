package by.shop.service;

import by.shop.model.Bouquet;
import by.shop.model.Flower;

import java.util.ArrayList;

public class FlowerMarket {
    public Bouquet getBouquet(Flower.FlowerType... flowers) {
        ArrayList<Flower> bouquet = new ArrayList<>();
        for (Flower.FlowerType flower : flowers) {
            bouquet.add(new Flower(flower.getName(), flower.getCost()));
        }
        return new Bouquet(bouquet);
    }

    public int getCostAllBouquet(ArrayList<Bouquet> bouquets) {
        int inCome = 0;
        for (Bouquet bouquet : bouquets) {
            inCome += bouquet.costResult();
        }
        return inCome;
    }
}
