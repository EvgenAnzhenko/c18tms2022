package by.serializ.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class FuelTank implements Serializable {
    private String fuelType;
    private int volume;
}
