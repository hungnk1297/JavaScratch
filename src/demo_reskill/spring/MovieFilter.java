package demo_reskill.spring;

import java.util.List;

public interface MovieFilter {
    List<Movie> findMovie(List<Movie> movies);
}
