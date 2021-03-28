package lesson5.clothes.jacket;

public class NikeJacket implements Jacket {
    @Override
    public void putOn() {
        System.out.println("Накинул куртку Nike");
    }

    @Override
    public void putOff() {
        System.out.println("Снял куртку Nike");
    }
}
