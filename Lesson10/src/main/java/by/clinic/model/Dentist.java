package by.clinic.model;

public class Dentist extends Doctor {
    public Dentist(String name, String surName, String specialization) {
        super(name, surName, specialization);
    }

    @Override
    public void cure() {
        System.out.println("Дантист произвел лечение");
    }

}
