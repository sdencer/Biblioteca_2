package com.jinli.control;

import com.jinli.model.User;
import com.jinli.util.StringUtil;
import com.jinli.view.*;

/**
 * Created by jinli on 8/4/16.
 */
public class MainControl {
    public void choseMenu(Integer menu, User user){

        switch (menu){
            case 1:
                BookListView bookListView = new BookListView();
                bookListView.showBookList(user);
                BookDetailView bookDetailView = new BookDetailView();
                bookDetailView.showBookDetail(null);
                break;
            case 2:
                CheckoutBookView checkoutBookView = new CheckoutBookView();
                checkoutBookView.checkoutBook(user.getId(), null);
                break;
            case 3:
                ReturnBookView returnBookView = new ReturnBookView();
                returnBookView.returnBook(user.getId(),null);
                break;
            case 4:
                MovieListView movieListView = new MovieListView();
                movieListView.showMovices();
                break;

            case 5:
                CheckoutMovieView checkoutMovieView = new CheckoutMovieView();
                checkoutMovieView.checkoutMovie(null);
                break;
            case 6:
                System.out.print("username: "+ user.getName()+ "| email:"+user.getEmail()+"| phone:"+user.getPhoneNum());
                break;
            default:
                ErrorView errorView = new ErrorView();
                errorView.invalidOption();
                break;
        }


    }


}
