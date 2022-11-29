package by.clinic.model;

public class Surgeon extends Doctors {
    public Surgeon(String name, String surName, String specialization) {
        super(name, surName, specialization);
    }

    @Override
    public void cure() {
        System.out.println("Хирург произвел лечение");
    }
}
