package Concurrency;
import java.util.ArrayList;
import java.util.List;

public class SharedBuffer {
    private List<Integer> buffer;
    private int maxSize;

    public SharedBuffer(int maxSize) {
        this.buffer = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public synchronized void produce(int number) throws InterruptedException {
        while (buffer.size() >= maxSize) {
            wait();
        }
        buffer.add(number);
        System.out.println("Produced: " + number);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        int number = buffer.remove(0);
        System.out.println("Consumed: " + number);
        notifyAll();
        return number;
    }
}
