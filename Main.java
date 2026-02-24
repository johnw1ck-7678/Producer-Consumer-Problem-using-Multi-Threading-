public class Main{
    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Producer producerTask = new Producer(buffer);
        Consumer consumerTask = new Consumer(buffer);

        Thread producerThread = new Thread(producerTask);
        Thread consumerThread = new Thread(consumerTask);

        producerThread.start();
        consumerThread.start();
    }
}

