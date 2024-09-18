package task10b;

import java.util.LinkedList;
import java.util.Queue;

class BoundedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int MAX_CAPACITY = 10;

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == MAX_CAPACITY) {
            System.out.println("Buffer is full, producer is waiting...");
            wait(); 
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); 
    }


    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty, consumer is waiting...");
            wait();
        }
        int item = buffer.poll();
        System.out.println("Consumed: " + item);
        notifyAll(); 
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
                Thread.sleep(500);
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
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
