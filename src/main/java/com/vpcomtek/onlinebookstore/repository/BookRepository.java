package com.vpcomtek.onlinebookstore.repository;

import com.vpcomtek.onlinebookstore.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List findAll();
}
