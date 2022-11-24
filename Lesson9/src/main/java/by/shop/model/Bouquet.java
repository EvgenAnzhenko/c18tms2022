package by.shop.model;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor

public class Bouquet {
    private ArrayList<Flower> list;

    public Bouquet(ArrayList<Flower> list) {

        this.list = list;

    }

    private int result;

    public int costResult() {               // Метод считает стоимость букета

        for (Flower flower : list) {

            result += flower.getCost();
        }

        return result;
    }

    public String infoBouquet() {
        String str = "Букет состоит из : ";
        int cost = 0;
        for (Flower flower : list) {

            str = str + flower.getName() + " ";
            cost += flower.getCost();
        }

        return str + ". Стоимость букета: " + cost;


    }
}
