package JAVALambdaExpression;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambadaBuiltInFunctions {
    public static void main(String[] args) {
        //Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(8));
        // Function
        Function<String, String> toUppercase = str -> str.toUpperCase();
        System.out.println(toUppercase.apply("Test for Function"));
        //Consumer
        Consumer<String> printMessage = message -> System.out.println(message);
        printMessage.accept("Test for Consumer");
        //Supplier
        Supplier<String> message = () -> "Supplier Test!";
        System.out.println(message.get());
    }
}

