package by.shop.service;

import by.shop.model.Bouquet;
import by.shop.model.Flower;

import java.util.ArrayList;

import static by.shop.model.Flower.FlowerType.*;

public class Main {
    public static void main(String[] args) {
        FlowerMarket shop = new FlowerMarket();
        ArrayList<Bouquet> bouquets = new ArrayList<>();
        bouquets.add(shop.getBouquet(ROSE, LILY, ASTER));
        bouquets.add(shop.getBouquet(ROSE, LILY, ASTER, CARNATION));
        for (Bouquet bouquet : bouquets) {
            System.out.println(bouquet.infoBouquet());
        }
        System.out.println("Выручка общая : " + shop.getCostAllBouquet(bouquets));
        System.out.println("Количество  проданных цветов : " + Flower.getAmountFlowers());
    }
}
