package com.api.books.infrastructure.api.mapper.paragraph;

import com.api.books.domain.entity.Paragraph;
import com.api.books.infrastructure.api.dto.response.paragraph.ParagraphResponse;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface ParagraphResponseMapper {
  ParagraphResponse toResponse(Paragraph paragraph);
  List<ParagraphResponse> toResponse(List<Paragraph> paragraph);
}
