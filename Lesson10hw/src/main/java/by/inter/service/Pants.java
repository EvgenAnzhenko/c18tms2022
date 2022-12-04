package by.inter.service;

public class Pants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надел штаны");
    }

    @Override
    public void putOff() {
        System.out.println("Снял штаны");
    }
}
