package lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//числа.
public class Task30 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
        System.out.println(list);

    }
}
