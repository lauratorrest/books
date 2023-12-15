package com.api.books.application.account;

import com.api.books.domain.entity.Account;
import com.api.books.domain.service.account.AccountGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountGetApplication {
  private final AccountGetService accountGetService;

  public Account getById(Long id){
    return accountGetService.getById(id);
  }

  public List<Account> getAll(){
    return accountGetService.getAll();
  }

}
