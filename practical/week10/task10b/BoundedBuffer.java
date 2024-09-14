package task10b;

import java.util.LinkedList;
import java.util.Queue;

class BoundedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int MAX_CAPACITY = 10;

    // Producer thread adds items to the buffer
    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == MAX_CAPACITY) {
            System.out.println("Buffer is full, producer is waiting...");
            wait(); // Wait if the buffer is full
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); // Notify the consumer that items are available
    }

    // Consumer thread removes items from the buffer
    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty, consumer is waiting...");
            wait(); // Wait if the buffer is empty
        }
        int item = buffer.poll();
        System.out.println("Consumed: " + item);
        notifyAll(); // Notify the producer that space is available
        return item;
    }
}

class Producer implements Runnable {
    private final BoundedBuffer buffer;

    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int item = 0;
        try {
            while (true) {
                buffer.produce(item++);
                Thread.sleep(500); // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final BoundedBuffer buffer;

    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(1000); // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
