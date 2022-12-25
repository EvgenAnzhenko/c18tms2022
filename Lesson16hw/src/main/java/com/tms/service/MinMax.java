package com.tms.service;

import java.util.Arrays;

public class MinMax<T> {
    private T[] mass;

    public MinMax(T[] ints) {
        this.mass = ints;
    }

    public void printMinMax() {
        Arrays.sort(mass);
        System.out.println("Min: " + mass[0] + "\n" + "Max: " + mass[mass.length - 1]);
    }

    public static void main(String[] args) {
        Integer[] mas1 = new Integer[3];
        mas1[0] = 1;
        mas1[1] = 9;
        mas1[2] = 3;
        String[] mas2 = new String[3];
        mas2[0] = "а";
        mas2[1] = "я";
        mas2[2] = "б";
        MinMax minMax = new MinMax(mas1);
        MinMax minMax1 = new MinMax(mas2);
        minMax.printMinMax();
        minMax1.printMinMax();
    }
}
