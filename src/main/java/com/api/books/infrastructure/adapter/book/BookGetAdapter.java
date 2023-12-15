package com.api.books.infrastructure.adapter.book;

import com.api.books.domain.entity.Book;
import com.api.books.domain.service.book.BookGetService;
import com.api.books.infrastructure.repository.book.BookDto;
import com.api.books.infrastructure.repository.book.BookMapper;
import com.api.books.infrastructure.repository.book.BookRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookGetAdapter implements BookGetService {
  private final BookRepository bookRepository;
  private final BookMapper bookMapper;

  @Override
  public Book getById(Long id) {
    Optional<BookDto> bookDto = bookRepository.findById(id);
    return bookDto.map(bookMapper::toEntity).orElseThrow(RuntimeException::new);
  }

  @Override
  public List<Book> getAll() {
    return bookMapper.toEntity(bookRepository.findAll());
  }

  @Override
  public List<Book> getAllByAccountId(Long accountId) {
    return bookMapper.toEntity(bookRepository.findAllByAuthor(accountId));
  }
}
