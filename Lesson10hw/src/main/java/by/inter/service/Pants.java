package by.inter.service;

public class Pants implements Action {
    @Override
    public void putOn() {
        System.out.println("Надел штаны");
    }

    @Override
    public void putOff() {
        System.out.println("Снял штаны");
    }
}
