import java.util.Scanner;

public class Lesson1 {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввидите своё имя: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
