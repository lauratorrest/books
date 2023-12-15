package com.api.books.application.chapter.process;

import com.api.books.application.paragraph.ParagraphSaveApplication;
import com.api.books.domain.entity.Chapter;
import com.api.books.domain.service.paragraph.ParagraphDeleteService;
import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ParagraphsUpdateProcess {
  private final ParagraphDeleteService paragraphDeleteService;
  private final ParagraphSaveApplication paragraphSaveApplication;

  public void updateParagraphs(Chapter chapter, String chapterContent){
    paragraphDeleteService.deleteByChapterId(chapter.getId());
    if(!chapterContent.isEmpty()){
      List<String> paragraphsList = Arrays.asList(chapterContent.split("\n\n"));
      paragraphSaveApplication.saveParagraphs(paragraphsList, chapter);
    }
  }
}
