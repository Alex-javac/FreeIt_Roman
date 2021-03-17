package lesson5.clothes.shoes;

public class ReebokShoes implements Shoes{
    @Override
    public void putOn() {
        System.out.println("Обул кроссовки Reebok");
    }

    @Override
    public void putOff() {
        System.out.println("Снял кроссовки Reebok");
    }
}
