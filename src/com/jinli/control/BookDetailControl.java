package com.jinli.control;

import com.jinli.service.BookService;

public class BookDetailControl {

    public String getBookDetailById(Integer bookId){
        BookService mainService = new BookService();
        String bookDetail = mainService.getBookDetailsById(bookId);
        if (bookDetail == null) {
            return "err bookId";
        }
        return bookDetail;
    }

}
