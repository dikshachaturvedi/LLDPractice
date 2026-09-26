package MovieBooking;

import java.util.List;

public class Theater {
    List<Screen> screenList;
    int tid ;
    public Theater(List<Screen> showList , int tid){
        this.screenList = showList ;
        this.tid = tid ;
    }


    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }
}
