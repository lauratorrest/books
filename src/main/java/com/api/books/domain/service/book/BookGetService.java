package com.api.books.domain.service.book;

import com.api.books.domain.entity.Book;
import java.util.List;

public interface BookGetService {
  Book getById(Long id);
  List<Book> getAll();
  List<Book> getAllByAccountId(Long accountId);
}
