package lesson4;

//Создать иерархию классов, описывающих бытовую технику. Создать несколько
//объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня.
public class Task26 {
    public class Appliances {
        String firm;
        String model;
        double price;

        public void turnOn() {
            System.out.println("Вкл.");
        }

        public void turnOff() {
            System.out.println("Выкл.");
        }

        public Appliances() {

        }

        public Appliances(String firm, String model, double price) {
            this.firm = firm;
            this.model = model;
            this.price = price;
        }
    }

    public class  KitchenAppliances extends Appliances {///////////кухонная техника
        int width;
        int height;
        int weight;

        public KitchenAppliances() {

        }

        public KitchenAppliances(int width, int height, int weight) {
            this.width = width;
            this.height = height;
            this.weight = weight;
        }

        public KitchenAppliances(String firm, String model, double price, int width, int height, int weight) {
            super(firm, model, price);
            this.width = width;
            this.height = height;
            this.weight = weight;
        }
    }

    public class Oven extends KitchenAppliances { ////////////////Печи
       boolean childProtection;/////защита от детей

        public Oven() {

        }
        public Oven(boolean childProtection) {
            this.childProtection = childProtection;
        }

        public Oven(int width, int height, int weight, boolean childProtection) {
            super(width, height, weight);
            this.childProtection = childProtection;
        }

        public Oven(String firm, String model, double price, int width, int height, int weight, boolean childProtection) {
            super(firm, model, price, width, height, weight);
            this.childProtection = childProtection;
        }
    }

    public class GasStove extends Oven {////////газ-плита

        public void burn(){
            System.out.println("Горит огонь");
        }

        public GasStove() {
        }

        public GasStove(boolean childProtection) {
            super(childProtection);
        }

        public GasStove(int width, int height, int weight, boolean childProtection) {
            super(width, height, weight, childProtection);
        }

        public GasStove(String firm, String model, double price, int width, int height, int weight, boolean childProtection) {
            super(firm, model, price, width, height, weight, childProtection);
        }
    }

    public class ElectricStove extends Oven {///////////электро-плита
        int kilowatts; //энергопотребление

        public void boil(){
            System.out.println("Кипячу воду");
        }

        public ElectricStove(int kilowatts) {
            this.kilowatts = kilowatts;
        }

        public ElectricStove(boolean childProtection, int kilowatts) {
            super(childProtection);
            this.kilowatts = kilowatts;
        }

        public ElectricStove(int width, int height, int weight, boolean childProtection, int kilowatts) {
            super(width, height, weight, childProtection);
            this.kilowatts = kilowatts;
        }

        public ElectricStove(String firm, String model, double price, int width, int height, int weight, boolean childProtection, int kilowatts) {
            super(firm, model, price, width, height, weight, childProtection);
            this.kilowatts = kilowatts;
        }
    }

    public  class MicrowaveOven extends Oven {///////микровалновка
        int kilowatts; //энергопотребление

        public void reheatFood(){
            System.out.println("Грею еду");
        }

        public MicrowaveOven(int kilowatts) {
            this.kilowatts = kilowatts;
        }

        public MicrowaveOven(boolean childProtection, int kilowatts) {
            super(childProtection);
            this.kilowatts = kilowatts;
        }

        public MicrowaveOven(int width, int height, int weight, boolean childProtection, int kilowatts) {
            super(width, height, weight, childProtection);
            this.kilowatts = kilowatts;
        }

        public MicrowaveOven(String firm, String model, double price, int width, int height, int weight, boolean childProtection, int kilowatts) {
            super(firm, model, price, width, height, weight, childProtection);
            this.kilowatts = kilowatts;
        }
    }

    public static void main(String[] args) {
        Task26 t26 =new Task26();
        MicrowaveOven micro = t26.new MicrowaveOven(1200);
        GasStove gas = t26.new GasStove();
        ElectricStove electric =t26.new ElectricStove(1500);

        micro.turnOn();
        gas.turnOn();
        electric.turnOn();

        micro.reheatFood();
        gas.burn();
        electric.boil();

        micro.turnOff();
        gas.turnOff();
        electric.turnOff();
    }
}
