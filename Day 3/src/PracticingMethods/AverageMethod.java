package PracticingMethods;

import java.util.Scanner;
public class AverageMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        double avg = average(num1, num2, num3);
        System.out.println("The average is " + avg);

        scanner.close();
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double average(int num1, int num2, int num3) {
        int sum = sum(num1, num2, num3);
        double avg = (double) sum / 3;
        return avg;
    }
}
