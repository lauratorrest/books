package com.api.books.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paragraph {
  private Long id;
  private String content;
  private Chapter chapter;
  private Integer orderSequence;
}
