package com.api.books.application.paragraph;

import static org.mockito.Mockito.verify;

import com.api.books.domain.entity.Chapter;
import com.api.books.domain.entity.Paragraph;
import com.api.books.domain.service.paragraph.ParagraphSaveService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ParagraphSaveApplicationTest {
  @Mock
  private ParagraphSaveService paragraphSaveService;
  @InjectMocks
  private ParagraphSaveApplication paragraphSaveApplication;

  @Test
  void saveParagraphs() {
    List<String> paragraphs = List.of("Paragraph 1", "Paragraph 2");
    Chapter chapter = new Chapter();
    paragraphSaveApplication.saveParagraphs(paragraphs,chapter);

    for(int i = 0 ; i < paragraphs.size() ; i++){
      Paragraph paragraph = new Paragraph();
      paragraph.setChapter(chapter);
      paragraph.setContent(paragraphs.get(i));
      paragraph.setOrderSequence(i+1);
      verify(paragraphSaveService).saveParagraph(paragraph);
    }
  }
}