package com.vpcomtek.onlinebookstore.repository;

import com.vpcomtek.onlinebookstore.dto.BookSearchParameters;
import org.springframework.data.jpa.domain.Specification;

public interface SpecificationBuilder<T> {
    Specification<T> build(BookSearchParameters params);
}
