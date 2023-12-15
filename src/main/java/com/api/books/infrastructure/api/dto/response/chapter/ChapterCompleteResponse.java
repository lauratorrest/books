package com.api.books.infrastructure.api.dto.response.chapter;

import com.api.books.infrastructure.api.dto.response.paragraph.ParagraphResponse;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ChapterCompleteResponse {
  private Long id;
  private String title;
  private List<ParagraphResponse> paragraphResponses;
}
