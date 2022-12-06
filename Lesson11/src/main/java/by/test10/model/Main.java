package by.test10.model;

import static by.test10.utils.Instrument.Type.*;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.createInstrument(GUITAR, DRUM, TRUMPET);
        shop.play(shop.instruments);
    }
}
