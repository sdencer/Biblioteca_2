package com.jinli.db;

import com.jinli.model.Movie;

import java.util.*;

public class MovieDB {
    private static List<Movie> movieList = null;
    private static Map<Integer, Movie> movieMap = null;
    public static List<Movie> getMovieList(){
        movieList = new ArrayList<Movie>();
        movieMap = new HashMap<Integer, Movie>();
        Movie movie1 = new Movie(1, "friends", new Date(), "spencer", 10, false);
        Movie movie2 = new Movie(2, "terminator", new Date(), "spencer", 9, false);
        Movie movie3 = new Movie(3, "friends", new Date(), "spencer", 10, true);
        Movie movie4 = new Movie(4, "friends", new Date(), "spencer", 10, true);

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);

        movieMap.put(1, movie1);
        movieMap.put(2, movie2);
        movieMap.put(3, movie3);
        movieMap.put(4, movie4);

        return movieList;
    }

    public static Map getMovieMap(){
        if (movieMap == null) {
            getMovieList();
        }
        return movieMap;
    }
}
