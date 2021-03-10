package lesson4.task27;

import java.util.GregorianCalendar;

public class CreditCard extends Card {
    private String customerName;
    private GregorianCalendar expiryDate;
    private int credit;
    private double interest;

   public CreditCard(){

   }

    public CreditCard(String customerName, GregorianCalendar expiryDate, double interest) {
        this.customerName = customerName;
        this.expiryDate = expiryDate;
        this.interest = interest;
    }

    public CreditCard(long numbCard, int cvv, String customerName, GregorianCalendar expiryDate, double interest) {
        super(numbCard, cvv);
        this.customerName = customerName;
        this.expiryDate = expiryDate;
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
