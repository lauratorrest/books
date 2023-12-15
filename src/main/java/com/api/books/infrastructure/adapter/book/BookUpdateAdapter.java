package com.api.books.infrastructure.adapter.book;

import com.api.books.domain.entity.Book;
import com.api.books.domain.service.book.BookUpdateService;
import com.api.books.infrastructure.repository.book.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class BookUpdateAdapter implements BookUpdateService {
  private final BookRepository bookRepository;

  @Override
  @Transactional
  public void updateBook(Book book) {
    bookRepository.update(book.getId(), book.getPictureUrl(), book.getTitle(), book.getPrologue(),
        book.getUpdatedDate());
  }

}
