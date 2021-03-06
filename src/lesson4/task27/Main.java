package lesson4.task27;

import lesson4.Task25;

import java.math.BigInteger;
import java.time.Month;
import java.time.YearMonth;


//Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня.
public class Main {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2025, Month.JANUARY);
        Visa cardVisa = new Visa(BigInteger.valueOf(1234123232),321,"Alexander",yearMonth,1000);
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
