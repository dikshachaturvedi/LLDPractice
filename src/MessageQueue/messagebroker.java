package MessageQueue;

import java.util.Map;
import java.util.Queue;

public class messagebroker {

Map<String , queue> broker ;

    public messagebroker(Map<String, queue> broker) {
        this.broker = broker;
    }


    void createQueue(String qname){
    broker.computeIfAbsent( qname, q -> new queue());
}
void publish(queue queue , message message){

   queue queue1 = broker.get(queue);
    queue1.enqueue(message);
}

void subsribe(){

}
void getQueue(queue queue) throws InterruptedException{
    queue queue1 = broker.get(queue);
    queue1.dequeue();
}
}

/* "I'm using Java's BlockingQueue, which is thread-safe. Multiple producers " +
        "can safely call put() concurrently and multiple consumers can safely call take(). " +
        "The synchronization is handled internally " +
         "by the queue implementation, so I don't need explicit synchronized blocks for enqueue/dequeue operations." */