package com.api.books.infrastructure.api.mapper.book;

import com.api.books.domain.entity.Book;
import com.api.books.infrastructure.api.dto.response.book.BookResponse;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface BookResponseMapper {
  BookResponse toResponse(Book book);
  List<BookResponse> toResponse(List<Book> books);
}
