import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car extends GroundTransport {
    private String carType;
    private int numberOfPassengers;

    public Car(int power, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption, String carType, int numberOfPassengers) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.carType = carType;
        this.numberOfPassengers = numberOfPassengers;
    }

    void calculateDistance(int time) {
        System.out.println("За " + time + " ч. автомобиль \"" + getModel() + "\" проедет с максимальной скоростью(" + getMaxSpeed() + " км/ч) : " + (time * getMaxSpeed()) + " км, потратит топлива : " + calculateUsedFuel(time) + " л.");
    }

    private Double calculateUsedFuel(double time) {
        return time * getMaxSpeed() * getFuelConsumption() / 100;
    }

    @Override
    public String toString() {
        return "This is a car: CarType is - " + getCarType() + ", NumberOfPassengers is - " + getNumberOfPassengers() + ", NumberOfWheels is - " + getNumberOfWheels() +
                ", FuelConsumption is - " + getFuelConsumption() + ", Power kV is - " + powerToPowerKv(getPower()) + ", " + super.toString() + ".";
    }
}
