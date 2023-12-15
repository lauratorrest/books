package com.api.books.infrastructure.repository.comment;

import com.api.books.domain.entity.Comment;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface CommentMapper {
  List<Comment> toEntity(List<CommentDto> commentDtos);
  CommentDto toDto(Comment comment);
}
