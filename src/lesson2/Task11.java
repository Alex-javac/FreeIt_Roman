package lesson2;

import java.util.Random;

//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.
public class Task11 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(200);
        // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
        // 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199
        if (proverka(num)) {
            System.out.println("Число "+num+" простое");
        }else {
            System.out.println("Число "+num+" не является простым");
        }
    }
    public static boolean proverka(int num){
        // проходим по циклу начиная от 2 и до самого числа
        // таким оброзом мы проверяем делится ли число на что-нибудь кроме 1 и себя
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
