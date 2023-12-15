package com.api.books.infrastructure.repository.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CommentRepository extends JpaRepository<CommentDto,Long> {
  @Query("DELETE FROM CommentDto cd WHERE cd.paragraph.id = :paragraphId")
  @Modifying
  void deleteAllByParagraphId(Long paragraphId);
}
