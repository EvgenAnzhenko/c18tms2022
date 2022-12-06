package by.test10.model;

import by.test10.utils.Instrument;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Guitar implements Instrument {
    private int numberOfStrings;

    @Override
    public void play() {
        System.out.println("Играет Гитара! Количество струн: " + numberOfStrings + ".");
    }
}
