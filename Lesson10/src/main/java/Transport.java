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

    double powerToPowerKv(int power) {
        return (power * 0.74);
    }
}
