package lesson2;

import java.util.Random;

//Создать массив, заполнить его случайными элементами, распечатать,
//перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//еще один массив).
public class Task15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr =new int[10];
        for (int i = 0;i < arr.length;i++){
            arr[i]=random.nextInt(1000);
            System.out.print("["+arr[i]+"] ");
        }
        System.out.println();
for (int i = 0;i < arr.length/2;i++){
    int temp = arr[i];
   // System.out.print( arr[arr.length-1-i]);
    //System.out.println(" - "+arr[i]);
    arr[i]=arr[arr.length-1-i];
    arr[arr.length-1-i]=temp;
}
        for (int i = 0;i < arr.length;i++){
            System.out.print("["+arr[i]+"] ");
        }
    }
}
