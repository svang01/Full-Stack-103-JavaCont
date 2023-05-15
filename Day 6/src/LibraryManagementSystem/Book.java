package LibraryManagementSystem;
public class Book extends LibraryItem {
    private String author;
    private String ISBN;

    public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public String getItemDetails() {
        return "Title: " + getTitle() +
                "\nAuthor: " + author +
                "\nISBN: " + ISBN +
                "\nRelease Year: " + getReleaseYear();
    }
}
