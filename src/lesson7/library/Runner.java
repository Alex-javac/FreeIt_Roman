package lesson7.library;

import java.util.*;

//(обязательное): В main:
//• создаем объект библиотеки
//• создаем пару тройку книг и добавляем эти книги в библиотеку
//• получаем список книг из библиотеки, сортируем по полю title (по названию книги) и выводим в консоль.
//• удаляем одну книгу
//• получаем список книг из библиотеки, сортируем по порядку добавления (последние добавленные в начале) и выводим в консоль.
//• редактируем одну книгу
//• получаем список книг и выводим в консоль
//
//Если вы выполнили обязательную часть, можете переходить к более интересному пункту.
// Для работы с библиотекой используем не вызовы методов из main (все что до этого написали можно удалить:)))).
// Разрабатываем консольное меню для работы с библиотекой.
//
//В main создаем объект вашей консольной менюшки(приложения, Application).
// И вызываем метод старт. Библиотека должна работать по замкнутому циклы,
// до тех пор пока пользователь в меню не выберет выход.
// Естественно не забываем про обработку всевозможных ошибок.  Успехов!))
public class Runner {
    public static void main(String[] args) {
        Application application = new Application();
        application.start();
//        Library library = new Library();
//        Book book1 = new Book(Genre.FANTASY, "Властелин колец");
//        Book book2 = new Book(Genre.CLASSIC, "Мастер и Маргарита");
//        Book book3 = new Book(Genre.DETECTIVE, "Девушка с татуировкой дракона");
//        Book book4 = new Book(Genre.HISTORICAL, "Три мушкетера");
//        Book book5 = new Book(Genre.HORROR, "ДРАКУЛА");
//        Book book6 = new Book(Genre.ROMANCE, "Ромео и Джульетта");
//
//        library.addBook(book1);
//        library.addBook(book2);
//        library.addBook(book3);
//        library.addBook(book4);
//        library.addBook(book5);
//        library.addBook(book6);
//
//        //• получаем список книг из библиотеки, сортируем по полю title (по названию книги) и выводим в консоль.
//        Set<String> sortTitle = new TreeSet<>();
//        for (Map.Entry<Integer, Book> books : library.getAllBooks().entrySet()) {
//            sortTitle.add(books.getValue().getTitle());
//        }
//        System.out.println(sortTitle);
//
//        //удаляем одну книгу
//        library.removeBook(book6.getId());
//
//        //• получаем список книг из библиотеки, сортируем по порядку добавления (последние добавленные в начале) и выводим в консоль.
//        List<Book> listBook = new ArrayList<>();
//        for (Map.Entry<Integer, Book> books : library.getAllBooks().entrySet()) {
//            listBook.add(books.getValue());
//        }
//        Collections.reverse(listBook);
//        System.out.println(listBook);
//
//        //• редактируем одну книгу
//        library.editBook(book1);
//
//        //• получаем список книг и выводим в консоль
//        for (Map.Entry<Integer, Book> books : library.getAllBooks().entrySet()) {
//            System.out.println(books);
//        }
    }
}
