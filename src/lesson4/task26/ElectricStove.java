package lesson4.task26;

public class ElectricStove extends Oven{
   private int kilowatts; //энергопотребление

    public void boil(){
        System.out.println("Кипячу воду");
    }

    public ElectricStove(String firm, String model, double price, int width, int height, int weight, boolean childProtection, int kilowatts) {
        super(firm, model, price, width, height, weight, childProtection);
        this.kilowatts = kilowatts;
    }

    public int getKilowatts() {
        return kilowatts;
    }
}
