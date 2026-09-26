package MovieBooking;

import java.util.ArrayList;
import java.util.List;

public class MovieBookingSystem {

    List<Movie> movieList = new ArrayList<>();
    List<Theater> theaterList = new ArrayList<>() ;

    // Admin operations
    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public void addTheater(Theater theater) {
        theaterList.add(theater);
    }

    public void addScreen(int theaterId, Screen screen) {
        for (Theater theater : theaterList) {
            if (theater.tid == theaterId) {
                // Theater class mein List<Screen> screens maintain honi chahiye
                theater.getScreenList().add(screen);
                return;
            }
        }
        System.out.println("Theater with ID " + theaterId + " not found.");
    }

    public void addShow(int screenId, Show show) {
        for (Theater theater : theaterList) {
            for (Screen screen : theater.getScreenList()) {
                if (screen.scid == screenId) {
                    show.screen = screen;
                    //screen.
                    return;
                }
            }
        }
    }
    // user
    public List<Movie> getMovies() {

        return movieList ;

    }

    public Movie SearchMovie(String mname) {
        for(Movie m :movieList){
            if(m.mname.equals(mname)){
                return m;
            }
        }
        return  null ;

    }



}
