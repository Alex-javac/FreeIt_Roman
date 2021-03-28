package lesson4.task26;

public abstract class KitchenAppliances extends Appliances{
   private int width;
   private int height;
   private int weight;

    public KitchenAppliances(String firm, String model, double price, int width, int height, int weight) {
        super(firm, model, price);
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
