package com.jinli.view;

import com.jinli.service.BookService;
import com.jinli.util.StringUtil;

/**
 * Created by jinli on 8/5/16.
 */
public class ReturnBookView {
    BookService mainService = new BookService();
    public String returnBook(Integer userId, Integer bookId){
        String returnRes = null;
        while (true) {
            if (bookId == null) {
                System.out.println("please input the book id");
                bookId = StringUtil.getInputInt();
            }
            if (bookId == 0) {
                break;
            }

            if (mainService.updateBookStatus(userId, bookId, false)) {
                returnRes = "return success";
            }else {
                returnRes = "return failed";
            }
            bookId = null;
            System.out.println(returnRes);

        }
        return  returnRes;
    }

}
