package com.api.books.domain.service.comment;

import com.api.books.domain.entity.Comment;
import java.util.List;

public interface CommentGetService {
  List<Comment> getAllByParagraphId(Long paragraphId);
}
