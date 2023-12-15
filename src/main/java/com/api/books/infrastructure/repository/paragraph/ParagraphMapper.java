package com.api.books.infrastructure.repository.paragraph;

import com.api.books.domain.entity.Paragraph;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface ParagraphMapper {
  Paragraph toEntity(ParagraphDto paragraphDto);
  List<Paragraph> toEntity(List<ParagraphDto> paragraphDto);
  ParagraphDto toDto(Paragraph paragraph);
}
