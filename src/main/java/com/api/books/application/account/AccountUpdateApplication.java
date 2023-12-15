package com.api.books.application.account;

import com.api.books.domain.entity.Account;
import com.api.books.domain.service.account.AccountUpdateService;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountUpdateApplication {
  private final AccountUpdateService accountUpdateService;

  public void updateAccount(Account account){
    account.setUpdatedDate(LocalDateTime.now());
    accountUpdateService.updateAccount(account);
  }
}
