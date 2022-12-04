package by.inter.service;

public class Shoes implements Action {
    @Override
    public void putOn() {
        System.out.println("Надел Туфли");
    }

    @Override
    public void putOff() {
        System.out.println("Снял Туфли");
    }
}
