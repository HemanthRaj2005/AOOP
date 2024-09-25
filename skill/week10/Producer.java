import java.util.concurrent.BlockingQueue;

// Producer class that generates messages
class Producer implements Runnable {
    private final BlockingQueue<String> queue;

    // Constructor to initialize the shared queue
    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int messageNumber = 1;
        try {
            while (true) {
                String message = "Message " + messageNumber;
                queue.put(message); // Add message to the queue
                System.out.println(Thread.currentThread().getName() + " produced: " + message);
                messageNumber++;
                Thread.sleep(500); // Simulate delay in message production
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Producer was interrupted");
        }
    }
}

// Consumer class that consumes messages
class Consumer implements Runnable {
    private final BlockingQueue<String> queue;

    // Constructor to initialize the shared queue
    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = queue.take(); // Take message from the queue
                System.out.println(Thread.currentThread().getName() + " consumed: " + message);
                Thread.sleep(1000); // Simulate delay in message consumption
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumer was interrupted");
        }
    }
}


