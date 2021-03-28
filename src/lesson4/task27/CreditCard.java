package lesson4.task27;

import java.math.BigInteger;
import java.time.YearMonth;
import java.util.GregorianCalendar;

public abstract class CreditCard extends Card {
   private String customerName;
    private YearMonth expiryDate;
   private int credit;
   private double interest;

    public CreditCard(BigInteger numbCard, int cvv, String customerName, YearMonth expiryDate, int credit, double interest) {
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

    public String getCustomerName() {
        return customerName;
    }

    public YearMonth getExpiryDate() {
        return expiryDate;
    }

    public int getCredit() {
        return credit;
    }

    public double getInterest() {
        return interest;
    }
}
