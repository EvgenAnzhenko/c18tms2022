package by.teachmeskills.robot.legs;

import by.teachmeskills.robot.Parts;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class SonyLeg extends Parts implements ILeg {
    public SonyLeg(int price) {
        super.setPrice(price);
    }

    @Override
    public void step() {
        System.out.println("Делается шаг ногой Sony");

    }

}
