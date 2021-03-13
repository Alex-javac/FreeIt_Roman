package lesson4.task27;

import java.math.BigInteger;
import java.util.GregorianCalendar;

public class Visa extends DebitCard{
   private final char VALUTA ='$';

   public char getVALUTA() {
      return VALUTA;
   }

    public Visa(BigInteger numbCard, int cvv, String customerName, GregorianCalendar expiryDate, int found) {
        super(numbCard, cvv, customerName, expiryDate, found);
    }

    @Override
    public String toString() {
        return "Visa{" +
                "numbCard=" + numbCard +
                ", cvv=" + cvv +
                ", customerName='" + customerName + '\'' +
                ", found=" + found +
                ", VALUTA=" + VALUTA +
                '}';
    }
}
