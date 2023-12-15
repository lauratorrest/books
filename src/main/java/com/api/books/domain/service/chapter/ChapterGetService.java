package com.api.books.domain.service.chapter;

import com.api.books.domain.entity.Chapter;
import java.util.List;

public interface ChapterGetService {
  Chapter getById(Long id);
  List<Chapter> getAllByBookId(Long bookId);
}
