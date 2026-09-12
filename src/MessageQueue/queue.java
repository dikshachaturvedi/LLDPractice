package MessageQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class queue {
    String qname ;
    BlockingQueue<message> bq  =  new LinkedBlockingQueue<>(); ;

    void enqueue(message message){
           bq.offer(message);
    }
    void dequeue() throws InterruptedException{
          bq.take();
    }

}
