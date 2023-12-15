package com.api.books.application.book;

import static org.mockito.Mockito.verify;

import com.api.books.application.chapter.process.ChapterDeleteApplication;
import com.api.books.domain.service.book.BookDeleteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BookDeleteApplicationTest {
  @InjectMocks
  private BookDeleteApplication bookDeleteApplication;
  @Mock
  private BookDeleteService bookDeleteService;
  @Mock
  private ChapterDeleteApplication chapterDeleteApplication;

  @Test
  void deleteBook() {
    bookDeleteApplication.deleteBook(1L);
    verify(chapterDeleteApplication).deleteAllChaptersByBookId(1L);
    verify(bookDeleteService).delete(1L);
  }
}