package com.api.books.application.chapter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.api.books.domain.entity.Chapter;
import com.api.books.domain.service.chapter.ChapterGetService;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ChapterGetApplicationTest {
  @Mock
  private ChapterGetService chapterGetService;
  @InjectMocks
  private ChapterGetApplication chapterGetApplication;

  @Test
  void getById() {
    Chapter expected = new Chapter();
    when(chapterGetService.getById(1L)).thenReturn(expected);
    Chapter actual = chapterGetApplication.getById(1L);
    assertEquals(expected,actual);
  }

  @Test
  void getAllByBookId() {
    List<Chapter> expected = new ArrayList<>();
    when(chapterGetService.getAllByBookId(1L)).thenReturn(expected);
    List<Chapter> actual = chapterGetApplication.getAllByBookId(1L);
    assertEquals(expected,actual);
  }
}