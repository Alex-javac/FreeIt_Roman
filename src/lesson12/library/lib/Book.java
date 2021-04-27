package lesson12.library.lib;

//Создать класс Книга, поля:
//• id (целое число)
//• title (строка)
//• genre (строка)
// (Если вы уже в себе уверены, создавайте еще один класс Genre и в класс Book вмест genre включайте genreId,
// который будет ссылаться на жанр с соответствующим id)
public class Book {
    private final int id;
    private Genre genre;
    private String title;
    private BookCondition bookCondition;
    private boolean canTakeBook;
private static int counter=0;
    public Book(Genre genre, String title) {
        counter++;
        id=counter;
        this.genre = genre;
        this.title = title;
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

    public void setCanTakeBook(boolean canTakeBook) {
        this.canTakeBook = canTakeBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", genre=" + genre +
                ", title='" + title + '\'' +
                '}';
    }
}
