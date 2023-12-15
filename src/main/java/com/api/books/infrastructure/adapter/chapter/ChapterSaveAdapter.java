package com.api.books.infrastructure.adapter.chapter;

import com.api.books.domain.entity.Chapter;
import com.api.books.domain.service.chapter.ChapterSaveService;
import com.api.books.infrastructure.repository.chapter.ChapterMapper;
import com.api.books.infrastructure.repository.chapter.ChapterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ChapterSaveAdapter implements ChapterSaveService {
  private final ChapterRepository chapterRepository;
  private final ChapterMapper chapterMapper;

  @Override
  public Chapter saveChapter(Chapter chapter) {
    return chapterMapper.toEntity(chapterRepository.save(chapterMapper.toDto(chapter)));
  }
}
