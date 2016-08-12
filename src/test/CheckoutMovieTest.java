package test;

import com.jinli.view.CheckoutBookView;
import com.jinli.view.CheckoutMovieView;
import org.junit.Assert;
import org.junit.Test;

public class CheckoutMovieTest {
    @Test
    public void checkout(){
        CheckoutMovieView checkoutMovieView = new CheckoutMovieView();
        Assert.assertEquals("checkout failed", checkoutMovieView.checkoutMovie(1));
        Assert.assertEquals("checkout success", checkoutMovieView.checkoutMovie(2));
    }
}
