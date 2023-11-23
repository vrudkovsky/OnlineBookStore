package com.vpcomtek.onlinebookstore.service;

import com.vpcomtek.onlinebookstore.dto.BookDto;
import com.vpcomtek.onlinebookstore.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto createBook(CreateBookRequestDto requestDto);

    List<BookDto> getAll();

    BookDto getBookById(Long id);
}
