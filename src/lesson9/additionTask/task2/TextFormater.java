package lesson9.additionTask.task2;

import java.util.StringTokenizer;

//Создаём класс TextFormater
//в котором два статических метода:
//1. Метод принимает строку и возвращает кол-во слов в строке.
//2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//есть возвращает true, если нет false
public class TextFormater {
    public static int countWords(String str) {
        int count = 0;
        StringTokenizer st = new StringTokenizer(str, " !?.:(),;-+={}\"\n");
        while (st.hasMoreTokens()) {
            count++;
            st.nextToken();
        }
        return count;
    }

    public static boolean isPalindrome(String str) {

        StringTokenizer st = new StringTokenizer(str, " !?.:(),;-+={}\"\n");
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            String revers = new StringBuilder(word).reverse().toString();
            if (word.equals(revers)) {
                return true;
            }
        }
        return false;
    }

}
