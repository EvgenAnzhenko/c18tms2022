package by.clinic.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Patient {
    private String name;
    private String surName;
    private int curePlan;

    public Patient(String name, String surName) {
        this.name = name;
        this.surName = surName;
        this.curePlan = addCurePlan();
    }

    private int addCurePlan() {
        CurePlan curePlan = new CurePlan();
        return curePlan.composeCurePlan();
    }

}
