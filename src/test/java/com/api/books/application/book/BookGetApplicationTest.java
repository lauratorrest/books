package com.api.books.application.book;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.api.books.domain.entity.Book;
import com.api.books.domain.service.book.BookGetService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BookGetApplicationTest {
  @Mock
  private BookGetService bookGetService;

  @InjectMocks
  private BookGetApplication bookGetApplication;

  @Test
  void getById() {
    Book expected = new Book();

    when(bookGetService.getById(1L)).thenReturn(expected);

    Book actual = bookGetApplication.getById(1L);
    assertEquals(expected, actual);
  }

  @Test
  void getAll() {
    Book book = new Book();
    List<Book> expected = List.of(book);

    when(bookGetService.getAll()).thenReturn(expected);

    List<Book> actual = bookGetApplication.getAll();
    assertEquals(expected, actual);
  }

  @Test
  void getAllByAuthor() {
    Long authorId = 1L;
    Book book = new Book();
    List<Book> expected = List.of(book);

    when(bookGetService.getAllByAccountId(authorId)).thenReturn(expected);

    List<Book> actual = bookGetApplication.getAllByAuthor(authorId);
    assertEquals(expected, actual);
  }

}