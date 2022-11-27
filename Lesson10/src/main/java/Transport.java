import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String model;

    protected double powerToPowerKv(int power) {
        return (power * 0.74);
    }

    @Override
    public String toString() {
        return "Power is - " + getPower() + ", MaxSpeed is - " + getMaxSpeed() + ", Weight is - " +
                getWeight() + ", Model is - " + getModel();
    }
}
