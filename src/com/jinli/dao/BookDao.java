package com.jinli.dao;

import com.jinli.db.BookDB;
import com.jinli.model.Book;

import java.util.List;

public class BookDao implements BaseDao {

    @Override
    public List<Book> getList() {
        return BookDB.getBookList();
    }
}


