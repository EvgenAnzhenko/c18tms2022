package by.shop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter

public class Flower {

    private String name;
    private int cost;

    private static int amountFlowers;

    public Flower(String name, int cost) {
        this.name = name;
        this.cost = cost;
        amountFlowers++;
    }

    public static int getAmountFlowers() {    //Количество проданных цветов
        return amountFlowers;
    }

    @AllArgsConstructor
    @Getter
    @ToString
    public enum FlowerType {

        ROSE(15), lILY(7), ASTER(5), HERBERA(5),
        TULIP(8), CARNATION(11);

        private final int cost;

    }


}


