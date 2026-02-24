public class SharedBuffer {

    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {
        
        while (hasData) {
            wait();
        }

        data = value;
        hasData = true;
        System.out.println("Produced: " + value);

        //Notifies Consumer that product is available in Buffer
        notify();
    }

    public synchronized void consume() throws InterruptedException {

        while (!hasData) {
            wait();
        }

        System.out.println("Consumed: " + data);
        hasData = false;

        notify();
    }
}
