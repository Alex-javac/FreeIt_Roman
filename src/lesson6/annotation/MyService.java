package lesson6.annotation;

//Класс MyService должен иметь переменные c private модификаторами,
// конструктор по умолчанию, get и set методы,
// переопределенные методы equals и hashcode,
// а так же private метод (private thisClassInfo),
// который будет просто печатать данные о самом классе (данные любые на ваш выбор),
// в котором он определен.

import java.util.Objects;

@Version(numbVersion = 1.1, nameVersion = "Clap-Clap")
public class MyService {

    private String products;
    private int price;
    private boolean availability;

    public MyService() {
    }

    private void thisClassInfo() {
        System.out.println("MyService{" +
                "products='" + products + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}');
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return price == myService.price && availability == myService.availability && products.equals(myService.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, price, availability);
    }

}
