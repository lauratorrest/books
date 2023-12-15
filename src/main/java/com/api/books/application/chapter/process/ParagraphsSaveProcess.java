package com.api.books.application.chapter.process;

import com.api.books.application.paragraph.ParagraphSaveApplication;
import com.api.books.domain.entity.Chapter;
import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ParagraphsSaveProcess {
  private final ParagraphSaveApplication paragraphSaveApplication;

  public void saveParagraphs(Chapter chapter, String chapterContent){
    if(!chapterContent.isEmpty()){
      List<String> paragraphsList = Arrays.asList(chapterContent.split("\n\n"));
      paragraphSaveApplication.saveParagraphs(paragraphsList, chapter);
    }
  }
}
