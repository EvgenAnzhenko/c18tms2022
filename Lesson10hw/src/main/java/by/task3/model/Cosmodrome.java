package by.task3.model;

import by.task3.service.IStart;

public class Cosmodrome {
    void start(IStart spaceShip) {
        if (spaceShip.checkSystem()) {
            spaceShip.engineStart();
            countDown();
            spaceShip.start();
        } else {
            System.out.println("Запуск шатла невозможен");
        }
    }

    private void countDown() {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
            }
            System.out.print(i + "      ");
        }
        System.out.println();
    }
}
