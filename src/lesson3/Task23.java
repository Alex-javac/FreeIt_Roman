package lesson3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//абзацев <p>.
public class Task23 {
    public static void main(String[] args) {
String str = "<p id=”p1”> Всё покупается и продаётся, </p>\n" +
        "<p id=”p1”> И жизнь откровенно над нами смеётся. </p>\n" +
        "<p id=”p2”> Мы негодуем, мы возмущаемся, </p>\n" +
        "<p id=”p3”> Но продаёмся и покупаемся. </p>\n" +
        "<div> Омар Хайям </div>";
        System.out.println(str);
        System.out.println(str.replaceAll("<p\\s.+?>|<.p>|<div>|<.div>", "<p>"));
    }
}
