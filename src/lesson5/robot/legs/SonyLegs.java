package lesson5.robot.legs;

public class SonyLegs implements ILeg {
    int price;

    public SonyLegs(int price) {
        this.price = price;
    }

    public SonyLegs() {
    }

    @Override
    public void step() {
        System.out.println("Топ-топ топает Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
