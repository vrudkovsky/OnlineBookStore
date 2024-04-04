package com.vpcomtek.onlinebookstore.service;

import com.vpcomtek.onlinebookstore.dto.BookDto;
import com.vpcomtek.onlinebookstore.dto.CreateBookRequestDto;
import com.vpcomtek.onlinebookstore.exception.EntityNotFoundException;
import com.vpcomtek.onlinebookstore.mapper.BookMapper;
import com.vpcomtek.onlinebookstore.model.Book;
import com.vpcomtek.onlinebookstore.repository.BookRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper mapper;

    @Override
    public BookDto createBook(CreateBookRequestDto requestDto) {
        Book book = mapper.toModel(requestDto);
        Book savedBook = bookRepository.save(book);
        return mapper.toDto(savedBook);
    }

    @Override
    public List<BookDto> getAll() {
        return bookRepository.findAll().stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public BookDto getBookById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Cant' find book by id: " + id)
        );
        return mapper.toDto(book);
    }

    @Override
    public BookDto updateBook(Long id, CreateBookRequestDto requestDto) {
        if (bookRepository.existsById(id)) {
            Book book = mapper.toModel(requestDto);
            book.setId(id);
            return mapper.toDto(bookRepository.save(book));
        }
        throw new EntityNotFoundException("Book by id: " + id + " was not found");
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
