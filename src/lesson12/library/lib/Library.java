package lesson12.library.lib;

import java.util.*;

public class Library {
    private Map<Integer, Book> listBooks = new LinkedHashMap<>();
    private List<Book> outOfLibrary = new LinkedList<>();
    private List<Book> inReadingRoom = new LinkedList<>();

    public void addBook(Book book) {
        if (listBooks.containsKey(book.getId())) {
            System.out.println("Книга с таким ID уже есть в библиотеке");
        } else {
            listBooks.put(book.getId(), book);
            book.setBookCondition(BookCondition.IN_LIBRARY);
            book.setCanTakeBook(new Random().nextBoolean());
        }
    }

    public void giveOut(Book book) {
        BookCondition condition = book.getBookCondition();
        switch (condition) {
            case IN_LIBRARY:
                if (book.isCanTakeBook()) {
                    System.out.println("Возьмите книгу");
                    listBooks.remove(book.getId());
                    book.setBookCondition(BookCondition.HANDED_OUT);
                    outOfLibrary.add(book);
                } else {
                    System.out.println("Эта книга только для читального зала");
                    listBooks.remove(book.getId());
                    book.setBookCondition(BookCondition.READING_ROOM);
                    inReadingRoom.add(book);
                }
                break;
            case READING_ROOM:
                System.out.println("Книга в читальном зале");
                break;
            case HANDED_OUT:
                System.out.println("Книгу выдали на руки");
                break;
            default:
                System.out.println("Книга не в учете");
        }
    }

    public void returnBook (Book book){
        BookCondition condition = book.getBookCondition();
        switch (condition) {
            case IN_LIBRARY:
                System.out.println("Книга в библиотеке");
                break;
            case READING_ROOM:
                System.out.println("Спасибо, очень интересная книга(была в читальном зале)");
                inReadingRoom.remove(book);
                listBooks.put(book.getId(), book);
                book.setBookCondition(BookCondition.IN_LIBRARY);
                break;
            case HANDED_OUT:
                System.out.println("Спасибо, очень интересная книга(была выданна на руки)");
                outOfLibrary.remove(book);
                listBooks.put(book.getId(), book);
                book.setBookCondition(BookCondition.IN_LIBRARY);
                break;
            default:
                System.out.println("Книга не в учете");
        }
    }

    public Map<Integer, Book> getAllBooks() {
        return listBooks;
    }

    public List<Book> getOutOfLibrary() {
        return outOfLibrary;
    }

    public List<Book> getInReadingRoom() {
        return inReadingRoom;
    }

    public void removeBook(int id) {
        if (listBooks.containsKey(id)) {
            listBooks.remove(id);
            System.out.println("Книга успешно удалена");
        } else {
            System.out.println("Книга с таким ID отсутствует в библиотеке");
        }
    }

    public void editBook(Book book) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Новый жанр книги: ");
            String genre = scanner.nextLine();
            book.setGenre(Genre.valueOf(genre.toUpperCase()));
            System.out.print("Новое название книги: ");
            String title = scanner.nextLine();
            book.setTitle(title);
            System.out.println("Книга успешно отредактирована");
        } catch (IllegalArgumentException e) {
            System.out.println("Выбирите жанр из предложеных:");
            for (Genre genre : Genre.values()) {
                System.out.print(genre + " ");
            }
            System.out.println();
            editBook(book);
        }

    }
}
