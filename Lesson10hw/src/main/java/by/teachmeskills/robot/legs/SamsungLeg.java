package by.teachmeskills.robot.legs;

import by.teachmeskills.robot.Parts;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SamsungLeg extends Parts implements ILeg {
    public SamsungLeg(int price) {
        super.setPrice(price);
    }

    @Override
    public void step() {
        System.out.println("Делается шаг ногой Samsung");

    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}