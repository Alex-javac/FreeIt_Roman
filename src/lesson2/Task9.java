package lesson2;

//Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//произведение, т.е. факториал числа.
public class Task9 {
    public static void main(String[] args) {
        double averageFac = 0;
        double sumFac = 0;
        int n = 0;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            sumFac += fac(x);//изменил только эту строку
            n++;
            x = (int) (Math.random() * 20);
        }
        if (n != 0) {
            averageFac = sumFac / n;
        } else {
            averageFac = 0;
        }
        System.out.println("среднее фактариалов:" + averageFac);
    }

    public static int fac(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
