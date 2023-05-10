package PractcingLoops;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> MyArray = new ArrayList<Integer>();

        while (true) {
            System.out.print("Enter an number or enter 0 exit ");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            MyArray.add(input);
        }

        System.out.print("The numbers in the list are: ");
        for (int i = 0; i < MyArray.size(); i++) {
            System.out.print(MyArray.get(i));
            if (i < MyArray.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(". The sum of that list is: " + getSum(MyArray));

        scanner.close();
    }
    public static int getSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}