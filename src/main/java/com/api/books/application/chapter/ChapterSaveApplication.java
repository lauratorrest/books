package com.api.books.application.chapter;

import com.api.books.application.chapter.process.ParagraphsSaveProcess;
import com.api.books.domain.entity.Chapter;
import com.api.books.domain.service.chapter.ChapterSaveService;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ChapterSaveApplication {
  private final ChapterSaveService chapterSaveService;
  private final ParagraphsSaveProcess paragraphsSaveProcess;

  public void saveEntireChapter(Chapter chapter, String chapterContent){
    chapter.setCreatedDate(LocalDateTime.now());
    Chapter savedChapter = chapterSaveService.saveChapter(chapter);
    paragraphsSaveProcess.saveParagraphs(savedChapter,chapterContent);
  }
}
