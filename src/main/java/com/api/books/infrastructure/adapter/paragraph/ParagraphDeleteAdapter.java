package com.api.books.infrastructure.adapter.paragraph;

import com.api.books.domain.service.paragraph.ParagraphDeleteService;
import com.api.books.infrastructure.repository.paragraph.ParagraphRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class ParagraphDeleteAdapter implements ParagraphDeleteService {
  private final ParagraphRepository paragraphRepository;

  @Transactional
  @Override
  public void deleteByChapterId(Long chapterId) {
    paragraphRepository.deleteByChapterId(chapterId);
  }

  @Override
  @Transactional
  public void deleteAllBookParagraphs(Long bookId) {
    paragraphRepository.deleteAllByBookId(bookId);
  }
}
