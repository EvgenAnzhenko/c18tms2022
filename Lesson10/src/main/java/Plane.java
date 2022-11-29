import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Plane extends AirTransport {
    private int numberOfPassengers;
    private boolean businessClass;

    public Plane(int power, int maxSpeed, int weight, String model, int wingspan, int minimumLengthRunway, int numberOfPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, model, wingspan, minimumLengthRunway);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    void checkMaxPassengers(int amount) {
        System.out.println(amount > getNumberOfPassengers() ? "Вам нужен самолет побольше" : "Все норм");
    }

    @Override
    public String toString() {
        return "This is a Plane: BusinessClass - " + (isBusinessClass() ? "is on the Plane" : "is not on the Plane") + ", NumberOfPassengers is - " + getNumberOfPassengers() +
                ", Power kV is - " + powerToPowerKv(getPower()) + ", " + super.toString() + ".";
    }

}
