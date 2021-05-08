package lesson12.library.lib;

import javax.xml.bind.annotation.*;


@XmlRootElement
public class Book {
    @XmlAttribute
    private int id;
    private Genre genre;
    private String title;
    private String author;

    private BookCondition bookCondition;
    private boolean canTakeBook;
    private static int counter = 0;

    public Book() {
        counter++;
    }

    public Book(Genre genre, String title, String author) {
        counter++;
        id = counter;
        this.genre = genre;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookCondition getBookCondition() {
        return bookCondition;
    }

    public void setBookCondition(BookCondition bookCondition) {
        this.bookCondition = bookCondition;
    }

    public boolean isCanTakeBook() {
        return canTakeBook;
    }

    public static int getCounter() {
        return counter;
    }
    @XmlTransient
    public void setCanTakeBook(boolean canTakeBook) {
        this.canTakeBook = canTakeBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", genre=" + genre +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
