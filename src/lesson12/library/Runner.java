package lesson12.library;

import lesson12.library.lib.Book;
import lesson12.library.lib.Genre;
import lesson12.library.lib.Library;

import java.util.concurrent.Exchanger;

//Написать клиент для работы библиотеки.
//В библиотеке доступны к чтению несколько книг.
//Некоторые из них можно выдавать на руки некоторые - только в читальный зал.
//Посетители могут брать одновременно по несколько книг на руки и в читальный зал.
public class Runner {
    private static Exchanger<String> exchanger = new Exchanger<>();
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book(Genre.FANTASY, "Властелин колец");
        Book book2 = new Book(Genre.CLASSIC, "Мастер и Маргарита");
        Book book3 = new Book(Genre.DETECTIVE, "Девушка с татуировкой дракона");
        Book book4 = new Book(Genre.HISTORICAL, "Три мушкетера");
        Book book5 = new Book(Genre.HORROR, "ДРАКУЛА");
        Book book6 = new Book(Genre.ROMANCE, "Ромео и Джульетта");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);



    }
}