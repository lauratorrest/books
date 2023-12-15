package com.api.books.infrastructure.api.dto.response.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookResponse {
  private Long id;
  private String pictureUrl;
  private String title;
}
