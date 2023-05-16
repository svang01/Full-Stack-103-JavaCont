import java.util.HashMap;

public class ProgramMain {
    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("fellowship", new Book("The Fellowship of the Ring", 1954, "My Precious"));
        hashmap.put("twoTowers", new Book("The Two Towers", 1954, "My Precious is on the move"));
        hashmap.put("return", new Book("The Return of the King", 1955, "My precious is destroyed"));

        Program.printValues(hashmap);
        System.out.println("---");
        Program.printValueIfNameContains(hashmap, "Ring");
    }
}
