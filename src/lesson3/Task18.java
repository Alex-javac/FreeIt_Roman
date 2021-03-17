package lesson3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество.
public class Task18 {
    public static void main(String[] args) {
        String str = "точка. восклицательный знак! вопросительный знак? многоточие... запятая, точка с запятой; двоеточие: тире- скобки() и кавычки\"\"";
        System.out.println(str);
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count + " знаков препинания.");
    }
}
