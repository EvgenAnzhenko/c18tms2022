package by.serializ.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class Car implements Serializable {
    private String model;
    private Engine engine;
    private FuelTank fuelTank;


}
