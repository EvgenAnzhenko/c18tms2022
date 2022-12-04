package by.teachmeskills.robot.hands;

import by.teachmeskills.robot.Parts;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SamsungHand extends Parts implements IHand {
    public SamsungHand(int price) {
        super.setPrice(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Samsung");
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
