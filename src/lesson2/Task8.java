package lesson2;

import java.util.Random;

//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже.
public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        int rub = random.nextInt(1000);

        if(rub%100/10==1){
            System.out.println(rub+" рублей");
        }else if(rub%10==1){
            System.out.println(rub+" рубль");
        }else if (rub%10==2||rub%10==3||rub%10==4){
            System.out.println(rub+" рубля");
        }else{
            System.out.println(rub+" рублей");
        }
    }
}
