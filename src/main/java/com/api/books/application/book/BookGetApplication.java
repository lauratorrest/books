package com.api.books.application.book;

import com.api.books.domain.entity.Book;
import com.api.books.domain.service.book.BookGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookGetApplication {
  private final BookGetService bookGetService;

  public Book getById(Long id){
    return bookGetService.getById(id);
  }

  public List<Book> getAll(){
    return bookGetService.getAll();
  }

  public List<Book> getAllByAuthor(Long accountId){
    return bookGetService.getAllByAccountId(accountId);
  }

}
