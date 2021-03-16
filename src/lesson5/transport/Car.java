package lesson5.transport;

public class Car extends Land{
String bodyType;
int passengers;

    public Car(int enginePower, int maxSpeed, int weight, String brand, int wheels, double fuelConsumption, String bodyType, int passengers) {
        super(enginePower, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.bodyType = bodyType;
        this.passengers = passengers;
    }
}
