package lesson2;

import java.util.Random;

//Создать последовательность случайных чисел, найти и вывести наибольшее из них.
public class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr =new int[10];
for (int i = 0;i < arr.length;i++){
arr[i]=random.nextInt(1000);
}
int max=arr[0];
for(int i=0;i<arr.length;i++){
    if(max<arr[i]){
        max=arr[i];
    }
}
        System.out.println(max);
    }
}
