package by.teachmeskills.robot.hands;

import by.teachmeskills.robot.Parts;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class ToshibaHand extends Parts implements IHand {
    public ToshibaHand(int price) {
        super.setPrice(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Toshiba");
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
