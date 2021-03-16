package lesson2;

import java.util.Random;

//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
public class Task10 {
    public static void main(String[] args) {
        Random random = new Random();
        int from = random.nextInt(10);
        int to = random.nextInt(10) + from;
        System.out.println("Факториалы чисел в границах от " + from + " до " + to);
        for (int i = from; i <= to; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }
            System.out.println("Факториал числа " + i + " равен " + factorial);
        }

    }
}
