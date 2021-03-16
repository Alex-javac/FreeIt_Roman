package lesson5.transport;

public class Civilian extends Air{
int passengers;
boolean businessClass;

    public Civilian(int enginePower, int maxSpeed, int weight, String brand, int wingspan, int minLandingStrip, int passengers, boolean businessClass) {
        super(enginePower, maxSpeed, weight, brand, wingspan, minLandingStrip);
        this.passengers = passengers;
        this.businessClass = businessClass;
    }
}
