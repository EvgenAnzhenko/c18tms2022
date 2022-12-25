package com.tms.service;

import java.io.Serializable;

public class General<V extends Animal & Serializable, T extends Comparable<String>, K extends Number> {
    private T valueFirst;
    private V valueSecond;
    private K valueThird;

    public General(T valueFirst, V valueSecond, K valueThird) {
        this.valueFirst = valueFirst;
        this.valueSecond = valueSecond;
        this.valueThird = valueThird;
    }

    public T getValueFirst() {
        return valueFirst;
    }

    public V getValueSecond() {
        return valueSecond;
    }

    public K getValueThird() {
        return valueThird;
    }

    public void getClassV() {
        System.out.println(this.valueSecond.getClass().getName());
    }

    public void getClassT() {
        System.out.println(this.valueFirst.getClass().getName());
    }

    public void getClassK() {
        System.out.println(this.valueThird.getClass().getName());
    }

    public static void main(String[] args) {
        General general = new General("String", new Animal(), 32);
        general.getClassK();
        general.getClassT();
        general.getClassV();
    }
}
