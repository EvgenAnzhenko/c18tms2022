import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter

@ToString
public class Flower extends Bouquet {
    private String name;
    private int cost;


}
