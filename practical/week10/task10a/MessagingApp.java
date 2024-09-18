package task10a;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MessagingApp {
    public static void main(String[] args) {
        BlockingQueue<String> buffer = new LinkedBlockingQueue<>(5);

        Producer producer = new Producer(buffer, 10);
        Consumer consumer = new Consumer(buffer); 

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

