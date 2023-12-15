package com.api.books.application.book;

import static org.mockito.Mockito.verify;

import com.api.books.domain.entity.Book;
import com.api.books.domain.service.book.BookUpdateService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BookUpdateApplicationTest {
  @InjectMocks
  private BookUpdateApplication bookUpdateApplication;
  @Mock
  private BookUpdateService bookUpdateService;

  @Test
  void updateBook() {
    Book book = new Book();
    bookUpdateApplication.updateBook(book);
    verify(bookUpdateService).updateBook(book);
  }
}