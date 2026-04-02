package LoggingFrameWork;

public class Message {
    public LogLevels getLogLevels() {
        return logLevels;
    }

    public void setLogLevels(LogLevels logLevels) {
        this.logLevels = logLevels;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    LogLevels logLevels ;
    long timeStamp ;
    String message ;

    public Message(){
        System.out.println("jbj");
    }
}
