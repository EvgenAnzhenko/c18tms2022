public class Main {
    public static void main(String[] args) {
        Car car = new Car(110, 180, 2200, "Passat b6", 4, 8, "Седан", 5);
        TruckCar truck = new TruckCar(500, 120, 8000, "Actros", 6, 25, 30);
        truck.loadWeightCheck(50);
        car.howManyKmCarTravel(3);
        System.out.println(car.powerToPowerKv(car.getPower()));
        System.out.println(car);
    }
}
