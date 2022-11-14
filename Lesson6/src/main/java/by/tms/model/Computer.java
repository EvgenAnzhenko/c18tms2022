package by.tms.model;

import java.util.Scanner;

public class Computer {
    String cpu;
    int ram;
    int hdd;
    int cycles;
    int status = 1;

    public void on() {
        if (status == 1) {

            System.out.println("Внимание! Введите 0 или 1");
            Scanner scanner = new Scanner(System.in);
            int random = (int) (Math.random() * 2);

            if (scanner.nextInt() == random) {
                off();
            } else {
                System.out.println("Компьютер сгорает");
                status--;
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

    Computer(String cpu, int ram, int hdd, int cycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.cycles = cycles;
    }

    public static void main(String[] args) {
        Computer com = new Computer("i7", 8192, 1000, 1000);
        com.on();
        com.info();

    }
}
