import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WarPlane extends AirTransport {
    private boolean ejectionSystem;
    private int numberOfMissiles;

    public WarPlane(int power, int maxSpeed, int weight, String model, int wingspan, int minimumLengthRunway, boolean ejectionSystem, int numberOfMissiles) {
        super(power, maxSpeed, weight, model, wingspan, minimumLengthRunway);
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissiles = numberOfMissiles;
    }

    void shot() {
        System.out.println(getNumberOfMissiles() > 0 ? "Ракета пошла..." : "Боеприпасы отсутствуют");
    }

    void ejection() {
        System.out.println(isEjectionSystem() ? "Катапультирование прошло успешно" : "У вас нет такой системы");
    }

    public String toString() {
        return "This is a WarPlane: NumberOfMissiles - " + getNumberOfMissiles() + ", EjectionSystem - " + (isEjectionSystem() ? "is on the Plane" : "is not on the Plane") +
                ", Power kV is - " + powerToPowerKv(getPower()) + ", " + super.toString() + ".";
    }

}
