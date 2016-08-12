package com.jinli.view;

import com.jinli.service.MovieService;
import com.jinli.util.StringUtil;

public class CheckoutMovieView {
    MovieService movieService = new MovieService();
    public String checkoutMovie(Integer movieId) {
        String checkoutRes = null;
        while (true) {
            System.out.println("please input the movie id or input 0 to quit");
            if (movieId == null) {
                movieId = StringUtil.getInputInt();
            }
            if (movieId == 0) {
                break;
            }
            if (movieService.updateBookStatus(movieId, true)) {
                checkoutRes = "checkout success";
            } else {
                checkoutRes = "checkout failed";
            }
            movieId = null;
            System.out.println(checkoutRes);

        }
        return checkoutRes;
    }
}
