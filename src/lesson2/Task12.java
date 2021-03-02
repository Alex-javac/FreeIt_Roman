package lesson2;

import java.util.Random;

//Найдите сумму первых n целых чисел, которые делятся на 3.
public class Task12 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(100);
        int sum = 0;
        int count = 1;
        int index = 1;
        while (n != count) {
            if (index % 3 == 0) {
                sum += index;
                count++;
            }
            index++;
        }
        System.out.println("Сумма первых " + n + " целых чисел, которые делятся на 3 равна " + sum);
    }
}
