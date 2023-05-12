package Overload;
public class Book {
    private String title;
    private int numPages;
    private int publicationYear;

    public Book(String title, int numPages, int publicationYear) {
        this.title = title;
        this.numPages = numPages;
        this.publicationYear = publicationYear;
    }

    public Book(String title) {
        this.title = title;
        this.numPages = 0; // Default value
        this.publicationYear = 0; // Default value
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String toString() {
        return "Title: " + title + ", Number of pages: " + numPages + ", Publication year: " + publicationYear;
    }

    // Overloaded constructor with title and numPages
    public Book(String title, int numPages) {
        this.title = title;
        this.numPages = numPages;
        this.publicationYear = 0; // Default value
    }

    // Overloaded constructor with title, numPages, and publicationYear as String
    public Book(String title, int numPages, String publicationYear) {
        this.title = title;
        this.numPages = numPages;
        this.publicationYear = Integer.parseInt(publicationYear);
    }

    // Overloaded method to set publicationYear
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
