package lesson9.additionTask.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

//Проверка на цензуру:
//Создаете 2 файла.
//1 - й. Содержит исходный текст.
//2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
//определите сами, хотите каждое слово на новой строке, хотите через запятую
//разделяйте, ваша программа делайте как считаете нужным.
//Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
//встретилось ни одного недопустимого слова, то выводите сообщение о том что
//текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
//сообщение, кол-во предложений не прошедших проверку и сами предложения
//подлежащие исправлению.
public class Task3 {
    public static void main(String[] args) {
        List<String> ban = new ArrayList<>();
        File fileText = new File("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson9/additionTask/task3/text.txt");
        File fileBlackList = new File("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson9/additionTask/task3/blackList.txt");
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileText));
                BufferedReader bufReadBlackList = new BufferedReader(new FileReader(fileBlackList));
        ) {
            String[] banwords = bufReadBlackList.readLine().split(", ");
            List<String> blackList = Arrays.asList(banwords);

            String str = bufferedReader.readLine();
            while (str != null) {
                StringTokenizer st = new StringTokenizer(str, " !?.:(),;-+={}\"\n");
                while (st.hasMoreTokens()) {
                    String sentence = st.nextToken();
                    if (blackList.contains(sentence)) {
                        if (!ban.contains(str)) { //если в предложении больше одного запрещенного слова то его добавляем 1 раз
                            ban.add(str);
                        }
                    }
                }
                str = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (ban.size() != 0) {
            System.out.println("Текст не прошёл проверку на цензуру");
            System.out.println("В тексте " + ban.size()+ " предложений не прошедших проверку");
            for (int i = 0; i < ban.size(); i++) {
                System.out.println(i+1+ ") "+ban.get(i));
            }
        } else {
            System.out.println("Текст прошёл проверку на цензуру");
        }
    }
}
