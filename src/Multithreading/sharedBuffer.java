
package Multithreading;

public class sharedBuffer {
    private int data;
    private boolean hasData = false;

    public  void produce(int value) throws InterruptedException {
//        while (hasData) {           // IMPORTANT: while, not if
//            wait();
//        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        //notifyAll();
    }

    public  int consume() throws InterruptedException {
//        while (!hasData) {
//            wait();
//        }
        hasData = false;
        System.out.println("Consumed: " + data);
      //  notifyAll();
        return data;
    }
}
