package com.api.books.application.chapter;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.api.books.application.chapter.process.ParagraphsSaveProcess;
import com.api.books.domain.entity.Chapter;
import com.api.books.domain.service.chapter.ChapterSaveService;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ChapterSaveApplicationTest {
  @Mock
  private ChapterSaveService chapterSaveService;
  @Mock
  private ParagraphsSaveProcess paragraphsSaveProcess;
  @InjectMocks
  private ChapterSaveApplication chapterSaveApplication;

  @Test
  void saveEntireChapter() {
    Chapter chapter = new Chapter();
    chapter.setCreatedDate(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES));
    String chapterContent = "Content";
    when(chapterSaveService.saveChapter(chapter)).thenReturn(chapter);
    chapterSaveApplication.saveEntireChapter(chapter,chapterContent);
    verify(paragraphsSaveProcess).saveParagraphs(chapter,chapterContent);
  }
}