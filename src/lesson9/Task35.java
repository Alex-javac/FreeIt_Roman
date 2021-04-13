package lesson9;

import java.io.*;
import java.util.Random;

//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
//распечатать числа и их среднее арифметическое.
public class Task35 {
    public static void main(String[] args) {
        Random random = new Random();

        File file = new File("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson9/Myfile.bin");

        try (FileOutputStream fos = new FileOutputStream(file);
             DataOutputStream dos = new DataOutputStream(fos);
             FileInputStream fis = new FileInputStream(file);
             DataInputStream dis = new DataInputStream(fis)
        ) {
            for (int i = 0; i < 20; i++) {
                int num = random.nextInt(20) + 1;
                System.out.print(num + "  ");
                dos.writeInt(num);
            }
            System.out.println();
            int sum = 0;
            while (dis.available() > 0) {
                int num = dis.readInt();
                sum += num;
                System.out.print(num + "  ");
            }
            System.out.println();
            double average = sum / 20;
            System.out.println("среднее арифметическое : " + average);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}