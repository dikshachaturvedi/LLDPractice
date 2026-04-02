package MovieBooking;

import java.util.List;

public class location {
    List<theater> theaterList ;
    /**
     *
     */
    String locname ;
    public location(List<theater> theaterList , String locname){
        this.theaterList = theaterList ;
        this.locname = locname ;

    }

    String getlocname(){
        return locname ;
    }

    void addtheater(List<show> showList , int tid){
        theaterList.add( new theater(showList , tid));
    }


}
