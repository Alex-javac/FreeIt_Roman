package lesson2;

import java.util.Random;

//Создайте число. Определите, является ли число трехзначным. Определите, является
//ли его последняя цифра семеркой. Определите, является ли число четным.
public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(555);
        System.out.print(num);

        if (numSize(num)) {
            System.out.println(" - это число трехзначное. ");
        } else {
            System.out.println(" - это число не трехзначное. ");
        }

        if (num % 10 == 7) {
            System.out.println("Последняя цифра 7");
        } else {
            System.out.println("Последняя цифра не является семеркой!");
        }

        if (num % 2 == 0) {
            System.out.println("Число четное.");
        } else {
            System.out.println("Число нечетное");
        }

    }

    public static boolean numSize(int num) {
        boolean res = false;
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        if (count == 3) {
            res = true;
        }
        return res;
    }
}
