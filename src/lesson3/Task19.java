package lesson3;

import java.util.StringTokenizer;

//Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.
public class Task19 {
    public static void main(String[] args) {
        String str = "Java относится к JavaScript так же, как Сом к Сомали.";
        StringTokenizer st = new StringTokenizer(str, " !?.:(),;-{}\"");
        int count = 0;
        while (st.hasMoreTokens()) {
            count++;
            System.out.println(st.nextToken());
        }
        System.out.println("Кол-во слов в тексте = " + count);
    }
}
