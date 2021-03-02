package lesson2;

import java.util.Arrays;
import java.util.Random;

//Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
//таким образом:
//1 1 1 1 1
//0 1 1 1 0
//0 0 1 0 0
//0 1 1 1 0
//1 1 1 1 1
public class Task17 {
    public static void main(String[] args) {
        Random random=new Random();
        int n = random.nextInt(20);
        int[][] matrix=new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i <= j && j <= matrix.length-1-i)
                    matrix[i][j] = 1;
                else if (i >= j && j >= matrix.length-1-i)
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = 0;
            }
        }
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
