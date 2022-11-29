package by.clinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Patient extends CurePlan {
    private String name;
    private String surName;

}
