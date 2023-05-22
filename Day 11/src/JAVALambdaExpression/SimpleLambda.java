package JAVALambdaExpression;

public class SimpleLambda {
    public static void main(String[] args) {
     Math addition = (int x, int y) -> x + y;
     int Add = addition.operate(1,2);
     System.out.println(Add);

     Math subtraction = (int x, int y) -> x - y;
     int Sub = subtraction.operate(1,2);
     System.out.println(Sub);

     Math multiply = (int x, int y) -> x * y;
     int Multi = multiply.operate(1,2);
     System.out.println(Multi);

     Math divide = (int x, int y) -> x / y;
     double Div = divide.operate(2, 2);
     System.out.println(Div);

    }
}
interface Math {
    int operate (int x, int y);
}
