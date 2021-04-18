package lesson7.library;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//Создать класс Библиотека, поля:
//• Список книг (изначально пустой) методы:
//• добавить книгу (принимает объект книги и добавляет его в список товаров).
// При попытке добавить книгу с id уже существующем в списке, вставка производится не должна
//• получить все книги (метод ВОЗВРАЩАЕТ список всех книг в библиотеке)
//• удалить книгу (метод принимает id книги и удаляет из списка книгу с соответствующим id)
//• редактировать книгу (принимает объект книги и редактирует их список товаров)
// Обратите внимание что id книги и индекс книги в списке — это разные вещи, не перепутайте.
// Id книги — это поле вашего объекта, вы при его создании его задаете.
// А индекс книги в списке книг, это по сути её порядковый номер в списке(начинается с 0).
public class Library {
   private Map<Integer,Book> listBooks = new LinkedHashMap<>();

    public void addBook(Book book) {
        if(listBooks.containsKey(book.getId())){
            System.out.println("Книга с таким ID уже есть в библиотеке");
        }else {
            listBooks.put(book.getId(), book);
        }
    }

    public Map<Integer, Book> getAllBooks() {
        return listBooks;
    }

    public void removeBook(int id) {
        if(listBooks.containsKey(id)){
            listBooks.remove(id);
            System.out.println("Книга успешно удалена");
        }else {
            System.out.println("Книга с таким ID отсутствует в библиотеке");
        }
    }
   public void editBook(Library library ,Book book) {
       System.out.println("Вы хотите отредактировать эту книгу: " + book.getTitle() + " " + book.getGenre());
       Scanner scanner = new Scanner(System.in);
       System.out.println("Нажмите \"1\" чтобы продолжить");
       System.out.println("Нажмите \"2\" чтоб вернуться в главное меню");
       String num = scanner.nextLine();
       switch (num) {
           case "1":
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
                   editBook(library,book);
               }
               break;
           case "2":
               Application.start(library);
               break;
           default:
               editBook(library,book);
       }
   }
}
