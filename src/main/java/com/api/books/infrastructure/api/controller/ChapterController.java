package com.api.books.infrastructure.api.controller;

import com.api.books.application.chapter.ChapterGetApplication;
import com.api.books.application.chapter.ChapterSaveApplication;
import com.api.books.application.chapter.ChapterUpdateApplication;
import com.api.books.application.chapter.process.ChapterDeleteApplication;
import com.api.books.application.paragraph.ParagraphGetApplication;
import com.api.books.infrastructure.api.dto.request.chapter.ChapterCreateRequest;
import com.api.books.infrastructure.api.dto.request.chapter.ChapterUpdateRequest;
import com.api.books.infrastructure.api.dto.response.chapter.ChapterCompleteResponse;
import com.api.books.infrastructure.api.dto.response.chapter.ChapterListResponse;
import com.api.books.infrastructure.api.mapper.chapter.ChapterCreateRequestMapper;
import com.api.books.infrastructure.api.mapper.chapter.ChapterListResponseMapper;
import com.api.books.infrastructure.api.mapper.chapter.ChapterUpdateRequestMapper;
import com.api.books.infrastructure.api.mapper.paragraph.ParagraphResponseMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/chapters")
public class ChapterController {
  private final ChapterGetApplication chapterGetApplication;
  private final ParagraphGetApplication paragraphGetApplication;
  private final ChapterSaveApplication chapterSaveApplication;
  private final ChapterUpdateApplication chapterUpdateApplication;
  private final ChapterDeleteApplication chapterDeleteApplication;

  private final ChapterListResponseMapper chapterListResponseMapper;
  private final ParagraphResponseMapper paragraphResponseMapper;
  private final ChapterCreateRequestMapper chapterCreateRequestMapper;
  private final ChapterUpdateRequestMapper chapterUpdateRequestMapper;

  @GetMapping("/book/{bookId}")
  public ResponseEntity<List<ChapterListResponse>> getChaptersListByBook(@PathVariable("bookId") Long bookId){
    return ResponseEntity.ok(chapterListResponseMapper.toResponse(chapterGetApplication.getAllByBookId(bookId)));
  }

  @GetMapping("/{id}")
  public ResponseEntity<ChapterCompleteResponse> getEntireChapter(@PathVariable("id") Long id){
    return ResponseEntity.ok(
        ChapterCompleteResponse.builder()
            .id(id)
            .title(chapterGetApplication.getById(id).getTitle())
            .paragraphResponses(paragraphResponseMapper.toResponse(paragraphGetApplication
                .getAllByChapterId(id)))
            .build());
  }

  @PostMapping
  public void saveEntireChapter(@RequestBody ChapterCreateRequest chapterCreateRequest){
    chapterSaveApplication.saveEntireChapter(
        chapterCreateRequestMapper.toEntity(chapterCreateRequest),chapterCreateRequest.getContent()
    );
  }

  @PutMapping
  public void updateEntireChapter(@RequestBody ChapterUpdateRequest chapterUpdateRequest){
    chapterUpdateApplication.updateChapter(chapterUpdateRequestMapper.toEntity(chapterUpdateRequest),
        chapterUpdateRequest.getContent());
  }

  @DeleteMapping("/{id}")
  public void deleteChapter(@PathVariable("id") Long id){
    chapterDeleteApplication.deleteChapterById(id);
  }

}
