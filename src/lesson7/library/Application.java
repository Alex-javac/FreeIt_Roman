package lesson7.library;

import java.util.*;

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
    public static void start(Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие:");
        System.out.println("1) Вывод всех книг.");
        System.out.println("2) Добавление книги.");
        System.out.println("3) Удаление книги.");
        System.out.println("4) Редактирование книги.");
        System.out.println("5) Выход.");
        String num = scanner.nextLine();
        switch (num) {
            case "1":
                sortBooks(library);
                break;
            case "2":
                addBook(library);
                break;
            case "3":
                deleteBook(library);
                break;
            case "4":
                redactor(library);
                break;
            case "5":
                return;
            default:
                System.out.println("Введите цифру которая соответствует нужному вам действию!");
                start(library);
        }

    }

    private static void sortBooks(Library library) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("В какой сортировке вывести книги:");
            System.out.println("1) по алфавиту (возрастание)");
            System.out.println("2) по алфавиту (убывание)");
            System.out.println("3) по добавлению(сначала новые, потом более старые)");
            System.out.println("4) Вернуться в главное меню");
            String num = scanner.nextLine();
            List<String> title = new ArrayList<>();
            for (Map.Entry<Integer, Book> books : library.getAllBooks().entrySet()) {
                title.add(books.getValue().getTitle());
            }
            switch (num) {
                case "1":
                    Collections.sort(title);
                    System.out.println(title);
                    break;
                case "2":
                    Collections.sort(title);
                    Collections.reverse(title);
                    System.out.println(title);
                    break;
                case "3":
                    System.out.println(title);
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Введите цифру которая соответствует нужному вам действию!");
                    sortBooks(library);
            }
        } finally {
            start(library);
        }
    }

    private static void addBook(Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавление книги");
        if(yesNo()) {
            try {
                System.out.println("Введите 2 параметра (жанр, название).");
                System.out.print("Жанр : ");
                String genre = scanner.nextLine();
                System.out.print("Название : ");
                String name = scanner.nextLine();
                Book newBook = new Book(Genre.valueOf(genre.toUpperCase()), name);
                library.addBook(newBook);
                System.out.println("Книга успешно добавлена в библиотеку");
            } catch (IllegalArgumentException e) {
                System.out.println("Выбирите жанр из предложеных:");
                for (Genre genre : Genre.values()) {
                    System.out.print(genre + " ");
                }
                System.out.println();
                addBook(library);
            }
        }
        start(library);
    }

    private static void redactor(Library library) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ввидите id книги которую нужно отредактировать");
            System.out.print("ID : ");
            int idRedactor = scanner.nextInt();
            if (library.getAllBooks().containsKey(idRedactor)) {
                library.editBook(library, library.getAllBooks().get(idRedactor));
            } else {
                System.out.println("Книга с таким ID отсутствует в библиотеке");
            }
        } catch (InputMismatchException e) {
            System.out.println("ID состоит из цифр");
            System.out.println("Попробуйте еще раз");
            redactor(library);
        }
        start(library);
    }

    private static void deleteBook(Library library) {
        Scanner scanner = new Scanner(System.in);
        int idDel = 0;
        try {
            System.out.println("Ввидите id книги которую нужно удалить");
            System.out.print("ID : ");
            idDel = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ID состоит из цифр");
            System.out.println("Попробуйте еще раз");
            deleteBook(library);
        }
        if (library.getAllBooks().containsKey(idDel)) {
            Book book = library.getAllBooks().get(idDel);
                System.out.println("Вы хотите удалить эту книгу: " + book.getTitle() + " " + book.getGenre());
            if (yesNo()) {
                library.removeBook(idDel);
            }
        } else {
            System.out.println("Книга с таким ID отсутствует в библиотеке");
        }

        start(library);
    }

    private static boolean yesNo() {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите \"1\" чтобы продолжить");
        System.out.println("Нажмите \"2\" чтоб вернуться в главное меню");
        String num = scanner.nextLine();
        switch (num) {
            case "1":
                flag = true;
                break;
            case "2":
                flag = false;
                break;
            default:
                yesNo();
        }
        return flag;
    }
}