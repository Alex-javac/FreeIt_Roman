package lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Удалить неудовлетворительные оценки из списка.
public class Task29 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        //добавляем в список 10 случайных оценок от 0 до 10
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(11));
        }
        System.out.println(list);
        //удалим неудовлетворительные оценки (0,1,2,3)
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
