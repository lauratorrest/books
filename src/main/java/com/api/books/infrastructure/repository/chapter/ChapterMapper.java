package com.api.books.infrastructure.repository.chapter;

import com.api.books.domain.entity.Chapter;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface ChapterMapper {
  Chapter toEntity(ChapterDto chapterDto);
  List<Chapter> toEntity(List<ChapterDto> chapterDto);
  ChapterDto toDto(Chapter chapterDto);
}
