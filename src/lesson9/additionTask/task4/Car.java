package lesson9.additionTask.task4;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;

    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed && price == car.price && brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, speed, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
