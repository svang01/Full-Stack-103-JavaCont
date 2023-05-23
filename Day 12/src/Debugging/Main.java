package Debugging;

import java.util.Arrays;

public class Main {
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
                 // Working Code
        return (double) sum / array.length;

               //Introduced logical error
//        return (double) sum / ( array.length - 1);
    }
// Step -2 Working Code
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        double average = calculateAverage(numbers);
//        System.out.println("Average: " + average);
//    }

// Step - 3 Introduced Null Reference
//    public static void main(String[] args) {
//        int[] numbers = null;
//        double average = calculateAverage(numbers);
//        System.out.println(Arrays.stream(numbers).average());
//    }

// Step 4 -Introduced Array index out of bounds exception
//public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        double average = calculateAverage(numbers);
//        System.out.println(numbers[5]);
//    }

//Step 5 - Use a debugger to find and fix these exceptions
    // Null
    //Set a break point from line 24-27
    //Ran the program in Debug Mode
    //Inspect the value of variable number, which should be null.
    //Fixed issued by initializing the numbers arrays with valid values.

    // Array
    //Set a break point from line 32-37
    //ran the program in debug mode
    //Inspect the value of variable number, which is 5
    //exception occurs when accessing index 5.
    //Fix issued by changing the index value to a valid value like 2.

//Step 6 - 7
    // Logical error occurred on line 19.
    // Ran the program with the working code.
    // Produced an incorrect average calculation
    //Fixed issue by correcting line 19 by diving the sum by array.length instead.
}