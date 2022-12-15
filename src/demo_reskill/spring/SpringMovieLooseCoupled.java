package demo_reskill.spring;

import java.util.List;

public class SpringMovieLooseCoupled {
    //  Interface
    private MovieFilter movieFilter;


    public SpringMovieLooseCoupled(MovieFilter movieFilter) {
        this.movieFilter = movieFilter;
    }

    //  Generate Movies samples
    private static List<Movie> allMovies;
    static {
        allMovies = List.of(
                new Movie("Breaking Bad", "Comedy", 8.8),
                new Movie("The Conjuring", "Horror", 7.5),
                new Movie("Insidious", "Horror", 6.9),
                new Movie("Transformer", "Action", 7.4));
    }

    public static void main(String[] args) {

        //  Demo using Interface
        SpringMovieLooseCoupled app = new SpringMovieLooseCoupled(new HorrorMovieFilter());

        app.getMovieDAO().findMovie(allMovies).forEach(System.out::println);

        app.setMovieDAO(new ComedyMovieFilter());
        System.out.println("Now I want some Comedy movies!");
        app.getMovieDAO().findMovie(allMovies).forEach(System.out::println);
    }

    // Getter Setter
    public MovieFilter getMovieDAO() {
        return movieFilter;
    }

    public void setMovieDAO(MovieFilter movieFilter) {
        this.movieFilter = movieFilter;
    }
}
