package com.jinli.view;

import com.jinli.model.Movie;
import com.jinli.service.MovieService;

import java.util.List;
import java.util.stream.Stream;

public class MovieListView {
    MovieService movieService = new MovieService();
    public List<Movie> showMovices(){
        List<Movie> movies = movieService.getList();
        for (int movieIndex = 0; movieIndex < movies.size(); movieIndex ++) {
            Movie movie = movies.get(movieIndex);
            System.out.print(" " + String.format("%-5s", movie.getId())+ " | "
                    + String.format("%-20s", movie.getName()) +" | "
                    + String.format("%-20s", movie.getDirector()) +" | "
                    + String.format("%-5s", movie.getRate()) +" | "
                    + String.format("%-20s", movie.getYear()) +" | "
                    + String.format("%-10s", movie.isCheckout()) + "\n");
        }
        return movies;
    }
}
