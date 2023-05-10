package ChatBot;
import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        greetUser();
        String name = askName();
        int age = guessAge();
        countToNumber();
        programmingKnowledge();
    }

    public static void greetUser() {
        System.out.println("Hello Friend! I'm a ChatBot created by my Master.");
    }

    public static String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("Can you please repeat your name for me?");
        name = scanner.nextLine();
        System.out.println("Thank you, " + name + " ! " + "I'm just a dumb Chatbot so I have many issues. ");
        return name;
    }
    public static int guessAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let me guess your age. Please enter your birth year like 2023:");
        int birthYear = scanner.nextInt();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;
        System.out.println("You must be " + age + " years old!");
        return age;
    }

    public static void countToNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Counting to " + number + "...");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void programmingKnowledge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quiz Time!");
        System.out.println("What data type is used to store whole numbers in JAVA?");
        System.out.println("1. int");
        System.out.println("2. double");
        System.out.println("3. char");
        System.out.println("4. boolean");

        int answer = 1;
        int userAnswer;
        do {
            System.out.print("Please enter your answer (1-4): ");
            userAnswer = scanner.nextInt();
            if (userAnswer == answer) {
                System.out.println("Correct! Great job!");
            } else {
                System.out.println("Sorry, that's incorrect. Please try again.");
            }
        } while (userAnswer != answer);
    }
}



