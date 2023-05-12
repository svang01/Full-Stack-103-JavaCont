package Overload;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter1 = new Counter(3);
        System.out.println(counter1.getValue());

        Counter counter2 = new Counter();
        System.out.println(counter2.getValue());

        counter1.increase();
        System.out.println(counter1.getValue());

        counter1.decrease();
        System.out.println(counter1.getValue());

        counter1.increaseBy(3);
        System.out.println(counter1.getValue());

        counter1.decreaseBy(2);
        System.out.println(counter1.getValue());

        counter2.increaseBy(-5);
        System.out.println(counter2.getValue());

        counter2.decreaseBy(-3);
        System.out.println(counter2.getValue());
    }
}
