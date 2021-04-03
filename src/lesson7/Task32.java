package lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//Имеется текст. Следует составить для него частотный словарь.
public class Task32 {
    public static void main(String[] args) {
        String text = "Бывает так, что смысл текста не имеет большого значения, а важен только его объем или структура: \n" +
                "\"Идейные соображения высшего порядка, а также консультация с широким активом требуют от нас анализа новых предложений. \n" +
                "С другой стороны дальнейшее развитие различных форм деятельности представляет собой интересный эксперимент проверки соответствующий условий активизации. \n" +
                "Повседневная практика показывает, что рамки и место обучения кадров в значительной степени обуславливает создание новых предложений. \n" +
                "Значимость этих проблем настолько очевидна, что постоянный количественный рост и сфера нашей активности играет важную роль в формировании систем массового участия.\"";
        System.out.println(text);
        List<String> list = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(text, " !?.:(),;-{}\"\n");
        while (tokenizer.hasMoreTokens()) {
            list.add(tokenizer.nextToken());
        }
        for (String str : list) {
            System.out.println(str);
        }

    }
}
