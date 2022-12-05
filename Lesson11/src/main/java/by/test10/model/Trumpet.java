package by.test10.model;

import by.test10.utils.Instrument;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Trumpet implements Instrument {
    private int diameter;

    @Override
    public void play() {
        System.out.println("Играет Труба! Диаметр: " + diameter + ".");
    }
}
