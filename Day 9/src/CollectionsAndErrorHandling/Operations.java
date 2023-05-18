package CollectionsAndErrorHandling;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Operations {
    public static void main(String[] args) {
        // Define a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);

        System.out.println("List before removing duplicates: " + numbers); //Test List

        try {
            // Use a Set to remove duplicates
            Set<Integer> distinctNumbers = new HashSet<>(numbers);

            // Calculate the sum and average of the integers
            int sum = 0;
            for (int num : distinctNumbers) {
                sum += num;
            }
            double average = (double) sum / distinctNumbers.size();

            // Print the sum, average, and the list of integers without duplicates
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("List without duplicates: " + distinctNumbers);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: The Index is out of bounds. Please check list again");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Argument is invalid, please check input value");
        } catch (ArithmeticException e) {
            System.out.println("Error: An arithmetic operation cannot be performed. Please check calculations");
        } catch (Exception e) {
            System.out.println("Error: Please review your code!");
        } finally {
            System.out.println("Program completed.");
        }
    }
}
