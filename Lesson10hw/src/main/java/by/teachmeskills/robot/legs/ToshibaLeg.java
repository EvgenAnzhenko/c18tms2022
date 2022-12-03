package by.teachmeskills.robot.legs;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ToshibaLeg implements ILeg {
    private int price;

    @Override
    public void step() {
        System.out.println("Делается шаг ногой Toshiba");

    }

    @Override
    public int getPrice() {
        return price;
    }
}