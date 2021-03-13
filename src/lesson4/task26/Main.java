package lesson4.task26;

public class Main {
    public static void main(String[] args) {
        MicrowaveOven micro = new MicrowaveOven("LG","power3000",300,
                450,300,10,true,1000);
        GasStove gas = new GasStove("Gefest","3200-06",428,
                500,850,39,false);
        ElectricStove electric = new ElectricStove("Bosh","PKN645F17R",1079,
                583,5,8,true,7000);

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
