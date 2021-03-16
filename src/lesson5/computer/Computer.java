package lesson5.computer;

import java.util.Random;
import java.util.Scanner;
//Создать класс компьютер.
//Поля:
//- процессор
//- оперативка
//- жесткий диск
//- ресурс полных циклов работы (включений/выключений)
//
//Методы:
//- метод описание(вывод всех полей)
//- метод включить, при включении может произойти сбой,
// при вызове метода рандом загадывает число (0 либо 1),
// вы вводите число с клавиатуры, если угадали комп включается,
// если нет сгорает. Если комп сгорел,
// при попытке включить нужно выдать сообщение что ему конец
//- выключить (аналогично включению)
//- при превышении лимита ресурса комп сгорает
public class Computer {
    private String processor;
    private String ram;
    private String ssd;
    private int resource;
    String str;
    private boolean on = false;
    private boolean working = true;

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public Computer(String processor, String ram, String ssd, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
        this.resource = resource;
    }

    public String description() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", resource=" + resource +
                '}';
    }

    public void turnOn() {
        if (!working) {
            System.out.println("Его уже не спасти (〇_ｏ)");
            return;
        }

        if (!on) {
            System.out.println("Чтобы включить компьютер");
            System.out.println("Ввидите число (0 либо 1)");
            str = scanner.nextLine();
            switch (str) {
                case "0":
                case "1":
                    break;
                default:
                    System.out.println("С компьютером шутки плохи");
                    destruction();
            }

            int rand = random.nextInt(2);

            if (str.equals(Integer.toString(rand))) {
                System.out.println("Компьютер успешно включен");
                on = true;
            } else {
                destruction();
            }

        } else {
            System.out.println("Компьютер уже включен");
        }
    }

    public void turnOff() {
        if (!working) {
            System.out.println("Его уже не спасти (〇_ｏ)");
            return;
        }
        if (on) {
            System.out.println("Чтобы выключить компьютер");
            System.out.println("Ввидите число (0 либо 1) ");
            str = scanner.nextLine();
            switch (str) {
                case "0":
                case "1":
                    break;
                default:
                    System.out.println("С компьютером шутки плохи");
                    destruction();
            }
            int rand = random.nextInt(2);
            if (str.equals(Integer.toString(rand))) {
                resource--;
                if (resource == 0) {
                    System.out.println("Ресурс исчерпан");
                    destruction();
                } else {
                    System.out.println("Компьютер успешно выключен");
                    on = false;
                }
            } else {
                destruction();
            }
        } else {
            System.out.println("Компьютер уже выключен");
        }
    }

    private void destruction() {
        System.out.println("Компьютер сгорел!!!");
        System.out.println("(╥﹏╥)");
        processor = "Горит синим пламенем";
        ram = "Улетучилась в нибытие";
        ssd = "RIP";
        on = false;
        working = false;

    }

    public static void main(String[] args) {
        Computer comp = new Computer("core i7", "DDR 4 16gb", "Samsung 870 Evo 500GB", 20);

        System.out.println(comp.description());

        while (comp.working){
        comp.turnOn();
        comp.turnOff();
        }
        System.out.println(comp.description());
    }


}
