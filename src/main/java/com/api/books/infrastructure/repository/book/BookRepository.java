package com.api.books.infrastructure.repository.book;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<BookDto,Long> {
  @Query("SELECT bd FROM BookDto bd WHERE bd.account.id = :accountId")
  List<BookDto> findAllByAuthor(Long accountId);

  @Query("UPDATE BookDto bd SET bd.pictureUrl = :pictureUrl, bd.title = :title, "
      + "bd.prologue = :prologue, bd.updatedDate = :updatedDate WHERE bd.id = :id")
  @Modifying
  void update(Long id, String pictureUrl, String title, String prologue, LocalDateTime updatedDate);
}
