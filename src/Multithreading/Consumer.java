package Multithreading;

public class Consumer implements Runnable{
 //sharedBuffer buffer ;
    private sharedBuffer buffer;

   public Consumer(sharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
