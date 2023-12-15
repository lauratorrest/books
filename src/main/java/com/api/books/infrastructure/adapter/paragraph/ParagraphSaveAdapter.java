package com.api.books.infrastructure.adapter.paragraph;

import com.api.books.domain.entity.Paragraph;
import com.api.books.domain.service.paragraph.ParagraphSaveService;
import com.api.books.infrastructure.repository.paragraph.ParagraphMapper;
import com.api.books.infrastructure.repository.paragraph.ParagraphRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ParagraphSaveAdapter implements ParagraphSaveService {
  private final ParagraphRepository paragraphRepository;
  private final ParagraphMapper paragraphMapper;

  @Override
  public void saveParagraph(Paragraph paragraph) {
    paragraphRepository.save(paragraphMapper.toDto(paragraph));
  }
}
