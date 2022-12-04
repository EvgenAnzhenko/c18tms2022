package by.inter.model;

import by.inter.service.Jacket;
import by.inter.service.Pants;
import by.inter.service.Shoes;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String name;
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public void actionPutOn() {
        pants.putOn();
        shoes.putOn();
        jacket.putOn();
    }

    public void actionPutOff() {
        pants.putOff();
        shoes.putOff();
        jacket.putOff();
    }


}
