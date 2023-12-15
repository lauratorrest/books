package com.api.books.domain.service.paragraph;

import com.api.books.domain.entity.Paragraph;
import java.util.List;

public interface ParagraphGetService {
  List<Paragraph> getAllByChapterId(Long bookId);
}
