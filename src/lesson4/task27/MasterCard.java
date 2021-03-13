package lesson4.task27;

import java.math.BigInteger;
import java.util.GregorianCalendar;

public class MasterCard extends DebitCard{
    private final char VALUTA ='€';

    public char getVALUTA() {
        return VALUTA;
    }

    public MasterCard(BigInteger numbCard, int cvv, String customerName, GregorianCalendar expiryDate, int found) {
        super(numbCard, cvv, customerName, expiryDate, found);
    }
}
