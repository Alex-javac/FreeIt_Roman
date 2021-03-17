package lesson3;

import java.util.StringTokenizer;

//Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов.
public class Task20 {
    public static void main(String[] args) {
        String text = "Дарить себя - не значит продавать и рядом спать - не значит переспать.";
        StringTokenizer tokenizer = new StringTokenizer(text, " !?.:(),;-{}\"");
        System.out.println(text);
        StringBuilder result = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();//делим текст на слова(токены)
            char charAt = token.charAt(token.length() - 1);//узнаем последний символ строки по его номеру
            result.append(charAt);
            System.out.println(token + " ... " + charAt);
        }
        System.out.println(result);
    }

}

