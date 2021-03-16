package lesson5.transport;

public abstract class Transport {
int enginePower;
int maxSpeed;
int weight;
String brand;

    public Transport(int enginePower, int maxSpeed, int weight, String brand) {
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }
}
