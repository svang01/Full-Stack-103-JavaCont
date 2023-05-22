package LibraryManagement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        books.removeIf(b -> b.getTitle().equals(title));
    }

    public List<Book> findBooksByPublicationYear(int year) {
        Predicate<Book> byPublicationYear = book -> book.getPublicationYear() == year;
        return filterBooks(byPublicationYear);
    }

    public List<Book> findBooksByAuthor(String author) {
        Predicate<Book> byAuthor = book -> book.getAuthor().equalsIgnoreCase(author);
        return filterBooks(byAuthor);
    }

    public Book findBookWithMostPages() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getPages))
                .orElse(null);
    }

    public List<Book> findBooksByMinPages(int minPages) {
        Predicate<Book> byMinPages = book -> book.getPages() > minPages;
        return filterBooks(byMinPages);
    }

    public List<String> getAllBookTitlesSorted() {
        return books.stream()
                .map(Book::getTitle)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByCategory(String category) {
        Predicate<Book> byCategory = book -> book.getCategory().equalsIgnoreCase(category);
        return filterBooks(byCategory);
    }

    public void loanBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null && !book.isOnLoan()) {
            book.setOnLoan(true);
        }
    }

    public void returnBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null && book.isOnLoan()) {
            book.setOnLoan(false);
        }
    }

    private Book findBookByTitle(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equals(title))
                .findFirst()
                .orElse(null);
    }

    private List<Book> filterBooks(Predicate<Book> predicate) {
        return books.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
