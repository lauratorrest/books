package com.api.books.domain.service.paragraph;

public interface ParagraphDeleteService {
  void deleteByChapterId(Long chapterId);
  void deleteAllBookParagraphs(Long bookId);
}
