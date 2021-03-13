package lesson4.task27;

import java.math.BigInteger;

public abstract class Card {
     final BigInteger numbCard;
    final int cvv;

    public Card(BigInteger numbCard, int cvv) {
        this.numbCard = numbCard;
        this.cvv = cvv;
    }
}
