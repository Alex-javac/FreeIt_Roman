package lesson2;

import java.util.Random;

//Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.
public class Task16 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
            System.out.print("[" + arr[i] + "] ");
        }
        System.out.println();
        int min = arr[0];
        int indexMin = 0;
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                indexMax = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                indexMin = i;
            }
        }
        System.out.println("max " + max);
        System.out.println("min " + min);
        int sum = 0;
        if (indexMax == indexMin) {
            sum = 0;
        } else if (indexMax > indexMin) {
            for (int i = indexMin + 1; i < indexMax; i++) {
                sum += arr[i];
            }
        } else {
            for (int i = indexMax + 1; i < indexMin; i++) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
