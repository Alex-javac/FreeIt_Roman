package lesson5.transport;

public abstract class Land extends Transport{
int wheels;
double fuelConsumption;

    public Land(int enginePower, int maxSpeed, int weight, String brand, int wheels, double fuelConsumption) {
        super(enginePower, maxSpeed, weight, brand);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }
}
