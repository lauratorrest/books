package com.api.books.application.paragraph;

import com.api.books.domain.entity.Paragraph;
import com.api.books.domain.service.paragraph.ParagraphGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ParagraphGetApplication {
  private final ParagraphGetService paragraphGetService;

  public List<Paragraph> getAllByChapterId(Long chapterId){
    return paragraphGetService.getAllByChapterId(chapterId);
  }
}
