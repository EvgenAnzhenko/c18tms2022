package by.shop.model;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class Bouquet {
    private int result;
    private ArrayList<Flower> flowers;

    public Bouquet(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public int costResult() {               // Метод считает стоимость букета
        for (Flower flower : flowers) {
            result += flower.getCost();
        }
        return result;
    }

    public String infoBouquet() {
        String str = "Букет состоит из : ";
        int cost = 0;
        for (Flower flower : flowers) {
            str = str + flower.getName() + " ";
            cost += flower.getCost();
        }
        return str + ". Стоимость букета: " + cost;
    }
}
