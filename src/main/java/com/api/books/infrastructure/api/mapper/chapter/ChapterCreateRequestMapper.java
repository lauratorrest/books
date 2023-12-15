package com.api.books.infrastructure.api.mapper.chapter;

import com.api.books.domain.entity.Chapter;
import com.api.books.infrastructure.api.dto.request.chapter.ChapterCreateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ChapterCreateRequestMapper {
  @Mapping(target = "book.id", source = "bookId")
  Chapter toEntity(ChapterCreateRequest chapterCreateRequest);
}
