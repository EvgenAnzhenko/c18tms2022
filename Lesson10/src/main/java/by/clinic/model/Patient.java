package by.clinic.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Patient {
    private String name;
    private String surName;
    private CurePlan curePlan;

    public Patient(String name, String surName) {
        this.name = name;
        this.surName = surName;

    }
}
