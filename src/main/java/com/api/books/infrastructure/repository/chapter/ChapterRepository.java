package com.api.books.infrastructure.repository.chapter;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ChapterRepository extends JpaRepository<ChapterDto,Long> {
  @Query("SELECT cd FROM ChapterDto cd WHERE cd.book.id = :bookId ORDER BY cd.createdDate ASC")
  List<ChapterDto> getByBookId(Long bookId);

  @Query("UPDATE ChapterDto cd SET cd.title = :title, cd.updatedDate = :updatedDate "
      + "WHERE cd.id = :id")
  @Modifying
  void update(Long id, String title, LocalDateTime updatedDate);

  @Modifying
  @Query("DELETE ChapterDto cd WHERE cd.book.id = :bookId")
  void deleteByBookId(Long bookId);
}
