package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {

    public static void main(String[] args) {
        Robot sony = new Robot(new SonyHead(100), new SonyHand(20), new SonyLeg(30));
        sony.action();
        Robot toshiba = new Robot(new ToshibaHead(100), new ToshibaHand(40), new ToshibaLeg(60));
        toshiba.action();
        Robot samsung = new Robot(new SamsungHead(100), new SamsungHand(20), new SamsungLeg(50));
        samsung.action();
        sony.calculateOfExpensive(toshiba, samsung, sony);

        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}
