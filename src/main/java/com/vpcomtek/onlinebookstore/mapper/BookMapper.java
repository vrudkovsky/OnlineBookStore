package com.vpcomtek.onlinebookstore.mapper;

import com.vpcomtek.onlinebookstore.config.MapperConfig;
import com.vpcomtek.onlinebookstore.dto.BookDto;
import com.vpcomtek.onlinebookstore.dto.CreateBookRequestDto;
import com.vpcomtek.onlinebookstore.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto requestDto);
}
