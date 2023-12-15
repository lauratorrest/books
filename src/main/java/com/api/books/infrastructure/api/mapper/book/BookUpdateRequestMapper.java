package com.api.books.infrastructure.api.mapper.book;

import com.api.books.domain.entity.Book;
import com.api.books.infrastructure.api.dto.request.book.BookUpdateRequest;
import org.mapstruct.Mapper;

@Mapper
public interface BookUpdateRequestMapper {
  Book toEntity(BookUpdateRequest bookUpdateRequest);
}
