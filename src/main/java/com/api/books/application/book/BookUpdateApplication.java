package com.api.books.application.book;

import com.api.books.domain.entity.Book;
import com.api.books.domain.service.book.BookUpdateService;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookUpdateApplication {
  private final BookUpdateService bookUpdateService;

  public void updateBook(Book book){
    book.setUpdatedDate(LocalDateTime.now());
    bookUpdateService.updateBook(book);
  }
}
