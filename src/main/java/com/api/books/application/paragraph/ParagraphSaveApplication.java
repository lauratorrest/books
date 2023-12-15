package com.api.books.application.paragraph;

import com.api.books.domain.entity.Chapter;
import com.api.books.domain.entity.Paragraph;
import com.api.books.domain.service.paragraph.ParagraphSaveService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ParagraphSaveApplication {
  private final ParagraphSaveService paragraphSaveService;

  public void saveParagraphs(List<String> paragraphs, Chapter chapter){
    for(int i = 0 ; i < paragraphs.size() ; i++){
      Paragraph paragraph = new Paragraph();
      paragraph.setChapter(chapter);
      paragraph.setContent(paragraphs.get(i));
      paragraph.setOrderSequence(i+1);
      paragraphSaveService.saveParagraph(paragraph);
    }
  }
}
