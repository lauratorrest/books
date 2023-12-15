package com.api.books.domain.entity;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
  private Long id;
  private String pictureUrl;
  private String title;
  private String prologue;
  private Account account;
  private LocalDateTime createdDate;
  private LocalDateTime updatedDate;
}
