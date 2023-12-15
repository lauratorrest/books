package com.api.books.infrastructure.adapter.chapter;

import com.api.books.domain.service.chapter.ChapterDeleteService;
import com.api.books.infrastructure.repository.chapter.ChapterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class ChapterDeleteAdapter implements ChapterDeleteService {
  private final ChapterRepository chapterRepository;

  @Transactional
  @Override
  public void delete(Long id) {
    chapterRepository.deleteById(id);
  }

  @Transactional
  @Override
  public void deleteAllBookChapters(Long bookId) {
    chapterRepository.deleteByBookId(bookId);
  }
}
