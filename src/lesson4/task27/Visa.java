package lesson4.task27;

import java.math.BigInteger;
import java.time.YearMonth;

public class Visa extends DebitCard{
   private Valuta VALUTA = Valuta.USD;

   public Valuta getVALUTA() {
      return VALUTA;
   }

    public Visa(BigInteger numbCard, int cvv, String customerName, YearMonth expiryDate, int found) {
        super(numbCard, cvv, customerName, expiryDate, found);
    }

    @Override
    public String toString() {
        return "Visa{" +
                "numbCard=" + getNumbCard()+
                ", cvv=" + getCvv() +
                ", customerName='" + getCustomerName() + '\'' +
                ", found=" + getFound() +
                ", VALUTA=" + VALUTA +
                '}';
    }
}
