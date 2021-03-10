package lesson4.task27;

import java.util.GregorianCalendar;

public class VisaPlatinum extends VisaGold {
    int discount;//скидка у партнеров

    public VisaPlatinum() {

    }

    public VisaPlatinum(int discount) {
        this.discount = discount;
    }

    public VisaPlatinum(String support, int discount) {
        super(support);
        this.discount = discount;
    }

    public VisaPlatinum(String customerName, GregorianCalendar expiryDate, int found, String support, int discount) {
        super(customerName, expiryDate, found, support);
        this.discount = discount;
    }

    public VisaPlatinum(long numbCard, int cvv, String customerName, GregorianCalendar expiryDate, int found, String support, int discount) {
        super(numbCard, cvv, customerName, expiryDate, found, support);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "VisaPlatinum{" +
                "numbCard=" + numbCard +
                ", cvv=" + cvv +
                ", customerName='" + customerName + '\'' +
                ", found=" + found +
                '}';
    }
}
