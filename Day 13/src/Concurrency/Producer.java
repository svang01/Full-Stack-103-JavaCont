package Concurrency;
import java.util.Random;

public class Producer implements Runnable {
    private SharedBuffer buffer;
    private int producedCount;
    private int maxIterations;

    public Producer(SharedBuffer buffer, int maxIterations) {
        this.buffer = buffer;
        this.producedCount = 0;
        this.maxIterations = maxIterations;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (producedCount < maxIterations) {
                int number = random.nextInt(100);
                buffer.produce(number);
                Thread.sleep(random.nextInt(1000));
                producedCount++;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
