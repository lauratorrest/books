package com.api.books.application.paragraph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.api.books.domain.entity.Paragraph;
import com.api.books.domain.service.paragraph.ParagraphGetService;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ParagraphGetApplicationTest {
  @Mock
  private ParagraphGetService paragraphGetService;
  @InjectMocks
  private ParagraphGetApplication paragraphGetApplication;

  @Test
  void getAllByChapterId() {
    List<Paragraph> expected = new ArrayList<>();
    when(paragraphGetService.getAllByChapterId(1L)).thenReturn(expected);
    List<Paragraph> actual = paragraphGetApplication.getAllByChapterId(1L);
    assertEquals(expected,actual);
  }
}