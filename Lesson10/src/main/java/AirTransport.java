import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirTransport extends Transport {
    private int wingspan;
    private int minimumLengthRunway;

    public AirTransport(int power, int maxSpeed, int weight, String model, int wingspan, int minimumLengthRunway) {
        super(power, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.minimumLengthRunway = minimumLengthRunway;
    }
}
