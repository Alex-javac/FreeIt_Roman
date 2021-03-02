package lesson2;

import java.util.Random;

//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//полностью закрыть круглой картонкой радиусом r.
public class Task7 {
    public static void main(String[] args) {

        Random random = new Random();
        int radius = random.nextInt(10);
        int sideA = random.nextInt(10);
        int sideB = random.nextInt(10);

        //диагональ прямоугольника является диаметром описанной окружности(теорема Пифагора)
        // R=корень(a2+b2)/2
        double result = (Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)) / 2);

        System.out.println("радиус описанной окружности прямоугольника равен " + result);
        if (radius >= result) {
            System.out.print("прямоугольное отверстие размерами " + sideA + " и " + sideB);
            System.out.println(" можно полностью закрыть круглой картонкой радиусом " + radius);
        } else {
            System.out.print("прямоугольное отверстие размерами" + sideA + " и " + sideB);
            System.out.println(" нельзя полностью закрыть круглой картонкой радиусом " + radius);
        }


    }

}
