package com.api.books.application.chapter;

import com.api.books.domain.entity.Chapter;
import com.api.books.domain.service.chapter.ChapterGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ChapterGetApplication {
  private final ChapterGetService chapterGetService;

  public Chapter getById(Long id){
    return chapterGetService.getById(id);
  }

  public List<Chapter> getAllByBookId(Long bookId){
    return chapterGetService.getAllByBookId(bookId);
  }

}
