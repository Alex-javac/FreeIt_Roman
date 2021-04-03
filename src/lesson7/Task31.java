package lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.
public class Task31 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(11));
        }
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        int maxValue = 0;
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (maxValue < value) {
                maxValue = value;
            }
        }
        System.out.println("Самая высокая оценка: " + maxValue);
    }
}
