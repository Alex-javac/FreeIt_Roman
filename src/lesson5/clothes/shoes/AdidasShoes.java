package lesson5.clothes.shoes;

public class AdidasShoes implements Shoes {
    @Override
    public void putOn() {
        System.out.println("Обул кроссовки Adidas");
    }

    @Override
    public void putOff() {
        System.out.println("Снял кроссовки Adidas");
    }
}
