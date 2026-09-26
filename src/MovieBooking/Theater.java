package MovieBooking;

import java.util.List;

public class Theater {
    List<Show> showList;
    int tid ;
    public Theater(List<Show> showList , int tid){
        this.showList = showList ;
        this.tid = tid ;
    }


    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}
