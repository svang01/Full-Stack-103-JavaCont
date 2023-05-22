package LibraryManagement;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Create books
        Supplier<Book> book1Supplier = () -> new Book("My First Title", "Shatt Vang", 2021, 500, "Comedy");
        Supplier<Book> book2Supplier = () -> new Book("My Second Title", "ShaBecky Vang", 2022, 300, "Comedy");
        Supplier<Book> book3Supplier = () -> new Book("My Third Title", "Shatt Vang", 2023, 200, "Comedy");
        Supplier<Book> book4Supplier = () -> new Book("My New Book", "Diesel Vang", 2023, 40, "Tech");

        // Create library
        Library library = new Library();

        // Add books to the library
        Consumer<Book> addBookToLibrary = library::addBook;
        addBookToLibrary.accept(book1Supplier.get());
        addBookToLibrary.accept(book2Supplier.get());
        addBookToLibrary.accept(book3Supplier.get());
        addBookToLibrary.accept(book4Supplier.get());

        // Remove a book from the library
        Consumer<String> removeBookFromLibrary = library::removeBook;
        removeBookFromLibrary.accept("My Third Title");

        // Find all books published in a specific year
        List<Book> booksByYear = library.findBooksByPublicationYear(2021);
        System.out.println("Books published in 2021:");
        booksByYear.forEach(book -> System.out.println(book.getTitle()));

        // Find the book with the most pages
        Book bookWithMostPages = library.findBookWithMostPages();
        System.out.println("Book with the most pages:");
        System.out.println(bookWithMostPages.getTitle());

        // Find all books by a specific author
        List<Book> booksByAuthor = library.findBooksByAuthor("Shatt Vang");
        System.out.println("Books by Shatt Vang:");
        booksByAuthor.forEach(book -> System.out.println(book.getTitle()));

        // Print all book titles in the library, sorted alphabetically
        List<String> sortedTitles = library.getAllBookTitlesSorted();
        System.out.println("Library Books: ");
        sortedTitles.forEach(System.out::println);

        // Find books with more than a certain number of pages
        List<Book> booksWithMoreThanPages = library.findBooksByMinPages(300);
        System.out.println("Books with more than 300 pages:");
        booksWithMoreThanPages.forEach(book -> System.out.println(book.getTitle()));

        // Find books in a specific category
        List<Book> booksByCategory = library.findBooksByCategory("Comedy");
        System.out.println("Books in the Comedy category:");
        booksByCategory.forEach(book -> System.out.println(book.getTitle()));

        // Create users
        User user1 = new User("Byron", "1");
        User user2 = new User("Storm", "2");

        // Loan books to users
        Consumer<Book> loanBookToUser1 = user1::loanBook;
        loanBookToUser1.accept(book1Supplier.get());
        loanBookToUser1.accept(book2Supplier.get());

        // Return a book
        Consumer<Book> returnBookFromUser1 = user1::returnBook;
        returnBookFromUser1.accept(book2Supplier.get());

        // Calculate late fees for a user
        double lateFeesUser2 = user2.calculateLateFees();
        System.out.println("Late fees for " + user2.getName() + ": $" + lateFeesUser2);
    }
}

