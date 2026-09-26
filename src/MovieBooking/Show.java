package MovieBooking;

public class Show {
    Movie movie;
  int showId ;
  Screen screen ;

    public Show(Movie movie , int showId){
        this.movie = movie ;
        this.showId = showId ;
    }


    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }
}
