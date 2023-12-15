package com.api.books.application.chapter.process;

import com.api.books.domain.service.chapter.ChapterDeleteService;
import com.api.books.domain.service.paragraph.ParagraphDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ChapterDeleteApplication {
  private final ChapterDeleteService chapterDeleteService;
  private final ParagraphDeleteService paragraphDeleteService;

  public void deleteChapterById(Long id){
    paragraphDeleteService.deleteByChapterId(id);
    chapterDeleteService.delete(id);
  }

  public void deleteAllChaptersByBookId(Long bookId){
    paragraphDeleteService.deleteAllBookParagraphs(bookId);
    chapterDeleteService.deleteAllBookChapters(bookId);
  }
}
