package com.api.books.infrastructure.adapter.book;

import com.api.books.domain.entity.Book;
import com.api.books.domain.service.book.BookSaveService;
import com.api.books.infrastructure.repository.book.BookMapper;
import com.api.books.infrastructure.repository.book.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookSaveAdapter implements BookSaveService {
  private final BookRepository bookRepository;
  private final BookMapper bookMapper;

  @Override
  public Book saveBook(Book book) {
    return bookMapper.toEntity(bookRepository.save(bookMapper.toDto(book)));
  }
}
