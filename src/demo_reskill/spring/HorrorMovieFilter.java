package demo_reskill.spring;

import java.util.List;
import java.util.stream.Collectors;

public class HorrorMovieFilter implements MovieFilter {

    @Override
    public List<Movie> findMovie(List<Movie> movies) {
        return movies.stream()
                .filter(movie -> "Horror".equalsIgnoreCase(movie.category()))
                .collect(Collectors.toList());
    }
}
