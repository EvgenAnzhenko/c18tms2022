package by.teachmeskills.robot.legs;

import by.teachmeskills.robot.Parts;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class ToshibaLeg extends Parts implements ILeg {
    public ToshibaLeg(int price) {
        super.setPrice(price);
    }

    @Override
    public void step() {
        System.out.println("Делается шаг ногой Toshiba");
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}