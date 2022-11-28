package by.clinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Doctors {
    private String name;
    private String surName;
    private String specialization;

    protected abstract void cure();
}
