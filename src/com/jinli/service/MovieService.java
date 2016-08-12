package com.jinli.service;

import com.jinli.db.MovieDB;
import com.jinli.model.Movie;

import java.util.List;
import java.util.Map;

public class MovieService implements BaseService {
    @Override
    public List<Movie> getList() {
        return MovieDB.getMovieList();
    }

    public boolean updateBookStatus(Integer movieId, boolean isCheckout){
        Map movieMap = MovieDB.getMovieMap();
        if (movieMap.containsKey(movieId)){
            Movie movie = (Movie) movieMap.get(movieId);
            if (isCheckout) {
                if (movie.isCheckout()) {
                    return false;
                }
                movie.setCheckout(isCheckout);
            } else {
                if (!movie.isCheckout()){
                    return false;
                }
                movie.setCheckout(isCheckout);
            }
            return true;
        }
        return false;
    }
}
