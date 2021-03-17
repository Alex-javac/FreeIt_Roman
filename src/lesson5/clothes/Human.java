package lesson5.clothes;

import lesson5.clothes.jacket.Jacket;
import lesson5.clothes.shoes.Shoes;
import lesson5.clothes.trousers.Trousers;

public class Human implements IHuman {
    private String name;
    private Jacket jacket;
    private Shoes shoes;
    private Trousers trousers;

    public Human() {

    }

    public Human(String name, Jacket jacket, Shoes shoes, Trousers trousers) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
    }

    @Override
    public void dressed() {
        System.out.println(name + " Одевайся беги, и не мёрзни!");
        jacket.putOn();
        trousers.putOn();
        shoes.putOn();
    }

    @Override
    public void undress() {
        System.out.println(name + " Раздевайся не стесняйся");
        jacket.putOff();
        shoes.putOff();
        trousers.putOff();
    }
}
