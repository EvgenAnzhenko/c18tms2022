package by.teachmeskills.robot.heads;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SamsungHead implements IHead {
    private int price;

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
