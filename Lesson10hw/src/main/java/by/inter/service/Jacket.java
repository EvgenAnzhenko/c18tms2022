package by.inter.service;

public class Jacket implements Action {
    @Override
    public void putOn() {
        System.out.println("Надел куртку");
    }

    @Override
    public void putOff() {
        System.out.println("Снял куртку");
    }
}
