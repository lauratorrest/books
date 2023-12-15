package com.api.books.application.chapter.process;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

import com.api.books.application.paragraph.ParagraphSaveApplication;
import com.api.books.domain.entity.Chapter;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ParagraphsSaveProcessTest {
  @Mock
  private ParagraphSaveApplication paragraphSaveApplication;

  @InjectMocks
  private ParagraphsSaveProcess paragraphsSaveProcess;

  @Test
  void saveParagraphs() {
    Chapter chapter = new Chapter();
    String chapterContent = "Paragraph 1\n\nParagraph 2\n\nParagraph 3";

    paragraphsSaveProcess.saveParagraphs(chapter, chapterContent);

    verify(paragraphSaveApplication).saveParagraphs(any(List.class), any(Chapter.class));
  }
}