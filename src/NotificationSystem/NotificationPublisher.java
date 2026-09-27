package NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public class NotificationPublisher {

List<NotificationChannel> nc = new ArrayList<>();

public void subscribe(NotificationChannel n){
    nc.add(n);
}

  public  void unsubscribe(NotificationChannel n){
nc.remove(n);
    }


  public  void notifyObserver(){
for(NotificationChannel nn : nc){
    nn.update();
}
    }

}
