package LibraryManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class LibraryManager<T extends LibraryItem> implements LibraryOperations<T> {
    private List<T> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(T item) {
        items.add(item);
        System.out.println("Added item: " + item.getTitle());
    }

    @Override
    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println("Removed item: " + item.getTitle());
        } else {
            System.out.println("Item not found: " + item.getTitle());
        }
    }

    @Override
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Library items:");
            for (T item : items) {
                System.out.println(item.getItemDetails());
                System.out.println("------------------------");
            }
        }
    }
}
