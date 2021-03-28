package lesson5.clothes.jacket;

public class AdidasJacket implements Jacket {
    @Override
    public void putOn() {
        System.out.println("Накинул куртку Adidas");
    }

    @Override
    public void putOff() {
        System.out.println("Снял куртку Adidas");
    }
}
