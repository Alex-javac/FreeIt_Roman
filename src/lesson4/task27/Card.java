package lesson4.task27;

import java.math.BigInteger;

public abstract class Card {
    private final BigInteger numbCard;
   private final int cvv;

    public Card(BigInteger numbCard, int cvv) {
        this.numbCard = numbCard;
        this.cvv = cvv;
    }

    public BigInteger getNumbCard() {
        return numbCard;
    }

    public int getCvv() {
        return cvv;
    }
}
