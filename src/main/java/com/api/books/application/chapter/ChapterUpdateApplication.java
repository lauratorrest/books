package com.api.books.application.chapter;

import com.api.books.application.chapter.process.ParagraphsUpdateProcess;
import com.api.books.domain.entity.Chapter;
import com.api.books.domain.service.chapter.ChapterUpdateService;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ChapterUpdateApplication {
  private final ChapterUpdateService chapterUpdateService;
  private final ParagraphsUpdateProcess paragraphsUpdateProcess;

  public void updateChapter(Chapter chapter, String chapterContent){
    chapter.setUpdatedDate(LocalDateTime.now());
    chapterUpdateService.update(chapter);
    paragraphsUpdateProcess.updateParagraphs(chapter,chapterContent);
  }
}
