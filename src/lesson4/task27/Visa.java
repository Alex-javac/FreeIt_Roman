package lesson4.task27;

import java.util.GregorianCalendar;

public class Visa extends DebitCard{
   private final char VALUTA ='$';

   public char getVALUTA() {
      return VALUTA;
   }

   public Visa() {
   }

   public Visa(String customerName, GregorianCalendar expiryDate, int found) {
      super(customerName, expiryDate, found);
   }

   public Visa(long numbCard, int cvv, String customerName, GregorianCalendar expiryDate, int found) {
      super(numbCard, cvv, customerName, expiryDate, found);
   }
}
