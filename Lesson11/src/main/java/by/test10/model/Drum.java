package by.test10.model;

import by.test10.utils.Instrument;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Drum implements Instrument {
    private int diameter;
    private int depth;

    @Override
    public void play() {
        System.out.println("Играет Барабан! Диаметр: " + diameter + " Глубина: " + depth + ".");
    }
}
