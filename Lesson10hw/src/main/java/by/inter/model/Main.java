package by.inter.model;

import by.inter.service.Jacket;
import by.inter.service.Pants;
import by.inter.service.Shoes;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Имя", new Jacket(), new Pants(), new Shoes());
        person.actionPutOn();
        person.actionPutOff();
    }


}
