package com.api.books.domain.entity;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comment {
  private Long id;
  private String content;
  private Account account;
  private Paragraph paragraph;
  private LocalDateTime createdDate;
}
