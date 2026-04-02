package LoggingFrameWork;

import java.util.ArrayList;
import java.util.List;

public class Logger {

   private  static final Logger loggerInstance = new Logger();
    LogLevels ConfiglogLevels = LogLevels.debug ;
    List<Appender> ap  = new ArrayList<>();
    LogConfig lc ;
    Message message ;

    public static Logger getLoggerInstance(){
        return loggerInstance ;
    }
    void log(LogLevels logLevels ,Message message){
        if(logLevels.ordinal() > ConfiglogLevels.ordinal()){
            for( Appender a : ap){
                a.write(logLevels , message);
            }
        }
    }

    void addAppender(Appender app){
        ap.add(app);
    }
    public void error(Message msg){
        log(LogLevels.error ,msg);
    }
    public  void debug(Message msg){
        log(LogLevels.debug , msg);
    }

    public  void warning(Message msg){log(LogLevels.warning , msg);}
}
