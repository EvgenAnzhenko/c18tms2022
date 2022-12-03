package by.teachmeskills.robot.hands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SonyHand implements IHand {

    private int price;

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
