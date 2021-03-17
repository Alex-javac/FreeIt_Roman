package lesson5.clothes;

import lesson5.clothes.jacket.AdidasJacket;
import lesson5.clothes.jacket.Jacket;
import lesson5.clothes.jacket.NikeJacket;
import lesson5.clothes.jacket.ReebokJacket;
import lesson5.clothes.shoes.AdidasShoes;
import lesson5.clothes.shoes.NikeShoes;
import lesson5.clothes.shoes.ReebokShoes;
import lesson5.clothes.shoes.Shoes;
import lesson5.clothes.trousers.AdidasTrousers;
import lesson5.clothes.trousers.NikeTrousers;
import lesson5.clothes.trousers.ReebokTrousers;
import lesson5.clothes.trousers.Trousers;

public class Run {
    public static void main(String[] args) {
        Jacket adidasJacket = new AdidasJacket();
        Shoes adidasShoes = new AdidasShoes();
        Trousers adidasTrousers = new AdidasTrousers();

        Jacket nikeJacket = new NikeJacket();
        Shoes nikeShoes = new NikeShoes();
        Trousers nikeTrousers = new NikeTrousers();

        Jacket reebokJacket = new ReebokJacket();
        Shoes reebokShoes = new ReebokShoes();
        Trousers reebokTrousers = new ReebokTrousers();

        Human viktor = new Human("Витёк", adidasJacket, adidasShoes, adidasTrousers);
        Human vasya = new Human("Вася", reebokJacket, reebokShoes, reebokTrousers);
        Human pasha = new Human("Павлик", nikeJacket, nikeShoes, nikeTrousers);

        viktor.undress();
        viktor.dressed();

        vasya.undress();
        vasya.dressed();

        pasha.undress();
        pasha.dressed();
    }
}
