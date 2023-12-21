package com.api.books.application.chapter;

import static org.mockito.Mockito.verify;

import com.api.books.application.chapter.process.ParagraphsUpdateProcess;
import com.api.books.domain.entity.Chapter;
import com.api.books.domain.service.chapter.ChapterUpdateService;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ChapterUpdateApplicationTest {
  @Mock
  private ChapterUpdateService chapterUpdateService;
  @Mock
  private ParagraphsUpdateProcess paragraphsUpdateProcess;
  @InjectMocks
  private ChapterUpdateApplication chapterUpdateApplication;

  @Test
  void updateChapter() {
    Chapter chapter = new Chapter();
    chapter.setUpdatedDate(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES));
    String chapterContent = "Content";
    chapterUpdateApplication.updateChapter(chapter,chapterContent);
    verify(chapterUpdateService).update(chapter);
    verify(paragraphsUpdateProcess).updateParagraphs(chapter,chapterContent);
  }
}