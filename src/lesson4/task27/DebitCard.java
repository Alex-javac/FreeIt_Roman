package lesson4.task27;

import java.math.BigInteger;
import java.util.GregorianCalendar;

public abstract class DebitCard extends Card {
    String customerName;
    GregorianCalendar expiryDate;
    int found;

    public DebitCard(BigInteger numbCard, int cvv, String customerName, GregorianCalendar expiryDate, int found) {
        super(numbCard, cvv);
        this.customerName = customerName;
        this.expiryDate = expiryDate;
        this.found = found;
    }

    public void addFunds(int i) {//////////пополнение счета
        System.out.println("Пополнение счета на сумму " + i);
        found += i;
    }

    public void debit(int i) { //////////////списание средств
        System.out.println("Списываю со счета " + i);
        found -= i;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public GregorianCalendar getExpiryDate() {
        return expiryDate;
    }


    public int getFound() {
        return found;
    }

}
