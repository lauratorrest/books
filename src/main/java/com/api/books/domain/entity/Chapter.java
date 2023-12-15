package com.api.books.domain.entity;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Chapter {
  private Long id;
  private String title;
  private Book book;
  private LocalDateTime createdDate;
  private LocalDateTime updatedDate;
}
