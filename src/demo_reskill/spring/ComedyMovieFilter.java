package demo_reskill.spring;

import java.util.List;
import java.util.stream.Collectors;

public class ComedyMovieFilter implements MovieFilter{

    @Override
    public List<Movie> findMovie(List<Movie> movies) {
        return movies.stream()
                .filter(movie -> "Comedy".equalsIgnoreCase(movie.category()))
                .collect(Collectors.toList());
    }
}
