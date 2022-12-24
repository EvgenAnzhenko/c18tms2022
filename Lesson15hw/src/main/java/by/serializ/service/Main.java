package by.serializ.service;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Lesson15hw/src/main/java/by/serializ/service/car.dat"));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Lesson15hw/src/main/java/by/serializ/service/car.dat"))) {
            Car car = new Car("Audi", new Engine("Gas", 8), new FuelTank("Gas", 60));
            objectOutputStream.writeObject(car);
            Car carInput = (Car) objectInputStream.readObject();
            System.out.printf("This is a car: Model - %s, Engine type - %s, Fuel tank - %s %d liters",
                    carInput.getModel(), carInput.getEngine().getType(), carInput.getFuelTank().getFuelType(), carInput.getFuelTank().getVolume());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
