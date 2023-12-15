package com.api.books.application.chapter.process;

import static org.mockito.Mockito.verify;

import com.api.books.domain.service.chapter.ChapterDeleteService;
import com.api.books.domain.service.paragraph.ParagraphDeleteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ChapterDeleteApplicationTest {
  @InjectMocks
  private ChapterDeleteApplication chapterDeleteApplication;
  @Mock
  private ChapterDeleteService chapterDeleteService;
  @Mock
  private ParagraphDeleteService paragraphDeleteService;

  @Test
  void deleteChapterById() {
    chapterDeleteApplication.deleteChapterById(1L);
    verify(paragraphDeleteService).deleteByChapterId(1L);
    verify(chapterDeleteService).delete(1L);
  }

  @Test
  void deleteAllChaptersByBookId() {
    chapterDeleteApplication.deleteAllChaptersByBookId(1L);
    verify(paragraphDeleteService).deleteAllBookParagraphs(1L);
    verify(chapterDeleteService).deleteAllBookChapters(1L);
  }
}