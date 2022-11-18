package by.tms.model;

public class Car {

    public Car(String carEngine, int carGasTank) {
        this.carEngine = new Engine(carEngine);
        this.carGasTank = new Gastank(carGasTank);
    }

    private boolean status;
    private long timeStart;
    private long timeStop;

    private long odometer = 0;
    private long odometerOne = 0;

    public long getOdometer() {
        return odometer;
    }

    public long getOdometerOne() {
        return odometerOne;
    }


    int fuel = 55;

    public void gasStation(int value) {
        if (fuel + value <= carGasTank.volume) {
            fuel += value;
        } else if (fuel + value > carGasTank.volume) {
            System.out.println("Бак полный, влезло только " + (carGasTank.volume - fuel));
            fuel += carGasTank.volume - fuel;
        }

    }

    Engine carEngine;
    Gastank carGasTank;

    public void carStart() {
        if (fuel > 0) {
            status = true;
            carEngine.engineStart();
            System.out.println("Машина завелась");
        } else {
            System.out.println("Топлива нет, нужно заправиться");
        }


    }

    public void carStop() {
        status = false;
        carEngine.engineStop();
        System.out.println("Машина заглушилась");
        this.timeStop = (System.currentTimeMillis()) / 1000;
        odometer();

    }

    public void go() {

        if (status) {
            System.out.println("Пашина поехала");
            this.timeStart = System.currentTimeMillis() / 1000;

        }

    }

    public void odometer() {
        //Здесь вымышленно считаем, что машина проехала не секунды, а часы со скоростью 90км/ч и рассчитываем Одометр
        //Немного усложнил условие задачи
        odometer += 90 * (timeStop - timeStart);
        odometerOne = 90 * (timeStop - timeStart);


    }


}
