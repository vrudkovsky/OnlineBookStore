package com.vpcomtek.onlinebookstore.service;

import com.vpcomtek.onlinebookstore.dto.BookDto;
import com.vpcomtek.onlinebookstore.dto.BookSearchParameters;
import com.vpcomtek.onlinebookstore.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto createBook(CreateBookRequestDto requestDto);

    List<BookDto> getAll();

    BookDto getBookById(Long id);

    BookDto updateBook(Long id, CreateBookRequestDto requestDto);

    void deleteById(Long id);

    List<BookDto> search(BookSearchParameters searchParameters);
}
