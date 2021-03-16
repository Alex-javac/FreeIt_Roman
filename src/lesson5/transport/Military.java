package lesson5.transport;

public class Military extends Air{
boolean catapult;
int rockets;

    public Military(int enginePower, int maxSpeed, int weight, String brand, int wingspan, int minLandingStrip, boolean catapult, int rockets) {
        super(enginePower, maxSpeed, weight, brand, wingspan, minLandingStrip);
        this.catapult = catapult;
        this.rockets = rockets;
    }
}
