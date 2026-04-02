package Multithreading;

public class producer implements Runnable{
sharedBuffer buffer ;

 public producer(sharedBuffer buffer){
    this.buffer = buffer ;
}
    @Override
    public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.produce(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
