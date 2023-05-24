package Concurrency;

public class Main {
    public static void main(String[] args) {
        int maxIterations = 5; // Set the maximum number of iterations

        SharedBuffer buffer = new SharedBuffer(5);
        Producer producer = new Producer(buffer, maxIterations);
        Consumer consumer = new Consumer(buffer, maxIterations);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
