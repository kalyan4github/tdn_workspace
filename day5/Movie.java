
public class Movie {
    private int id;
    private String movieName;
    private String movieDetails;

    public Movie() {
    }

    public Movie(int id, String movieName, String movieDetails) {
        this.id = id;
        this.movieName = movieName;
        this.movieDetails = movieDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDetails() {
        return movieDetails;
    }

    public void setMovieDetails(String movieDetails) {
        this.movieDetails = movieDetails;
    }
    
    
}