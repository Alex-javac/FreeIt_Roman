package lesson5.transport;

public class Truck extends Land{
    int carrying;

    public Truck(int enginePower, int maxSpeed, int weight, String brand, int wheels, double fuelConsumption, int carrying) {
        super(enginePower, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.carrying = carrying;
    }
}
