package MessageQueue;

public class producer {
    String pid ;

    void publish(messagebroker messagebroker , message message , queue queue){

        messagebroker.publish(queue , message);

    }
}
