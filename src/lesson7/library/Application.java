package lesson7.library;

import java.util.Scanner;

//Алгоритм работы библиотеки:
//• Выберите действие:
//
//◦ Вывод всех книг. При выборе этого действия, было бы отлично спросить у пользователя в какой сортировке вывести:
//▪ по алфавиту (возрастание)
//▪ по алфавиту (убывание)
//▪ по добавлению(сначала новые, потом более старые)
//После выбора сортировки, из библиотки получаете список книг, сортируете их таким образом как выбрал пользователь и выводите в консоль.
//
//◦ Добавление книги. При выборе этого действия:
//▪ пользователь должен ввести из консоли 3 параметра (id, название, жанр).
//▪ создаем объект книги (поля заполняются данными введенными пользователем)
//▪ добавляем книгу в библиотеку (напоминаю, если в списке книг уже существует книга с таким id, то новая книга не добавляется)
//
//◦ Удаление книги. При выборе этого действия:
//▪ пользователь вводит id книги которую нужно удалить
//▪ удаляем книгу из магазина
//
//◦ Редактирование книги. При выборе этого действия:
//▪ пользователь должен ввести из консоли 3 параметра (id книги для редактирования, новое название, новую жанр).
//▪ создаем объект книги (поля заполняются данными введенными пользователем)
//▪ редактируем книгу в библиотеке
//
//◦ Выход. При выборе этого действия, работа библиотеки завершается.
public class Application {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие:");
        System.out.println("1) Вывод всех книг.");
        System.out.println("2) Добавление книги.");
        System.out.println("3) Удаление книги.");
        System.out.println("4) Редактирование книги.");
        System.out.println("5) Выход.");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("В какой сортировке вывести книги:");
                System.out.println("1) по алфавиту (возрастание)");
                System.out.println("2) по алфавиту (убывание)");
                System.out.println("3) по добавлению(сначала новые, потом более старые)");
                break;
            case 2:
                System.out.println("введите 3 параметра (id, название, жанр).");
                System.out.print("ID : ");
                int id = scanner.nextInt();
                System.out.print("Название : ");
                String name = scanner.nextLine();
                System.out.print("Жанр : ");
                String genre = scanner.nextLine();
                break;
            case 3:
                System.out.println("ввидите id книги которую нужно удалить");
                System.out.print("ID : ");
                int idDel = scanner.nextInt();
                break;
            case 4:
                System.out.print("ID : ");
                int idRedactor = scanner.nextInt();
                System.out.print("Название : ");
                String nameRedactor = scanner.nextLine();
                System.out.print("Жанр : ");
                String genreRedactor = scanner.nextLine();
                break;
            case 5:
                 return;

        }
    }
}
