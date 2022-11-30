package by.clinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Doctor {
    private String name;
    private String surName;
    private String specialization;

    public abstract void cure();
}
