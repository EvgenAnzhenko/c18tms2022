package by.clinic.model;

public class Therapist extends Doctors {
    public Therapist(String name, String surName, String specialization) {
        super(name, surName, specialization);
    }

    @Override
    public void cure() {
        System.out.println("Терапевт произвел лечение");
    }
}
