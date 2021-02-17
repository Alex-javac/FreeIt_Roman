import java.util.Scanner;

public class Lesson1 {

    public static void main (String[] arg){
        whatIsYourName();
        time(4500);
        reversNum(1234);
        System.out.println("Верно ли, что все цифры числа различны : "+differentNum(123456788));
    }
    //Изменить данный пример так, что бы при запуске программы ваша программа
    //выводила следующее: “Hello, <Ваше имя>!”.
    public static void whatIsYourName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите своё имя: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
    }
    //Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
    //А) минут + секунд,
    //В) часов + минут + секунд,
    //С) дней + часов + минут + секунд,
    //D) недель + дней + часов + минут + секунд.
    //по аналогии с примером выше.
    public static void time(int sec){
        int s = sec%60;
        int min = (sec-s)/60;
        System.out.println(min+" минут "+s+" секунд");
        int m = min%60;
        int hours = (min-m)/60;
        System.out.println(hours+" часов "+m+" минут "+s+" секунд");
        int h = hours%24;
        int days = (hours-h)/24;
        System.out.println(days+" дней "+h+" часов "+m+" минут "+s+" секунд");
        int d = days%7;
        int weeks = (days-d)/7;
        System.out.println(weeks+" недель "+d+" дней "+h+" часов "+m+" минут "+s+" секунд");
    }
    //Определить число, полученное выписыванием в обратном порядке цифр
    //любого 4-х значного натурального числа n.
    public static void reversNum(int num){
        String str = String.valueOf(num);
        // System.out.println(new StringBuilder(str).reverse().toString());
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        System.out.println(num);
        System.out.println(result);
    }
    //Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
    //различны?
    public static boolean differentNum(int num){
        boolean res = true;
        int i;
        int index=0;
        int copyNum =num;
        int count = (copyNum == 0) ? 1 : 0;//узнаем длиину числа
        while (copyNum != 0) {
            count++;
            copyNum /= 10;
        }
        int[] array =new int[count];//массив для хранения цифр

        while (num != 0) {
            i = num % 10;
            array[index] = i;
            num /= 10;
            index++;
        }
        for (int x=0;x< array.length;x++) {//сравниваем цифры путем перебора с двух сторон
            for (int j=array.length-1;j>x;j--){
                System.out.println("сравнение "+array[x]+"=="+array[j]);
                if(array[x]==array[j]){
                    res=false;
                    return res;
                }
            }
        }
        return res;
    }
}
