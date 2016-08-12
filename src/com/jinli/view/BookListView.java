package com.jinli.view;

import com.jinli.model.Book;
import com.jinli.model.User;
import com.jinli.service.BookService;

import java.util.List;

/**
 * Created by jinli on 8/5/16.
 */
public class BookListView {
    BookService mainService = new BookService();
    public List<Book> showBookList(User user){
        List<Book> bookList = mainService.getList();
        System.out.println("id     | bookname             | isCheckout");
        for (int bookIndex = 0; bookIndex < bookList.size(); bookIndex ++) {
            Book book = bookList.get(bookIndex);
            System.out.print(" " + String.format("%-5s", book.getId())+ " | "
                    + String.format("%-20s", book.getName()) +" | "
                    + String.format("%-10s", book.isCheckout()) + "\n");
            if (user.getLevel() == 1) {
                System.out.println(String.format("%-20s", user.getName()));
            }
        }
        return bookList;
    }
}
