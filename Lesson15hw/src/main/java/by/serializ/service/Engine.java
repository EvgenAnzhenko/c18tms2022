package by.serializ.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class Engine implements Serializable {
    private String type;
    private transient int countCylinders;
}
