package lesson12.shoppingCenter;

public class CurrencyExchanger {

    private volatile double usd;
    private volatile double eur;
    private volatile double byn;

    private volatile boolean isReady = true;

    final static double BUY_USD = 2.5590;
    final static double SELL_USD = 2.5680;
    final static double BUY_EUR = 3.0910;
    final static double SELL_EUR = 3.1030;

    public CurrencyExchanger(double usd, double eur, double byn) {
        this.usd = usd;
        this.eur = eur;
        this.byn = byn;
    }


    public synchronized boolean buyUSD(double usd, Client client) {
        double sum = usd * BUY_USD;
        if (sum < this.byn) {
            client.setUsd(client.getUsd() - usd);
            this.usd += usd;
            client.setByn(client.getByn() + sum);
            this.byn -= sum;
            return true;
        } else {
            return false;
        }
    }

    public synchronized boolean sellUSD(double byn, Client client) {
        double sum = byn / SELL_USD;
        if (sum < usd) {
            client.setByn(client.getByn() - byn);
            this.byn += byn;
            client.setUsd(client.getUsd() + sum);
            this.usd -= sum;
            return true;
        } else {
            return false;
        }
    }

    public synchronized boolean buyEUR(double eur, Client client) {
        double sum = eur * BUY_EUR;
        if (sum < byn) {
            client.setEur(client.getEur() - eur);
            this.eur += eur;
            client.setByn(client.getByn() + sum);
            this.byn -= sum;
            return true;
        } else {
            return false;
        }
    }

    public synchronized boolean sellEUR(double byn, Client client) {
        double sum = byn / SELL_EUR;
        if (sum < eur) {
            client.setByn(client.getByn() - byn);
            this.byn += byn;
            client.setEur(client.getEur() + sum);
            this.eur -= sum;
            return true;
        } else {
            return false;
        }
    }

    public synchronized boolean isReady() {
        return isReady;
    }

    public synchronized void setReady(boolean ready) {
        isReady = ready;
    }

    @Override
    public String toString() {
        return "CurrencyExchanger{" +
                "usd=" + usd +
                ", eur=" + eur +
                ", byn=" + byn +
                '}';
    }
}
