package com.api.books.infrastructure.api.mapper.book;

import com.api.books.domain.entity.Book;
import com.api.books.infrastructure.api.dto.response.book.BookDetailedResponse;
import org.mapstruct.Mapper;

@Mapper
public interface BookDetailedResponseMapper {
  BookDetailedResponse toResponse(Book book);
}
