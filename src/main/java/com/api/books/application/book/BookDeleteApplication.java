package com.api.books.application.book;

import com.api.books.application.chapter.process.ChapterDeleteApplication;
import com.api.books.domain.service.book.BookDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookDeleteApplication {
  private final BookDeleteService bookDeleteService;
  private final ChapterDeleteApplication chapterDeleteApplication;

  public void deleteBook(Long id){
    chapterDeleteApplication.deleteAllChaptersByBookId(id);
    bookDeleteService.delete(id);
  }
}
