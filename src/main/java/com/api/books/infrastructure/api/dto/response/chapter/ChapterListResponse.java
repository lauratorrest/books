package com.api.books.infrastructure.api.dto.response.chapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChapterListResponse {
  private Long id;
  private String title;
}
