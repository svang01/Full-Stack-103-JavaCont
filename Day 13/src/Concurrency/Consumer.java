package Concurrency;
public class Consumer implements Runnable {
    private SharedBuffer buffer;
    private int consumedCount;
    private int maxIterations;
    private int sum;

    public Consumer(SharedBuffer buffer, int maxIterations) {
        this.buffer = buffer;
        this.consumedCount = 0;
        this.maxIterations = maxIterations;
        this.sum = 0;
    }

    @Override
    public void run() {
        try {
            while (consumedCount < maxIterations) {
                int number = buffer.consume();
                sum += number;
                System.out.println("Current Sum: " + sum);
                Thread.sleep(1000);
                consumedCount++;
            }
            System.out.println("Final Sum: " + sum);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
