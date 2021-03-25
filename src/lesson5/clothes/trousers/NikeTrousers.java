package lesson5.clothes.trousers;

public class NikeTrousers implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Натянул штанцы Nike");
    }

    @Override
    public void putOff() {
        System.out.println("Скинул партки Nike");
    }
}
