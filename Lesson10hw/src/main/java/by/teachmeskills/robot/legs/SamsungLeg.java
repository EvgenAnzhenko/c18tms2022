package by.teachmeskills.robot.legs;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SamsungLeg implements ILeg {
    private int price;

    @Override
    public void step() {
        System.out.println("Делается шаг ногой Samsung");

    }

    @Override
    public int getPrice() {
        return price;
    }
}