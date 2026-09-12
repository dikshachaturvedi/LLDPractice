package MessageQueue;

public class consumer {

    String cid ;

    void consume(messagebroker messagebroker , queue q) throws InterruptedException{
        messagebroker.getQueue(q);
    }

    void ack(){

    }
    void process(){

    }
}
