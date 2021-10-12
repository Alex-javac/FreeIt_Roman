package lesson9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
//распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
//распечатать.
public class Task34 {
    public static void main(String[] args) {
        File file = new File("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson9/textNum.doc");
        List<Integer> num = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String str = bufferedReader.readLine();
            while (str != null) {
                System.out.println(str);
                int value = Integer.parseInt(str.replaceAll("[^0-9]", ""));
                num.add(value);
                str = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(num);
        int sum = 0;
        for (Integer number : num) {
            sum += number;
        }
        System.out.println("Сумма чисел в тексте : " + sum);

        Set<Integer> setNum = new HashSet<>(num);
        System.out.println(setNum);
    }
}
