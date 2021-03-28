package lesson4.task27;

import java.math.BigInteger;
import java.time.YearMonth;

public class MasterCard extends DebitCard{
    private Valuta VALUTA = Valuta.EUR;

    public Valuta getVALUTA() {
        return VALUTA;
    }

    public MasterCard(BigInteger numbCard, int cvv, String customerName, YearMonth expiryDate, int found) {
        super(numbCard, cvv, customerName, expiryDate, found);
    }
}
