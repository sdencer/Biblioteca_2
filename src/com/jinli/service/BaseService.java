package com.jinli.service;

import com.jinli.dao.BaseDao;
import com.jinli.model.Book;

import java.util.List;

public interface BaseService extends BaseDao{
    public List getList();
}
