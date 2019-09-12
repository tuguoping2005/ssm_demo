package com.intalent.dao;

import com.intalent.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookDao {
    List<Book> listAll();
}
