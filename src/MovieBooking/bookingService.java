package MovieBooking;

import java.util.List;

public class bookingService {

    List<movie> movieList ;
    List<theater> theaters ;

    void addmovie(movie movie){
        movieList.add(movie);
    }
    void addtheater( theater t)
    {
        theaters.add(t);
    }
}
