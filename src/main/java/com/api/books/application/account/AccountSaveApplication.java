package com.api.books.application.account;

import com.api.books.domain.entity.Account;
import com.api.books.domain.service.account.AccountSaveService;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountSaveApplication {
  private final AccountSaveService accountSaveService;

  public Account saveAccount(Account account){
    account.setCreatedDate(LocalDateTime.now());
    return accountSaveService.saveAccount(account);
  }
}
