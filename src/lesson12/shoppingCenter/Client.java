package lesson12.shoppingCenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Client implements Runnable {
    Random random = new Random();
    private double usd;
    private double eur;
    private double byn;
    private boolean flag = true;
    List<CurrencyExchanger> exchangers;

    public Client(double usd, double eur, double byn, List<CurrencyExchanger> exchangers) {
        this.usd = usd;
        this.eur = eur;
        this.byn = byn;
        this.exchangers = exchangers;
    }

    List<String> list = new ArrayList<>(Arrays.asList("buyUSD", "sellUSD", "buyEUR", "sellEUR"));

    @Override
    public void run() {
        while (flag) {
            for (CurrencyExchanger exchanger : exchangers) {
                if (exchanger.isReady()) {
                    exchanger.setReady(false);
                    activeThread(exchanger);
                    flag = false;
                    exchanger.setReady(true);
                    break;
                }
                System.out.println("Ищу свободный обменник " + Thread.currentThread().getName());
            }
        }
        System.out.println(this.toString());
    }


    private void activeThread(CurrencyExchanger exchanger) {
        int cash;
        for (int i = 0; i < random.nextInt(2) + 1; i++) {
            System.out.println(Thread.currentThread().getName());

            switch (list.get(random.nextInt(4))) {
                case "buyUSD":
                    cash = random.nextInt(50) + 10;
                    if(usd==0){
                        break;
                    }
                    if (cash < this.usd) {
                        System.out.println(Thread.currentThread().getName() +
                                " сдаю USD " + cash + " " + exchanger.buyUSD(cash, this));
                    } else {
                        System.out.println(Thread.currentThread().getName() +
                                " сдаю USD " + usd + " " + exchanger.buyUSD(usd, this));
                    }
                    break;
                case "sellUSD":
                    cash = random.nextInt(500) + 100;
                    if(byn==0){
                        break;
                    }
                    if (cash < this.byn) {
                        System.out.println(Thread.currentThread().getName() +
                                " покупаю USD на сумму " + cash +  " бел. руб. " + exchanger.sellUSD(cash, this));
                    }else {
                        System.out.println(Thread.currentThread().getName() +
                                " покупаю USD на сумму " + byn + " бел. руб" + exchanger.sellUSD(byn, this));
                    }
                    break;
                case "buyEUR":
                    cash = random.nextInt(50) + 10;
                    if(eur==0){
                        break;
                    }
                    if (cash < this.eur) {
                        System.out.println(Thread.currentThread().getName() +
                                " сдаю EUR " + cash + " " + exchanger.buyEUR(cash, this));
                    }else {
                        System.out.println(Thread.currentThread().getName() +
                                " сдаю EUR " + eur + " " + exchanger.buyEUR(eur, this));
                    }
                    break;
                case "sellEUR":
                    cash = random.nextInt(500) + 100;
                    if(byn==0){
                        break;
                    }
                    if (cash < this.byn) {
                        System.out.println(Thread.currentThread().getName() +
                                " покупаю EUR на сумму " + cash +  " бел. руб. " + exchanger.sellEUR(cash, this));
                    }else {
                        System.out.println(Thread.currentThread().getName() +
                                " покупаю EUR на сумму " + byn + " бел. руб" + exchanger.sellEUR(byn, this));
                    }
                    break;
            }

            System.out.println("Наличные в банке " + exchanger.toString());
        }
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getEur() {
        return eur;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }

    public double getByn() {
        return byn;
    }

    public void setByn(double byn) {
        this.byn = byn;
    }

    @Override
    public String toString() {
        return "Client{" +
                "usd=" + usd +
                ", eur=" + eur +
                ", byn=" + byn +
                '}';
    }
}
