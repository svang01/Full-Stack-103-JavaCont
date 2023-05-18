package PracticeHandlingExceptions.ValidatingParameters;
public class Main {
    public static void main(String[] args) {
        // Test Person class
        try {
            Person validPerson = new Person("Triple H", 53);
            System.out.println("Valid person created: " + validPerson.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating valid person: " + e.getMessage());
        }
        //Testing Invalid Person
        try {
            Person InvalidPerson = new Person("",53 );
            System.out.println("Valid person created: " + InvalidPerson.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating valid person: " + e.getMessage());
            System.out.println();
        }
        // Test Calculator class
        Calculator calculator = new Calculator();

        // Test factorial
        try {
            int factorialResult = calculator.factorial(3);
            System.out.println("Factorial of 3: " + factorialResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error calculating factorial: " + e.getMessage());
        }
        // Test Error
        try {
            int factorialResult = calculator.factorial(-3);
            System.out.println("Factorial of -3: " + factorialResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error calculating factorial: " + e.getMessage());
            System.out.println();
        }
        // Test binomial coefficient
        try {
            int binomialResult = calculator.binomialCoefficient(3, 2);
            System.out.println("Binomial coefficient of (3, 2): " + binomialResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error calculating binomial coefficient: " + e.getMessage());
        }
        //Test binomial error
        try {
            int binomialResult = calculator.binomialCoefficient(1, 2);
            System.out.println("Binomial coefficient of (1, 2): " + binomialResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error calculating binomial coefficient: " + e.getMessage());
        }
    }
}
