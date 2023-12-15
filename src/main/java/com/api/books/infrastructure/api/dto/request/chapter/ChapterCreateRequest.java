package com.api.books.infrastructure.api.dto.request.chapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChapterCreateRequest {
  @NotNull
  private Long BookId;
  @NotNull
  private String title;
  @NotNull
  private String content;
}
