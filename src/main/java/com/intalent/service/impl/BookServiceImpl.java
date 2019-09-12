package com.intalent.service.impl;

import com.intalent.dao.IBookDao;
import com.intalent.entity.Book;
import com.intalent.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {

    //    使用 dao 中的接口
    @Autowired
    private IBookDao bookDao;


    @Override
    public List<Book> listAll() {
        return bookDao.listAll();
    }
}
