package by.teachmeskills.robot.legs;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SonyLeg implements ILeg {
    private int price;

    @Override
    public void step() {
        System.out.println("Делается шаг ногой Sony");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
