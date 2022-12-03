package by.teachmeskills.robot.hands;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SamsungHand implements IHand {

    private int price;

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
