package test;

import com.jinli.db.BookDB;
import com.jinli.model.Book;
import com.jinli.model.User;
import com.jinli.view.BookListView;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class BookListTest {

    @Test
    public void testBookList(){
        BookListView bookListView = new BookListView();
        List<Book> books = BookDB.getBookList();
        User user = new User();
        user.setId(1);
        user.setPassword("123");
        Assert.assertEquals(books, bookListView.showBookList(user));
    }

}
