package lesson5.clothes.trousers;

public class AdidasTrousers implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Натянул штанцы Adidas");
    }

    @Override
    public void putOff() {
        System.out.println("Скинул партки Adidas");
    }
}
