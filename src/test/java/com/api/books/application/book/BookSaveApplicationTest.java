package com.api.books.application.book;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.api.books.domain.entity.Book;
import com.api.books.domain.service.book.BookSaveService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BookSaveApplicationTest {
  @Mock
  private BookSaveService bookSaveService;

  @InjectMocks
  private BookSaveApplication bookSaveApplication;

  @Test
  void saveBook() {
    Book expected = new Book();

    when(bookSaveService.saveBook(expected)).thenReturn(expected);

    Book actual = bookSaveApplication.saveBook(expected);
    assertEquals(expected, actual);
  }

}