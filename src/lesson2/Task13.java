package lesson2;

import java.util.Random;

//Создать последовательность случайных чисел, найти и вывести наибольшее из них.
public class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
            System.out.print("[" + arr[i] + "] ");
        }
        System.out.println();
        int max = arr[0];
        for (int i: arr) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Наибольшее число = "+max);
    }
}
