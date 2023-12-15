package com.api.books.infrastructure.adapter.chapter;

import com.api.books.domain.entity.Chapter;
import com.api.books.domain.service.chapter.ChapterGetService;
import com.api.books.infrastructure.repository.chapter.ChapterDto;
import com.api.books.infrastructure.repository.chapter.ChapterMapper;
import com.api.books.infrastructure.repository.chapter.ChapterRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ChapterGetAdapter implements ChapterGetService {
  private final ChapterRepository chapterRepository;
  private final ChapterMapper chapterMapper;

  @Override
  public Chapter getById(Long id) {
    Optional<ChapterDto> chapterDto = chapterRepository.findById(id);
    return chapterDto.map(chapterMapper::toEntity).orElseThrow(RuntimeException::new);
  }

  @Override
  public List<Chapter> getAllByBookId(Long bookId) {
    return chapterMapper.toEntity(chapterRepository.getByBookId(bookId));
  }
}
