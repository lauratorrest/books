package com.api.books.infrastructure.adapter.book;

import com.api.books.domain.service.book.BookDeleteService;
import com.api.books.infrastructure.repository.book.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class BookDeleteAdapter implements BookDeleteService {
  private final BookRepository bookRepository;

  @Transactional
  @Override
  public void delete(Long id) {
    bookRepository.deleteById(id);
  }
}
