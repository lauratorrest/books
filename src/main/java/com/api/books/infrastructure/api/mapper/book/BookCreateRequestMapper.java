package com.api.books.infrastructure.api.mapper.book;

import com.api.books.domain.entity.Book;
import com.api.books.infrastructure.api.dto.request.book.BookCreateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface BookCreateRequestMapper {
  @Mapping(target = "account.id", source = "accountId")
  Book toEntity(BookCreateRequest bookCreateRequest);
}
