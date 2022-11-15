package by.tms.model;

import java.util.Scanner;

public class Computer {
    private String cpu;
    private int ram;
    private int hdd;
    private int cycles;
    private boolean burned = true;

    public void on() {
        if (burned) {

            System.out.println("Внимание! Введите 0 или 1");
            Scanner scanner = new Scanner(System.in);
            int random = (int) (Math.random() * 2);

            if (scanner.nextInt() == random) {
                off();
            } else {
                System.out.println("Компьютер сгорает");
                burned = false;
            }

        } else {
            System.out.println("Компьютер сгорел");
        }
    }

    public void off() {
        if (cycles != 0) {
            System.out.println("Выключение компьютера");
            cycles--;
        } else {
            System.out.println("Компьютер сгорел!");
        }
    }

    public void info() {
        System.out.println("Процессор:" + cpu + " оперативка:" + ram + " жесткий диск:" + hdd + " полных рабочих циклов:" + cycles);
    }

    public Computer(String cpu, int ram, int hdd, int cycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.cycles = cycles;
    }

}
