package lesson4.task27;

import java.util.GregorianCalendar;

public class VisaGold extends Visa{
   String support;//////служба поддержки 24/7

    public VisaGold(){

    }

    public VisaGold(String support) {
        this.support = support;
    }

    public VisaGold(String customerName, GregorianCalendar expiryDate, int found, String support) {
        super(customerName, expiryDate, found);
        this.support = support;
    }

    public VisaGold(long numbCard, int cvv, String customerName, GregorianCalendar expiryDate, int found, String support) {
        super(numbCard, cvv, customerName, expiryDate, found);
        this.support = support;
    }
}
