package by.shop.service;

import by.shop.model.Bouquet;
import by.shop.model.Flower;

import java.util.ArrayList;

public class FlowerMarket {

    public Bouquet getBouquet(Flower.FlowerType... flowers) {
        ArrayList<Flower> list = new ArrayList<>();
        for (Flower.FlowerType flower : flowers) {
            switch (flower) {
                case ROSE -> list.add(new Flower("Роза", Flower.FlowerType.ROSE.getCost()));
                case lILY -> list.add(new Flower("Лилия", Flower.FlowerType.lILY.getCost()));
                case ASTER -> list.add(new Flower("Астра", Flower.FlowerType.ASTER.getCost()));
                case HERBERA -> list.add(new Flower("Гербера", Flower.FlowerType.HERBERA.getCost()));
                case TULIP -> list.add(new Flower("Тюльпан", Flower.FlowerType.TULIP.getCost()));
                case CARNATION -> list.add(new Flower("Гвоздика", Flower.FlowerType.CARNATION.getCost()));
            }
        }
        return new Bouquet(list);
    }

    public static int inCome(ArrayList<Bouquet> bouquets) {
        int inCome = 0;
        for (Bouquet bouquet : bouquets) {
            inCome += bouquet.costResult();
        }

        return inCome;
    }

    public static void main(String[] args) {
        FlowerMarket shop = new FlowerMarket();

        ArrayList<Bouquet> bouquets = new ArrayList<>();
        bouquets.add(shop.getBouquet(Flower.FlowerType.ROSE, Flower.FlowerType.lILY, Flower.FlowerType.ASTER));
        bouquets.add(shop.getBouquet(Flower.FlowerType.ROSE, Flower.FlowerType.lILY, Flower.FlowerType.ASTER, Flower.FlowerType.CARNATION));

        System.out.println(bouquets.get(0).infoBouquet());
        System.out.println(bouquets.get(1).infoBouquet());

        System.out.println("Выручка общая : " + inCome(bouquets));
        System.out.println("Количество  проданных цветов : " + by.shop.model.Flower.getAmountFlowers());
    }
}
