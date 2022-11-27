import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TruckCar extends GroundTransport {
    private int loadCapacity;

    public TruckCar(int power, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    void checkWeightOfLoad(int weight) {
        System.out.println(weight > getLoadCapacity() ? "Вам нужен грузовик побольше" : "Все норм");
    }

    @Override
    public String toString() {
        return "This is a Truck: LoadCapacity is - " + getLoadCapacity() + ", NumberOfWheels is - " + getNumberOfWheels() +
                ", FuelConsumption is - " + getFuelConsumption() + ", Power kV is - " + powerToPowerKv(getPower()) + ", " + super.toString() + ".";
    }
}
