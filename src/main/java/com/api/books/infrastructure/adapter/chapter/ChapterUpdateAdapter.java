package com.api.books.infrastructure.adapter.chapter;

import com.api.books.domain.entity.Chapter;
import com.api.books.domain.service.chapter.ChapterUpdateService;
import com.api.books.infrastructure.repository.chapter.ChapterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class ChapterUpdateAdapter implements ChapterUpdateService {
  private final ChapterRepository chapterRepository;

  @Override
  @Transactional
  public void update(Chapter chapter) {
    chapterRepository.update(chapter.getId(), chapter.getTitle(), chapter.getUpdatedDate());
  }
}
