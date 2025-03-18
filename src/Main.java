class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Book {
    private String title;          // Название книги
    private Author author;         // Автор книги
    private int publicationYear;   // Год публикации

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

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