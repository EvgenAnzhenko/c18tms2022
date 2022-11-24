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
        ROSE("Роза", 15), LILY("Лилия", 7), ASTER("Астра", 5), HERBERA("Гербера", 5),
        TULIP("Тюльпан", 8), CARNATION("Гвоздика", 11);
        private final String name;
        private final int cost;
    }
}


