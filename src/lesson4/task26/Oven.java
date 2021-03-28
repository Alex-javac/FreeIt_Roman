package lesson4.task26;

public abstract class Oven extends KitchenAppliances{
   private boolean childProtection;

    public Oven(String firm, String model, double price, int width, int height, int weight, boolean childProtection) {
        super(firm, model, price, width, height, weight);
        this.childProtection = childProtection;
    }

    public boolean isChildProtection() {
        return childProtection;
    }
}
