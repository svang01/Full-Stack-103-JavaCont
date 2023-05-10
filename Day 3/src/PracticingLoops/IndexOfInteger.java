package PracticingLoops;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> MyArray = new ArrayList<>();

        while(true) {
            System.out.println("Enter a number or enter 0 to exit.");
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("Done entering integers into list.");
                break;
            } else {
                MyArray.add(num);
            }
        }

        System.out.println("What number are you looking for in the list?");

        int numToFind = scanner.nextInt();

        for (int i = 0; i < MyArray.size(); i++) {
            if(numToFind == MyArray.get(i)) {
                System.out.println(numToFind + " is at index " + i);
            }
        }

    }
}
