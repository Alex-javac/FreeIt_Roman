package lesson5.clothes.jacket;

public class ReebokJacket implements Jacket {
    @Override
    public void putOn() {
        System.out.println("Накинул куртку Reebok");
    }

    @Override
    public void putOff() {
        System.out.println("Снял куртку Reebok");
    }
}
