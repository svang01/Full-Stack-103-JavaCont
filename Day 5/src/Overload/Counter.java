package Overload;
public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    public void increaseBy(int increaseBy) {
        if (increaseBy >= 0) {
            value += increaseBy;
        }
    }

    public void decreaseBy(int decreaseBy) {
        if (decreaseBy >= 0) {
            value -= decreaseBy;
        }
    }
}
