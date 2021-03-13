package lesson4.task27;

import lesson4.Task25;

import java.math.BigInteger;
import java.util.GregorianCalendar;

//Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня.
public class Main {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar(2025, 01, 25);
        Visa cardVisa = new Visa(BigInteger.valueOf(1234123232),321,"Alexander",c,1000);
        System.out.println(cardVisa.toString());
        cardVisa.addFunds(120);
        cardVisa.debit(20);
        System.out.println(cardVisa.getVALUTA());
        System.out.println(cardVisa.toString());
        Task25 cashMachine = new Task25(10, 10, 10);
        if (cashMachine.withdraw(200)) {
            cardVisa.debit(200);
        }
        System.out.println(cardVisa.toString());
    }
}
