package lesson2;

import java.util.Random;

//Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.
public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr =new int[random.nextInt(20)];
        for (int i = 0;i < arr.length;i++){
            arr[i]=random.nextInt(10);
            System.out.println("индекс "+i+" оценка "+arr[i]);
        }
        int min=arr[0];
        int indexMin=0;
        int max=arr[0];
        int indexMax=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                indexMax=i;
            }
            if(min>arr[i]){
                min=arr[i];
                indexMin=i;
            }
        }
        System.out.println("Максисальна оценка "+max+" ее индекс "+indexMax);
        System.out.println("Минимальная оценка "+min+" ее индекс "+indexMin);
    }
}
