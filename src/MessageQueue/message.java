package MessageQueue;

public class message {
    String mid ;
    String msg ;
    long timestamp ;

    public message(String mid, String msg, long timestamp) {
        this.mid = mid;
        this.msg = msg;
        this.timestamp = timestamp;
    }
}
