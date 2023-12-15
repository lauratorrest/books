package com.api.books.infrastructure.api.dto.response.book;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDetailedResponse {
  private String pictureUrl;
  private String title;
  private String prologue;
  private LocalDateTime createdDate;
  private LocalDateTime updatedDate;
}
