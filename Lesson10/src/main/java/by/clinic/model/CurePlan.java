package by.clinic.model;

import lombok.Getter;

@Getter
public class CurePlan {
    private final int numberOfCurePlan;

    public CurePlan() {
        this.numberOfCurePlan = (int) (Math.random() * 3);
    }
}



