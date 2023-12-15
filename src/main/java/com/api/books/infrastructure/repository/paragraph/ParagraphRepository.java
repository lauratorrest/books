package com.api.books.infrastructure.repository.paragraph;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ParagraphRepository extends JpaRepository<ParagraphDto,Long> {
  @Query("SELECT pd FROM ParagraphDto pd WHERE pd.chapter.id = :chapterId ORDER BY pd.orderSequence")
  List<ParagraphDto>  getAllByChapterId(Long chapterId);

  @Query("DELETE FROM ParagraphDto pd WHERE pd.chapter.id = :chapterId")
  @Modifying
  void deleteByChapterId(Long chapterId);

  @Query("DELETE FROM ParagraphDto pd WHERE pd.chapter.book.id = :bookId")
  @Modifying
  void deleteAllByBookId(Long bookId);
}
