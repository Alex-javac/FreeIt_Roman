package lesson4.task26;

public abstract class Appliances {
   private String firm;
   private String model;
   private double price;

    public void turnOn() {
        System.out.println("Вкл.");
    }

    public void turnOff() {
        System.out.println("Выкл.");
    }

    public Appliances(String firm, String model, double price) {
        this.firm = firm;
        this.model = model;
        this.price = price;
    }

    public String getFirm() {
        return firm;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
