package lesson5.clothes.trousers;

public class ReebokTrousers implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Натянул штанцы Reebok");
    }

    @Override
    public void putOff() {
        System.out.println("Скинул партки Reebok");
    }
}
