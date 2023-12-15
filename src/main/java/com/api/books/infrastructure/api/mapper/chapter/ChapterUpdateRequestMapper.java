package com.api.books.infrastructure.api.mapper.chapter;

import com.api.books.domain.entity.Chapter;
import com.api.books.infrastructure.api.dto.request.chapter.ChapterUpdateRequest;
import org.mapstruct.Mapper;

@Mapper
public interface ChapterUpdateRequestMapper {
  Chapter toEntity(ChapterUpdateRequest chapterUpdateRequest);
}
