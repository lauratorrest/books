package com.api.books.infrastructure.api.mapper.chapter;

import com.api.books.domain.entity.Chapter;
import com.api.books.infrastructure.api.dto.response.chapter.ChapterListResponse;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface ChapterListResponseMapper {
  ChapterListResponse toResponse(Chapter chapter);
  List<ChapterListResponse> toResponse(List<Chapter> chapter);
}
