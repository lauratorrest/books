package com.api.books.domain.service.chapter;

public interface ChapterDeleteService {
  void delete(Long id);
  void deleteAllBookChapters(Long bookId);
}
