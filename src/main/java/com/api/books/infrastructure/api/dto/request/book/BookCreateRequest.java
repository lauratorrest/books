package com.api.books.infrastructure.api.dto.request.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookCreateRequest {
  @NotNull
  private String pictureUrl;
  @NotNull
  private String title;
  @NotNull
  private String prologue;
  @NotNull
  private Long accountId;
}
