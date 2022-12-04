package by.task3.model;

import by.task3.service.IStart;

public class Cosmodrome {
    void Start(IStart spaceShip) throws InterruptedException {
        if (spaceShip.checkSystem()) {
            spaceShip.engineStart();
            countDown();
            spaceShip.start();
        }
    }

    private void countDown() throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            Thread.sleep(500);
            System.out.print(i + "      ");
        }
        System.out.println();
    }
}
