package lesson5.robot.hands;

public class SonyHand implements IHand {
    int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {

    }

    @Override
    public void upHand() {
        System.out.println("Heil Sony!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
