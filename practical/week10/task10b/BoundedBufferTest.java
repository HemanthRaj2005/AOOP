package task10b;


public class BoundedBufferTest {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer();

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}
