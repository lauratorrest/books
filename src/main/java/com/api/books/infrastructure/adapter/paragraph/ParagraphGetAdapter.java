package com.api.books.infrastructure.adapter.paragraph;

import com.api.books.domain.entity.Paragraph;
import com.api.books.domain.service.paragraph.ParagraphGetService;
import com.api.books.infrastructure.repository.paragraph.ParagraphMapper;
import com.api.books.infrastructure.repository.paragraph.ParagraphRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ParagraphGetAdapter implements ParagraphGetService {
  private final ParagraphRepository paragraphRepository;
  private final ParagraphMapper paragraphMapper;

  @Override
  public List<Paragraph> getAllByChapterId(Long bookId) {
    return paragraphMapper.toEntity(paragraphRepository.getAllByChapterId(bookId));
  }
}
