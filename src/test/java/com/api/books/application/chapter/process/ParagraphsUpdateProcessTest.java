package com.api.books.application.chapter.process;

import static org.mockito.Mockito.verify;

import com.api.books.application.paragraph.ParagraphSaveApplication;
import com.api.books.domain.entity.Chapter;
import com.api.books.domain.service.paragraph.ParagraphDeleteService;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ParagraphsUpdateProcessTest {
  @Mock
  private ParagraphDeleteService paragraphDeleteService;
  @Mock
  private ParagraphSaveApplication paragraphSaveApplication;
  @InjectMocks
  private ParagraphsUpdateProcess paragraphsUpdateProcess;

  @Test
  void updateParagraphs() {
    Chapter chapter = new Chapter();
    chapter.setId(1L);
    String chapterContent = "Content";
    paragraphsUpdateProcess.updateParagraphs(chapter,chapterContent);
    verify(paragraphDeleteService).deleteByChapterId(chapter.getId());
    List<String> paragraphsList = Arrays.asList(chapterContent.split("\n\n"));
    verify(paragraphSaveApplication).saveParagraphs(paragraphsList,chapter);
  }
}