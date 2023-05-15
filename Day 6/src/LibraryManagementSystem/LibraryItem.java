package LibraryManagementSystem;
public abstract class LibraryItem {
    private String title;
    private int releaseYear;

    public LibraryItem(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public abstract String getItemType();

    public abstract String getItemDetails();

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
