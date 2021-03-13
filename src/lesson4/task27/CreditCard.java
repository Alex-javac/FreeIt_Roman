package lesson4.task27;

import java.math.BigInteger;
import java.util.GregorianCalendar;

public abstract class CreditCard extends Card {
    String customerName;
    GregorianCalendar expiryDate;
    int credit;
    double interest;

    public CreditCard(BigInteger numbCard, int cvv, String customerName, GregorianCalendar expiryDate, int credit, double interest) {
        super(numbCard, cvv);
        this.customerName = customerName;
        this.expiryDate = expiryDate;
        this.credit = credit;
        this.interest = interest;
    }

    public void addFunds(int i) {//без учета процентной ставки
        System.out.println("Погасить кредит на сумму " + i);
        credit -= i;
    }

    public void debit(int i) { //////////////списание средств
        System.out.println("Кредит на сумму " + i);
        credit += i;
    }

}
