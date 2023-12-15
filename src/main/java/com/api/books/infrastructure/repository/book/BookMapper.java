package com.api.books.infrastructure.repository.book;

import com.api.books.domain.entity.Book;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {
  Book toEntity(BookDto bookDto);
  List<Book> toEntity(List<BookDto> bookDto);
  BookDto toDto(Book book);
}
