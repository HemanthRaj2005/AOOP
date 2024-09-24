import java.util.Collections;
import java.util.Comparator;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Java Basics", "John Doe", 2020));
        library.addBook(new Book("Advanced Java", "Jane Doe", 2021));
        library.addBook(new Book("Data Structures", "Alice Smith", 2019));

        Collections.sort(library.getBooks());

        Collections.sort(library.getBooks(), Comparator.comparingInt(Book::getYear));

        for (Book book : library) {
            System.out.println(book);
        }

        try {
            Book clonedBook = (Book) library.getBooks().get(0).clone();
            System.out.println("Cloned Book: " + clonedBook);
        } catch (CloneNotSupportedException e) {
        }
    }
}
