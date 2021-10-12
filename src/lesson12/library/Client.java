package lesson12.library;

import lesson12.library.lib.Book;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;


public class Client implements Runnable {
    Exchanger<Integer> exchangerID;
    Exchanger<Book> exchangerBook;
    List<Book> books = new LinkedList<>();
    Random random = new Random();
    Book book;
    private Semaphore sem;

    public Client(Semaphore sem, Exchanger<Integer> exchangerID, Exchanger<Book> exchangerBook) {
        this.sem = sem;
        this.exchangerID = exchangerID;
        this.exchangerBook = exchangerBook;
        new Thread(this).start();
    }

    @Override
    public void run() {
        boolean flag = true;
        int numBook;
        while (flag) {
            if (books.size() == 0) {
                try {
                    sem.acquire();
                    System.out.println("Здравствуйте я пришел взять книгу " + Thread.currentThread().getName());
                    for (int i = 0; i < random.nextInt(3) + 1; i++) {
                        numBook = random.nextInt(Book.getCounter()) + 1;
                        System.out.println("Мне нужна книга №" + numBook + " " + Thread.currentThread().getName());
                        numBook = exchangerID.exchange(numBook);
                        book = exchangerBook.exchange(book);
                        if (book != null) {
                            System.out.println("спасибо " + Thread.currentThread().getName());
                            books.add(book);
                        } else {
                            System.out.println("Как жаль прийду в другой раз " + Thread.currentThread().getName());
                        }
                    }
                    if (books.size() != 0) {
                        Librarian.counter++;
                    }
                    System.out.println("Я взял " + books.size() + " книг: " + Thread.currentThread().getName());
                    System.out.println(books + " " + Thread.currentThread().getName());
                    sem.release();
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    sem.acquire();
                    System.out.println("Здравствуйте я пришел вернуть книгу " + Thread.currentThread().getName());
                    for (Book kniga : books) {
                        numBook = -1;
                        numBook = exchangerID.exchange(numBook);
                        book = exchangerBook.exchange(kniga);
                    }
                    Librarian.counter++;
                    books.clear();
                    sem.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("У меня " + books.size() + " книг: " + Thread.currentThread().getName());
                System.out.println(books);
                flag = false;
            }
        }
    }
}