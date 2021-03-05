package lesson3;

import java.util.StringTokenizer;

//Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов.
public class Task20 {
    public static void main(String[] args) {
        String str = "Дарить себя - не значит продавать и рядом спать - не значит переспать.";
        StringTokenizer st = new StringTokenizer(str, " !?.:(),;-{}\"");
        StringBuilder stringBuilder = new StringBuilder("");
        System.out.println(str);
        StringBuilder result = new StringBuilder();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();//делим текст на слова(токены)
            char n = token.charAt(token.length() - 1);//узнаем последний символ строки по его номеру
            result.append(n);
            System.out.println(token + " ... " + n);
        }
        System.out.println(result);
    }

}

