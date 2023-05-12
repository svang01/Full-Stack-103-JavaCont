package Overload;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("To Kill a Mockingbird");
        Book book2 = new Book("A Brief History of Time", 256);
        Book book3 = new Book("Beautiful Code", 593, "2007");

        books.add(book1);
        books.add(book2);
        books.add(book3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What information will be printed (everything or name)? ");
        String printOption = scanner.nextLine();

        if (printOption.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.toString());
                System.out.println();
            }
        } else if (printOption.equals("name")) {
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle());
            }
        } else {
            System.out.println("Invalid input. Please enter either 'everything' or 'name'.");
        }
    }
}
