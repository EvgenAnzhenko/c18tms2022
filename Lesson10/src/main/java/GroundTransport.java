import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GroundTransport extends Transport {
    private int numberOfWheels;
    private int fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;

    }


}
