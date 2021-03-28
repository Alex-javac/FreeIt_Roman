package lesson5.clothes.shoes;

public class NikeShoes implements Shoes{
    @Override
    public void putOn() {
        System.out.println("Обул кроссовки Nike");
    }

    @Override
    public void putOff() {
        System.out.println("Снял кроссовки Nike");
    }
}
