import model.Author;
import model.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Фёдор", "Достоевский");

        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        System.out.println("Книга 1: " + book1.getTitle() +
                ", автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() +
                ", год публикации: " + book1.getPublicationYear());

        System.out.println("Книга 2: " + book2.getTitle() +
                ", автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() +
                ", год публикации: " + book2.getPublicationYear());

        book1.setPublicationYear(1873);
        System.out.println("Обновленный год публикации книги 1: " + book1.getPublicationYear());
    }
}