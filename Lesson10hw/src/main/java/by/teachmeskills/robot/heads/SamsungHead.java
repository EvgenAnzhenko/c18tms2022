package by.teachmeskills.robot.heads;

import by.teachmeskills.robot.Parts;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SamsungHead extends Parts implements IHead {
    public SamsungHead(int price) {
        super.setPrice(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
