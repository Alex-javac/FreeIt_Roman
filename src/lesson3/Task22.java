package lesson3;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//записаных по правилам Java, с помощью регулярных выражений и вывести их на
//страницу.
public class Task22 {
    public static void main(String[] args) {
        String str = "Привет 0xA29F это просто 0x7FFF текст 0x5A3 для проверки 0x7AAF";
        Pattern hexes = Pattern.compile("0x[A-Fa-f0-9]{1,4}");//"0x\\p{XDigit}+"
        Matcher hexMatcher = hexes.matcher(str);
        System.out.println(str);
        while (hexMatcher.find()){
            System.out.println(hexMatcher.group());
        }
    }
}
