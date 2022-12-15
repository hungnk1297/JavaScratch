package demo_reskill.spring;

import java.util.List;

public class SpringMovieTightCoupled {

    //  Concrete Class
    private final HorrorMovieFilter movieFilter = new HorrorMovieFilter();

    //  Generate Movies samples
    private static List<Movie> allMovies;

    static {
        allMovies = List.of(new Movie("Breaking Bad", "Comedy", 8.8)
                , new Movie("The Conjuring", "Horror", 7.5)
                , new Movie("Insidious", "Horror", 6.9)
                , new Movie("Transformer", "Action", 7.4));
    }

    public static void main(String[] args) {
        // Demo using Concrete class
        SpringMovieTightCoupled appConcrete = new SpringMovieTightCoupled();
        appConcrete.getMovieDAO().findMovie(allMovies).forEach(System.out::println);
        System.out.println("Now how to get Comedy Movies?");
    }

    // Getter Setter
    public MovieFilter getMovieDAO() {
        return movieFilter;
    }

}
