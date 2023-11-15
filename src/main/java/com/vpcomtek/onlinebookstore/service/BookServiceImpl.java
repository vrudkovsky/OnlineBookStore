package com.vpcomtek.onlinebookstore.service;

import com.vpcomtek.onlinebookstore.model.Book;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }
}
