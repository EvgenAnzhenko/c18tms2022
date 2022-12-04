package by.teachmeskills.robot.heads;

import by.teachmeskills.robot.Parts;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class ToshibaHead extends Parts implements IHead {
    public ToshibaHead(int price) {
        super.setPrice(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Toshiba");
    }

}
