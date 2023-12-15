package com.api.books.application.book;

import com.api.books.domain.entity.Book;
import com.api.books.domain.service.book.BookSaveService;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookSaveApplication {
  private final BookSaveService bookSaveService;

  public Book saveBook(Book book){
    book.setCreatedDate(LocalDateTime.now());
    return bookSaveService.saveBook(book);
  }
}
