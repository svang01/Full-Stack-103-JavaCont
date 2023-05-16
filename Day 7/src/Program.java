import java.util.HashMap;
import java.util.LinkedHashMap;

class Book {
    private String name;
    private int year;
    private String description;

    public Book(String name, int year, String description) {
        this.name = name;
        this.year = year;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name + " (" + year + ") - " + description;
    }
}

public class Program {
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().toLowerCase().contains(text.toLowerCase())) {
                System.out.println(book);
            }
        }
    }
}