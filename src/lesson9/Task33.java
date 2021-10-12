package lesson9;

import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
//препинания и слов.
public class Task33 {
    public static void main(String[] args) {
        File file = null;
        try {
            file = new File("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson9", "newFile.txt");
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String str = bufferedReader.readLine();
            while (str != null) {
                System.out.println(str);
                stringBuilder.append(str);
                stringBuilder.append("\n");
                str = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        punCount(stringBuilder.toString());
        wordCount(stringBuilder.toString());
    }

    public static void wordCount(String str) {
        StringTokenizer st = new StringTokenizer(str, " !?.:(),;-{}\"\n");
        int count = 0;
        while (st.hasMoreTokens()) {
            count++;
            System.out.println(count + " : " + st.nextToken());
        }
        System.out.println("Кол-во слов в тексте = " + count);
    }

    public static void punCount(String str) {
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count + " знаков препинания.");
    }
}

