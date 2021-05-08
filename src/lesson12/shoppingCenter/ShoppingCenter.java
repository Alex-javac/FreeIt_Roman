package lesson12.shoppingCenter;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Написать клиент для работы обменника.
// Люди могут подходить к обменнику чтобы купить/продать доллары или ЕВРО.
// Количество долларов и ЕВРО в обменнике не должно превышать какого-то заранее заданного предела и не должно оказаться меньше нуля.
// Каждый человек так же не может купить или продать долларов или ЕВРО больше, чем какое-то определенное значение.
// В нашей программе, имитирующей торговый центр, работает несколько обменников.
// Одновременно в одном обменнике может находится только один человек.
// Человек может как покупать или продавать валюту так и делать обе эти операции одновременно (покупать доллары и продавать ЕВРО).
public class ShoppingCenter {

    public static void main(String[] args) {
        Random random = new Random();
        List<CurrencyExchanger> exchangers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            CurrencyExchanger currencyExchanger = new CurrencyExchanger(1000, 1000, 3000);
      exchangers.add(currencyExchanger);
        }
        System.out.println("В магазине "+exchangers.size()+" обменника");
        for (int i = 0; i < 100; i++) {

            Client client = new Client(random.nextInt(100)+20, random.nextInt(100)+20, random.nextInt(1000)+100,exchangers);
            Thread thread = new Thread(client);
            thread.setName("Client-" + i);
            thread.start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exchangers.forEach(System.out::println);
    }
}
