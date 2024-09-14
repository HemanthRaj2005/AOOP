package task10a;

import java.util.concurrent.BlockingQueue;
class Producer implements Runnable {
    private BlockingQueue<String> buffer;
    private int messageCount;

    public Producer(BlockingQueue<String> buffer, int messageCount) {
        this.buffer = buffer;
        this.messageCount = messageCount;
    }

    @Override
    public void run() {
        for (int i = 1; i <= messageCount; i++) {
            try {
                String message = "Message " + i;
                buffer.put(message); 
                System.out.println("Produced: " + message);
                Thread.sleep(500);  
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        try {
            buffer.put("EOF");  
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
class Consumer implements Runnable {
    private BlockingQueue<String> buffer;

    public Consumer(BlockingQueue<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = buffer.take(); 
                if (message.equals("EOF")) {
                    break;  
                }
                System.out.println("Consumed: " + message);
                Thread.sleep(1000);  
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}