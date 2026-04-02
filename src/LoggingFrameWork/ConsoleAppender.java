package LoggingFrameWork;

public class ConsoleAppender  implements Appender{
    @Override
    public void write(LogLevels logLevels , Message message ){
        System.out.println("logging" + logLevels.name() + "  " + message.message + " " + message.timeStamp);
    }

}
