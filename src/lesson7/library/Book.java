package lesson7.library;

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

    public Book(Genre genre, String title) {
        this.id= Math.abs(genre.hashCode() + title.hashCode());
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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", genre=" + genre +
                ", title='" + title + '\'' +
                '}';
    }
}
