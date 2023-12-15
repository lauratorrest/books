package com.api.books.domain.service.account;

import com.api.books.domain.entity.Account;
import java.util.List;

public interface AccountGetService {
  Account getById(Long id);
  List<Account> getAll();
}
