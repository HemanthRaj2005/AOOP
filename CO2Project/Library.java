import java.util.*;

public class Library implements Iterable<Book> {
    private final List<Book> books = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }

    public List<Book> getBooks() {
        return books;
    }


    public List<Member> getMembers() {
        return members;
    }
}
