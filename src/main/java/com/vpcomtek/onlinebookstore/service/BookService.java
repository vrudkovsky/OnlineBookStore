package com.vpcomtek.onlinebookstore.service;

import com.vpcomtek.onlinebookstore.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List findAll();
}
