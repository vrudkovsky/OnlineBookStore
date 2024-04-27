package com.vpcomtek.onlinebookstore.service;

import com.vpcomtek.onlinebookstore.dto.BookDto;
import com.vpcomtek.onlinebookstore.dto.BookSearchParameters;
import com.vpcomtek.onlinebookstore.dto.CreateBookRequestDto;
import com.vpcomtek.onlinebookstore.exception.EntityNotFoundException;
import com.vpcomtek.onlinebookstore.mapper.BookMapper;
import com.vpcomtek.onlinebookstore.model.Book;
import com.vpcomtek.onlinebookstore.repository.BookRepository;
import com.vpcomtek.onlinebookstore.repository.BookSpecificationBuilder;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper mapper;
    private final BookSpecificationBuilder bookSpecificationBuilder;
    private final BookMapper bookMapper;

    @Override
    public BookDto createBook(CreateBookRequestDto requestDto) {
        Book book = mapper.toModel(requestDto);
        Book savedBook = bookRepository.save(book);
        return mapper.toDto(savedBook);
    }

    @Override
    public List<BookDto> getAll(Pageable pageable) {
        return bookRepository.findAll(pageable).stream()
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

    @Override
    public List<BookDto> search(BookSearchParameters searchParameters) {
        Specification<Book> bookSpecification = bookSpecificationBuilder.build(searchParameters);
        return bookRepository.findAll(bookSpecification).stream()
                .map(bookMapper::toDto)
                .toList();
    }
}
