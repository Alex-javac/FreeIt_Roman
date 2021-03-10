package lesson4.task27;

import lesson4.Task25;

import java.util.GregorianCalendar;

//Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня.
public class Main {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar(2025, 01, 25);
        VisaPlatinum platinum = new VisaPlatinum(1234_3214, 154, "Alexander", c, 1000, "+375(29)2929292", 10);
        System.out.println(platinum.toString());
        platinum.addFunds(120);
        platinum.debit(20);
        System.out.println(platinum.getVALUTA());
        System.out.println(platinum.toString());
        Task25 bankomat = new Task25(10, 10, 10);
        if (bankomat.withdraw(200)) {
            platinum.debit(200);
        }
        System.out.println(platinum.toString());
    }
}
