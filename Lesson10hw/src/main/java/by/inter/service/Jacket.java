package by.inter.service;

public class Jacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надел куртку");
    }

    @Override
    public void putOff() {
        System.out.println("Снял куртку");
    }
}
