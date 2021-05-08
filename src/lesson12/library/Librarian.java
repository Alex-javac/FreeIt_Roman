package lesson12.library;

import lesson12.library.lib.Book;
import lesson12.library.lib.Library;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;

public class Librarian implements Runnable {
    Map<Book, Client> debtors = new LinkedHashMap<>();
    Exchanger<Book> exchangerBook;
    Exchanger<Integer> exchangerID;
    Library library;
    private Semaphore sem;
    static int counter = 0;

    public Librarian(Semaphore sem, Exchanger<Integer> exchangerID, Exchanger<Book> exchangerBook, Library library) {
        this.sem = sem;
        this.exchangerID = exchangerID;
        this.exchangerBook = exchangerBook;
        this.library = library;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int numBook = 0;
        Book book = null;
        while (counter < 10) {
            try {
                System.out.println("!!!!!!!!!!!" + counter + "!!!!!!!!!!!!!!!");
                numBook = exchangerID.exchange(numBook);
                if (numBook == -1) {
                    System.out.println("Щас посмотрим что вы принесли");
                    book = exchangerBook.exchange(book);
                    library.returnBook(book);
                } else {
                    System.out.println("Так так так щас посмотрим что это за книга");
                    book = library.getBook(numBook);
                    if (library.giveOut(book)) {
                        System.out.println(book.getTitle() + " Хорошая книга");
                        book = exchangerBook.exchange(book);
                    } else {
                        System.out.println("Этой кнтги сейчас нет в библиотеке");
                        book = null;
                        book = exchangerBook.exchange(book);
                    }
                }
                numBook = 0;
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("!!!!!!!!!!!!!!!!Я закончил работу!!!!!!!!!!!!!!!!!!");
        sem.release();
    }
}