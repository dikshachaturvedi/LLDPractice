package LoggingFrameWork;

public interface Appender {

    public void write(LogLevels logLevels , Message message);
}
