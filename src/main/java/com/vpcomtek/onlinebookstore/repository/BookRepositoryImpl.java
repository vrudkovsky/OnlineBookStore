package com.vpcomtek.onlinebookstore.repository;

import com.vpcomtek.onlinebookstore.model.Book;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements BookRepository {

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }
}
