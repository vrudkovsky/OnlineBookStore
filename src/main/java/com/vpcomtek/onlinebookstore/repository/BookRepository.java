package com.vpcomtek.onlinebookstore.repository;

import com.vpcomtek.onlinebookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
