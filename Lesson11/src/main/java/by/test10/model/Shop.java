package by.test10.model;

import by.test10.utils.Instrument;
import lombok.Getter;

import java.util.ArrayList;


@Getter
public class Shop {
    ArrayList<Instrument> instruments = new ArrayList<>();

    public void createInstrument(Instrument.Type... instrument) {
        for (Instrument.Type type : instrument) {
            switch (type) {
                case GUITAR -> instruments.add(new Guitar(6));
                case DRUM -> instruments.add(new Drum(60, 20));
                case TRUMPET -> instruments.add(new Trumpet(20));
            }
        }
    }

    public void play(ArrayList<Instrument> instruments) {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
