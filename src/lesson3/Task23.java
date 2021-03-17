package lesson3;

//Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//абзацев <p>.
public class Task23 {
    public static void main(String[] args) {
        String str = "<p id=”p1”> Всё покупается и продаётся, </p>\n" +
                "<p id=”p15”> И жизнь откровенно над нами смеётся. </p>\n" +
                "<div class='green-text'> Мы негодуем, мы возмущаемся, </div>\n" +
                "<p id=”main”> Но продаёмся и покупаемся. </p>\n" +
                "<div> Омар Хайям </div>";
        System.out.println(str);
       String result = str.replaceAll("</div>", "</p>");
       result = result.replaceAll("<p\\s.+?>|<div>|<div\\s.+?>", "<p>");
        System.out.println(result);
    }
}
