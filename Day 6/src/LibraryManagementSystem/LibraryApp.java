package LibraryManagementSystem;
public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> libraryManager = new LibraryManager<>();

        Book book1 = new Book("The Lord of the rings", 1954, "J.R.R Tolkien", "111111");
        Book book2 = new Book("To Hobbit", 1937, "J.R.R Tolkien", "1111110101010");
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);

        DVD dvd1 = new DVD("Forrest Gump", 1994, "Robert Zemeckis", 142);
        DVD dvd2 = new DVD("The Matrix", 1999, "The Wachowskis", 136);
        libraryManager.addItem(dvd1);
        libraryManager.addItem(dvd2);

        libraryManager.displayItems();

        // Add another book to the library
        Book book3 = new Book("The Lord of the Rings: The Two Towers", 1934, "J. R R Tolkien", "111112");
        libraryManager.addItem(book3);

        //Add another movie to the library
        DVD dvd3 = new DVD("Fight Club", 1999, "David Fincher", 139);
        libraryManager.addItem(dvd3);

        // Remove an item from the library
        libraryManager.removeItem(dvd1);
        //Display updated cart
        libraryManager.displayItems();
    }
}