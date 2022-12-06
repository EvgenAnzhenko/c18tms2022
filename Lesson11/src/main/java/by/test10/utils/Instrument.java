package by.test10.utils;

public interface Instrument {
    String KEY = "До мажор";

    void play();

    enum Type {
        GUITAR, DRUM, TRUMPET
    }

}
