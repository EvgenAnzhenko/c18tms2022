package by.teachmeskills.robot.hands;

import by.teachmeskills.robot.Parts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class SonyHand extends Parts implements IHand {
    public SonyHand(int price) {
        super.setPrice(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Sony");
    }

}
