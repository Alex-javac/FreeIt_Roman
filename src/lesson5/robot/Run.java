package lesson5.robot;

import lesson5.robot.hands.IHand;
import lesson5.robot.hands.SamsungHand;
import lesson5.robot.hands.SonyHand;
import lesson5.robot.hands.ToshibaHand;
import lesson5.robot.heads.IHead;
import lesson5.robot.heads.SamsungHead;
import lesson5.robot.heads.SonyHead;
import lesson5.robot.heads.ToshibaHead;
import lesson5.robot.legs.ILeg;
import lesson5.robot.legs.SamsungLegs;
import lesson5.robot.legs.SonyLegs;
import lesson5.robot.legs.ToshibaLegs;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IHead samsungHead = new SamsungHead(699);
        IHand samsungHand = new SamsungHand(399);
        ILeg samsungLegs = new SamsungLegs(499);

        IHead toshibaHead = new ToshibaHead(540);
        IHand toshibaHand = new ToshibaHand(390);
        ILeg toshibaLegs = new ToshibaLegs(380);

        IHead sonyHead = new SonyHead(750);
        IHand sonyHand = new SonyHand(450);
        ILeg sonyLegs = new SonyLegs(450);

        Robot robot1 = new Robot(sonyHead, samsungHand, toshibaLegs);
        Robot robot2 = new Robot(samsungHead, toshibaHand, sonyLegs);
        Robot robot3 = new Robot(toshibaHead, sonyHand, samsungLegs);

        System.out.println("robot 1 :");
        robot1.action();
        System.out.println("robot 2 :");
        robot2.action();
        System.out.println("robot 3 :");
        robot3.action();

        mostExpensive(robot1, robot2, robot3);

    }

    public static void mostExpensive(Robot robot1, Robot robot2, Robot robot3) {
        if (robot1.getPrice() == robot2.getPrice() || robot2.getPrice() == robot3.getPrice() || robot1.getPrice() == robot3.getPrice()) {
            System.out.println("есть роботы равные по стоимомти");
        } else if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("robot1 самый дорогой его сттоимость: " + robot1.getPrice() + " тугриков");
        } else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            System.out.println("robot2 самый дорогой его сттоимость: " + robot1.getPrice() + " тугриков");
        } else {
            System.out.println("robot3 самый дорогой его сттоимость: " + robot1.getPrice() + " тугриков");
        }
    }
}
