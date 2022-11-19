package by.tms.model;

public class Car {

    private boolean status;
    private long timeStart;
    private long timeStop;
    private int odometer;
    private int odometerOne;
    private int fuel = 55;
    Engine carEngine;
    Gastank carGasTank;

    public Car(String carEngine, int carGasTank) {
        this.carEngine = new Engine(carEngine);
        this.carGasTank = new Gastank(carGasTank);
    }

    public int getOdometer() {
        return odometer;
    }

    public int getOdometerOne() {
        return odometerOne;
    }

    public void gasStation(int value) {
        if (fuel + value <= carGasTank.getVolume()) {
            fuel += value;
        } else if (fuel + value > carGasTank.getVolume()) {
            System.out.println("Бак полный, влезло только " + (carGasTank.getVolume() - fuel));
            fuel += carGasTank.getVolume() - fuel;
        }

    }

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
        odometer += (int) (90 * (timeStop - timeStart));
        odometerOne = (int) (90 * (timeStop - timeStart));


    }


}
