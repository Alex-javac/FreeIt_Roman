package lesson5.robot.hands;

public class ToshibaHand implements IHand {
    int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {

    }

    @Override
    public void upHand() {
        System.out.println("Heil Toshiba!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
