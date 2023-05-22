package JAVALambdaExpression;

public class LambadaCustomFunctions {
    public static void main(String[] args) {
        EvenNumber isEven = num -> num % 2 ==0;
        System.out.println("Is 5 even? " + isEven.evenNum(5)); //test
        System.out.println("Is 2 even? " + isEven.evenNum(2)); //test

        OddNumber isOdd = num -> num % 2 != 0;
        System.out.println("Is 3 odd? " + isOdd.oddNum(3)); //test
        System.out.println("Is 2 odd? " + isOdd.oddNum(2)); //test

        Print printer = message -> System.out.println(message);
        String prints = "Test out this message";
        printer.print(prints);

    }
    interface EvenNumber {
        boolean evenNum(int num);
    }
    interface OddNumber {
        boolean oddNum(int num);
    }
    interface Print {
        void print(String message);
    }
}
