package task9a;

public class NumberPrinter {

    private static final int MAX_NUMBER = 15;
    private static int currentNumber = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread printTwoThread = new Thread(new PrintTwo());
        Thread printThreeThread = new Thread(new PrintThree());
        Thread printFourThread = new Thread(new PrintFour());
        Thread printFiveThread = new Thread(new PrintFive());
        Thread printNumberThread = new Thread(new PrintNumber());
        printTwoThread.start();
        printThreeThread.start();
        printFourThread.start();
        printFiveThread.start();
        printNumberThread.start();
        try {
            printTwoThread.join();
            printThreeThread.join();
            printFourThread.join();
            printFiveThread.join();
            printNumberThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class PrintTwo implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (currentNumber > MAX_NUMBER) return;
                    if (currentNumber % 2 == 0) {
                        System.out.println(currentNumber + " is divisible by 2");
                    }
                    currentNumber++;
                }
            }
        }
    }

    static class PrintThree implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (currentNumber > MAX_NUMBER) return;
                    if (currentNumber % 3 == 0) {
                        System.out.println(currentNumber + " is divisible by 3");
                    }
                    currentNumber++;
                }
            }
        }
    }

    static class PrintFour implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (currentNumber > MAX_NUMBER) return;
                    if (currentNumber % 4 == 0) {
                        System.out.println(currentNumber + " is divisible by 4");
                    }
                    currentNumber++;
                }
            }
        }
    }

    static class PrintFive implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (currentNumber > MAX_NUMBER) return;
                    if (currentNumber % 5 == 0) {
                        System.out.println(currentNumber + " is divisible by 5");
                    }
                    currentNumber++;
                }
            }
        }
    }

    static class PrintNumber implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (currentNumber > MAX_NUMBER) return;
                    if (currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                        System.out.println(currentNumber + " is not divisible by 2, 3, 4, or 5");
                    }
                    currentNumber++;
                }
            }
        }
    }
}