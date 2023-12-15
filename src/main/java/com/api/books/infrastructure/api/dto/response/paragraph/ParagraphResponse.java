package com.api.books.infrastructure.api.dto.response.paragraph;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ParagraphResponse {
  private Long id;
  private String content;
}
