package lesson9.additionTask.task1;

import java.io.*;

//В исходном файле находятся слова, каждое слово на новой строке. После
//запуска программы должен создать файл, который будет содержать в себе
//только палиндромы
public class Task1 {
    public static void main(String[] args) {
        File file = new File("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson9/additionTask/task1/originalFile.txt");
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson9/additionTask/task1/newFile.txt"))
        ) {
            String str = bufferedReader.readLine();

            while (str != null) {
                String revers = new StringBuilder(str).reverse().toString();
                System.out.println(str + "   " + revers);
                if (str.equals(revers)) {
                    bufferedWriter.write(str + "\n");
                }
                str = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
