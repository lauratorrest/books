package com.api.books.infrastructure.api.controller;

import com.api.books.application.book.BookDeleteApplication;
import com.api.books.application.book.BookGetApplication;
import com.api.books.application.book.BookSaveApplication;
import com.api.books.application.book.BookUpdateApplication;
import com.api.books.infrastructure.api.dto.request.book.BookCreateRequest;
import com.api.books.infrastructure.api.dto.request.book.BookUpdateRequest;
import com.api.books.infrastructure.api.dto.response.book.BookDetailedResponse;
import com.api.books.infrastructure.api.dto.response.book.BookResponse;
import com.api.books.infrastructure.api.mapper.book.BookCreateRequestMapper;
import com.api.books.infrastructure.api.mapper.book.BookDetailedResponseMapper;
import com.api.books.infrastructure.api.mapper.book.BookResponseMapper;
import com.api.books.infrastructure.api.mapper.book.BookUpdateRequestMapper;
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
@RequestMapping("/books")
public class BookController {
  private final BookGetApplication bookGetApplication;
  private final BookSaveApplication bookSaveApplication;
  private final BookUpdateApplication bookUpdateApplication;
  private final BookDeleteApplication bookDeleteApplication;

  private final BookResponseMapper bookResponseMapper;
  private final BookDetailedResponseMapper bookDetailedResponseMapper;
  private final BookCreateRequestMapper bookCreateRequestMapper;
  private final BookUpdateRequestMapper bookUpdateRequestMapper;

  @GetMapping
  public ResponseEntity<List<BookResponse>> getAllBooks(){
    return ResponseEntity.ok(bookResponseMapper.toResponse(bookGetApplication.getAll()));
  }

  @GetMapping("/{id}")
  public ResponseEntity<BookDetailedResponse> getBookById(@PathVariable("id") Long id){
    return ResponseEntity.ok(bookDetailedResponseMapper.toResponse(bookGetApplication.getById(id)));
  }

  @GetMapping("/author/{accountId}")
  public ResponseEntity<List<BookResponse>> getAllBooksByAuthor(@PathVariable("accountId") Long accountId){
    return ResponseEntity.ok(bookResponseMapper.toResponse(bookGetApplication.getAllByAuthor(accountId)));
  }

  @PostMapping
  public ResponseEntity<BookResponse> saveBook(@RequestBody BookCreateRequest bookCreateRequest){
    return ResponseEntity.ok(bookResponseMapper.toResponse(bookSaveApplication.saveBook(
        bookCreateRequestMapper.toEntity(bookCreateRequest)
    )));
  }

  @PutMapping
  public void updateBook(@RequestBody BookUpdateRequest bookUpdateRequest){
    bookUpdateApplication.updateBook(bookUpdateRequestMapper.toEntity(bookUpdateRequest));
  }

  @DeleteMapping("/{id}")
  public void deleteBook(@PathVariable("id") Long id){
    bookDeleteApplication.deleteBook(id);
  }

}
