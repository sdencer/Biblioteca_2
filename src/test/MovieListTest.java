package test;

import com.jinli.db.BookDB;
import com.jinli.db.MovieDB;
import com.jinli.model.Book;
import com.jinli.model.Movie;
import com.jinli.model.User;
import com.jinli.view.BookListView;
import com.jinli.view.MovieListView;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class MovieListTest {

    @Test
    public void testMovieList(){
        MovieListView movieListView = new MovieListView();
        List<Movie> movies = MovieDB.getMovieList();

        Assert.assertEquals(movies, movieListView.showMovices());
    }

}
