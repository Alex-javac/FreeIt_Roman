package lesson4.task26;

public class GasStove extends Oven{
    public void burn(){
        System.out.println("Горит огонь");
    }

    public GasStove(String firm, String model, double price, int width, int height, int weight, boolean childProtection) {
        super(firm, model, price, width, height, weight, childProtection);
    }
}
