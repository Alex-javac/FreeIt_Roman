package lesson9.additionTask.task2;

import java.io.*;
import java.util.StringTokenizer;

//Текстовый файл содержит текст. После запуска программы в другой файл
//должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
//предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//слов в предложении, оно попадает в новый файл.
//
//Пишем все в ООП стиле. Создаём класс TextFormater
//в котором два статических метода:
//1. Метод принимает строку и возвращает кол-во слов в строке.
//2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//есть возвращает true, если нет false
//
//В main считываем файл.
//Разбиваем текст на предложения. Используя методы класса TextFormater
//определяем подходит ли нам предложение. Если подходит добавляем его в
//новый файл
public class Task2 {
    public static void main(String[] args) {
        File file = new File("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson9/additionTask/task2/text.txt");
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson9/additionTask/task2/newText.txt"))
        ) {
            String str = bufferedReader.readLine();

            while (str != null) {
                StringTokenizer st = new StringTokenizer(str, "!?.:;«»\"");

                while (st.hasMoreTokens()) {
                    String sentence = st.nextToken();
                    int countWords = TextFormater.countWords(sentence);

                    if (TextFormater.isPalindrome(sentence)) {
                        bufferedWriter.write(sentence + "\n");
                    } else if (countWords <= 5 && countWords >= 3) {
                        bufferedWriter.write(sentence + "\n");
                    }
                }
                str = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
