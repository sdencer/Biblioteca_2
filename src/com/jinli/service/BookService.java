package com.jinli.service;

import com.jinli.dao.BookDao;
import com.jinli.db.BookDB;
import com.jinli.model.Book;

import java.util.List;
import java.util.Map;

/**
 * Created by jinli on 8/4/16.
 */
public class BookService implements BaseService {
    BookDao bookDao = new BookDao();
    public List<Book> getList(){
        return bookDao.getList();
    }

    public boolean updateBookStatus(Integer userId, Integer bookId, boolean isCheckout){
        Map bookMap = BookDB.getBookMap();
        if (bookMap.containsKey(bookId)){
            Book book = (Book) bookMap.get(bookId);
            if (isCheckout) {
                if (book.isCheckout()) {
                    return false;
                }
                book.setCheckout(isCheckout);
                book.setUserId(userId);
            } else {
                if (!book.isCheckout()){
                    return false;
                }
                book.setCheckout(isCheckout);
            }
            return true;
        }
        return false;
    }

    public String getBookDetailsById(Integer bookId){
        Map bookMap = BookDB.getBookMap();
        if (bookMap.containsKey(bookId)){
            Book book = (Book) bookMap.get(bookId);
            return book.getDetails();
        }
        return  null;

    }


}
