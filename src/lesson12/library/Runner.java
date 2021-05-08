package lesson12.library;


import lesson12.library.file.JaxbCreate;
import lesson12.library.file.ValidationChecker;
import lesson12.library.lib.Book;
import lesson12.library.lib.Library;


import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;

//Написать клиент для работы библиотеки.
//В библиотеке доступны к чтению несколько книг.
//Некоторые из них можно выдавать на руки некоторые - только в читальный зал.
//Посетители могут брать одновременно по несколько книг на руки и в читальный зал.
public class Runner {
    private static final Exchanger<Book> exchangerBook = new Exchanger<>();
    private static final Exchanger<Integer> exchangerID = new Exchanger<>();
    private static List<Path> paths = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Library library = new Library();
        File validator = new File("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson12/library/file/validator.xsd");
        Files.walkFileTree(Paths.get("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson12/library/file"), new MyFileVisitor());
        paths.forEach(file -> {
            if (ValidationChecker.validateXMLSchema(validator, file)) {
                Book book = JaxbCreate.bookUnmarshalling(file);
                library.addBook(book);
            }
        });
        System.out.println(library.getAllBooks());
        System.out.println(Book.getCounter());

        Semaphore sem = new Semaphore(2);
        Librarian librarian = new Librarian(sem, exchangerID, exchangerBook, library);
        for (int i = 0; i < 5; i++) {
            Client client = new Client(sem, exchangerID, exchangerBook);
        }
    }

    public static class MyFileVisitor extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
            if (path.toString().endsWith(".xml"))
                paths.add(path);
            return FileVisitResult.CONTINUE;
        }
    }
}